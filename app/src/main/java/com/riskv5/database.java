package com.riskv5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class database extends AppCompatActivity {

    EditText Province_State;
    Button consultar;
    TextView conf,dea,act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

        Province_State=(EditText)findViewById(R.id.txtProvince_State);
        consultar=(Button) findViewById(R.id.btnconsultar);
        conf=(TextView)findViewById(R.id.lblConfirmed) ;
        dea=(TextView)findViewById(R.id.lblDeaths) ;
        act=(TextView)findViewById(R.id.lblActive) ;

        consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                consultarpais();
            }
        });


    }

    public Connection conecta(){
        Connection cnn= null;

        try{
            StrictMode.ThreadPolicy politica = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(politica);

            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
            cnn = DriverManager.getConnection("jdbc:jtds:sqlserver://holaspace.database.windows.net:1433;DatabaseName=spaceAPp;user=spaceadmin@holaspace;password={SpaceApp1234};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
        }
        return cnn;
    }

    public void consultarpais(){
        try{
            Statement stm=conecta().createStatement();

            ResultSet rs=stm.executeQuery( "SELECT * FROM consultarpais WHERE Province_State='"+Province_State.getText().toString()+"'");
            if(rs.next()){
                conf.setText(rs.getString( 2));
                dea.setText(rs.getString( 3));
                act.setText(rs.getString( 4));

            }
            else{
                Toast.makeText(getApplicationContext(),"No hay Registros" ,Toast.LENGTH_SHORT).show();

            }

            Province_State.setText("");
        }
        catch (SQLException e){
            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }
}