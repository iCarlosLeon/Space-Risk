package com.riskv5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class interfaz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interfaz)

        val boton1 = findViewById<Button>(R.id.acerca)
        boton1.setOnClickListener {
            val intento1 = Intent(this, database::class.java).apply { startActivity(this) }
        }

            val boton2 = findViewById<Button>(R.id.boton_mapa)
            boton2.setOnClickListener {
                val intento2 = Intent(this, MainActivity::class.java)
                startActivity(intento2)
            }
        }
    }



