package com.riskv5

import android.Manifest
import android.content.pm.PackageManager
import android.graphics.Color

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import com.google.android.gms.maps.model.CircleOptions



class MainActivity : AppCompatActivity(),  OnMapReadyCallback, GoogleMap.OnMyLocationButtonClickListener, GoogleMap.OnMapClickListener{

    private lateinit var map: GoogleMap

    companion object {
        const val REQUEST_CODE_LOCATION = 0
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createFragment()





    }


    private fun createFragment() {
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

        override fun onMapReady(googleMap: GoogleMap) {

        map = googleMap
        createMarker1()
        map.mapType = GoogleMap.MAP_TYPE_HYBRID
        map.setOnMyLocationButtonClickListener(this)
        map.setOnMapClickListener(this)
        enableLocatio()
            createCircles1()
            createCircles2()
            createCircles3()
            createCircles4()
            createCircles5()
            createCircles6()
            createCircles7()
            createCircles8()
            createCircles9()
            createCircles10()
            createCircles11()
            createCircles12()
            createCircles13()
            createCircles14()
            createCircles15()
            createCircles16()
            createCircles17()
            createCircles18()
            createCircles19()
            createCircles20()
            createCircles21()
            createCircles22()
            createCircles23()
            createCircles24()
            createCircles25()
            createCircles26()
            createCircles27()
            createCircles28()
            createCircles29()
            createCircles30()
            createCircles31()
            createCircles32()
            createCircles33()
            createCircles34()
            createCircles35()
            createCircles36()
            createCircles37()
            createCircles38()
            createCircles39()
            createCircles40()
            createCircles41()
            createCircles42()
            createCircles43()
            createCircles44()
            createCircles45()
            createCircles46()
            createCircles47()
            createCircles48()
            createCircles49()
            createCircles50()
            createCircles51()
            createCircles52()
            createCircles53()
            createCircles54()
            createCircles55()
            createCircles56()
            createCircles57()
            createCircles58()
            createCircles59()
            createCircles60()
            createCircles61()
            createCircles62()
            createCircles63()
            createCircles64()
            createCircles65()
            createMarker1()
            createMarker2()
            createMarker3()
            createMarker4()
            createMarker5()
            createMarker6()
            createMarker7()
            createMarker8()
            createMarker9()
            createMarker10()
            createMarker11()
            createMarker12()
            createMarker13()
            createMarker14()
            createMarker15()
            createMarker16()
            createMarker17()
            createMarker18()
            createMarker19()
            createMarker20()
            createMarker21()
            createMarker22()
            createMarker23()
            createMarker24()
            createMarker25()
            createMarker26()
            createMarker27()
            createMarker28()
            createMarker29()
            createMarker30()
            createMarker31()
            createMarker32()
            createMarker33()
            createMarker34()
            createMarker35()
            createMarker36()
            createMarker37()
            createMarker39()
            createMarker40()
            createMarker41()
            createMarker42()
            createMarker43()
            createMarker44()
            createMarker45()
            createMarker46()
            createMarker47()
            createMarker49()
            createMarker50()
            createMarker51()
            createMarker52()
            createMarker53()
            createMarker54()
            createMarker55()
            createMarker56()
            createMarker57()
            createMarker59()
            createMarker60()
            createMarker61()
            createMarker62()
            createMarker63()
            createMarker64()
            createMarker65()
            createCircles1()
    }

    private fun createCircles1(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(19.29217649799036, -98.91114525501752))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker1() {
        val coordinates = LatLng(19.29217649799036, -98.91114525501752)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles2(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(64.41186323765652, -149.5118845075572))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker2() {
        val coordinates = LatLng(64.41186323765652, -149.5118845075572)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles3(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(32.574804614126435, -86.91460689961323 ))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker3() {
        val coordinates = LatLng(32.574804614126435, -86.91460689961323)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }

    private fun createCircles4(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(35.43259206730451, -91.84876363310677 ))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker4() {
        val coordinates = LatLng(35.43259206730451, -91.84876363310677)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles5(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(-14.198895899282794, -170.13174781299745 ))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker5() {
        val coordinates = LatLng(-14.198895899282794, -170.13174781299745)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles6(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(34.54018761635567, -111.08501964734673))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker6() {
        val coordinates = LatLng(34.54018761635567, -111.08501964734673)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }
    private fun createCircles7(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(34.54018761635567, -111.08501964734673))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker7() {
        val coordinates = LatLng(34.54018761635567, -111.08501964734673)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }



    private fun createCircles8(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(34.26945995517579, -112.09731963120913))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker8() {
        val coordinates = LatLng(34.26945995517579, -112.09731963120913)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles9(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(37.411451173134665, -119.40580506309998))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker9() {
        val coordinates = LatLng(37.411451173134665, -119.40580506309998)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles10(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(39.80848890569925, -105.76207039101587))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker10() {
        val coordinates = LatLng(39.80848890569925, -105.76207039101587)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }

////////////////////////////////////////////////////////////////////////////////////////////////////

    private fun createCircles11(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(19.29217649799036, -98.91114525501752))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker11() {
        val coordinates = LatLng(19.29217649799036, -98.91114525501752)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles12(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(41.64939808101206, -73.08726732345804))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker12() {
        val coordinates = LatLng(41.64939808101206, -73.08726732345804)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles13(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(38.92626326051023, -77.03655983223176))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker13() {
        val coordinates = LatLng(38.92626326051023, -77.03655983223176)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }

    private fun createCircles14(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(38.925561815417964, -77.03381393340828))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker14() {
        val coordinates = LatLng(38.925561815417964, -77.03381393340828)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles15(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(39.04181952726745, -75.55215279066479))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker15() {
        val coordinates = LatLng(39.04181952726745, -75.55215279066479)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles16(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(28.279561975212737, -81.68783128662042))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker16() {
        val coordinates = LatLng(28.279561975212737, -81.68783128662042)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }
    private fun createCircles17(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(8.466699198431392, 150.65344603673003))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker17() {
        val coordinates = LatLng(8.466699198431392, 150.65344603673003)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }



    private fun createCircles18(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(42.56649954837394, 43.344132466667034))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker18() {
        val coordinates = LatLng(42.56649954837394, 43.344132466667034)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles19(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(13.47870389874889, 144.78876331793845))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker19() {
        val coordinates = LatLng(13.47870389874889, 144.78876331793845)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles20(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(20.249889813232713, -155.63007674617148))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker20() {
        val coordinates = LatLng(20.249889813232713, -155.63007674617148)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////

    private fun createCircles21(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(42.09607439606641, -93.11770661414293))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker21() {
        val coordinates = LatLng(42.09607439606641, -93.11770661414293)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles22(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(44.473209607511464, -114.78856240867384))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker22() {
        val coordinates = LatLng(44.473209607511464, -114.78856240867384)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles23(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(48.79405352149447, -112.98747310102178))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker23() {
        val coordinates = LatLng(48.79405352149447, -112.98747310102178)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }

    private fun createCircles24(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(41.05908865801524, -89.25490907504036))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker24() {
        val coordinates = LatLng(41.05908865801524, -89.25490907504036)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles25(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(40.526070865832665, -86.09242720750358))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker25() {
        val coordinates = LatLng(40.526070865832665, -86.09242720750358)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles26(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(39.27278971991416, -98.44372308822467))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker26() {
        val coordinates = LatLng(39.27278971991416, -98.44372308822467)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }
    private fun createCircles27(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(38.08691883603541, -84.29891096594244))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker27() {
        val coordinates = LatLng(38.08691883603541, -84.29891096594244)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }



    private fun createCircles28(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(31.27544158721136, -91.99738129919083))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker28() {
        val coordinates = LatLng(31.27544158721136, -91.99738129919083)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles29(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(42.5151539211036, -71.38753448077955))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker29() {
        val coordinates = LatLng(42.5151539211036, -71.38753448077955)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles30(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(39.153905275866535, -76.6334241637449))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker30() {
        val coordinates = LatLng(39.153905275866535, -76.6334241637449)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////

    private fun createCircles31(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(45.778769349159916, -69.5424420417489))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker31() {
        val coordinates = LatLng(45.778769349159916, -69.5424420417489)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles32(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(7.888369966075299, 171.1761191495148))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker32() {
        val coordinates = LatLng(7.888369966075299, 171.1761191495148)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles33(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(47.196597278180924, -94.62165333847926))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker33() {
        val coordinates = LatLng(47.196597278180924, -94.62165333847926)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }

    private fun createCircles34(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(38.24015683911637, -91.86861805431124))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker34() {
        val coordinates = LatLng(38.24015683911637, -91.86861805431124)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles35(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(15.70569702640443, 145.754935550578))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker35() {
        val coordinates = LatLng(15.70569702640443, 145.754935550578)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles36(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(32.56968337037078, -89.46212583741904))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker36() {
        val coordinates = LatLng(32.56968337037078, -89.46212583741904)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }
    private fun createCircles37(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(47.28188957688491, -110.38198334479216))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker37() {
        val coordinates = LatLng(47.28188957688491, -110.38198334479216)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }



    private fun createCircles38(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(36.00760462215341, -79.00706481656124))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarke38() {
        val coordinates = LatLng(36.00760462215341, -79.00706481656124)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles39(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(47.76444931311735, -100.98559438425833))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker39() {
        val coordinates = LatLng(47.76444931311735, -100.98559438425833)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles40(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(41.774651756612116, -99.9471704936381))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker40() {
        val coordinates = LatLng(41.774651756612116, -99.9471704936381)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////

    private fun createCircles41(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(43.23165033229717, -71.59053633668613))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker41() {
        val coordinates = LatLng(43.23165033229717, -71.59053633668613)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles42(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(40.110237723733455, -74.40841194961654))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker42() {
        val coordinates = LatLng(40.110237723733455, -74.40841194961654)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles43(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(34.57425203073444, -105.92863400833313))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker43() {
        val coordinates = LatLng(34.57425203073444, -105.92863400833313)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }

    private fun createCircles44(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(38.896595899311116, -116.4845900076297))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker44() {
        val coordinates = LatLng(338.896595899311116, -116.4845900076297)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles45(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(43.32708666804236, -74.22347971110055))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker45() {
        val coordinates = LatLng(43.32708666804236, -74.22347971110055)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles46(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(40.450487982574046, -82.93559742279096))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker46() {
        val coordinates = LatLng(40.450487982574046, -82.93559742279096)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }
    private fun createCircles47(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(35.054828053615466, -97.09357792775228))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker47() {
        val coordinates = LatLng(35.054828053615466, -97.09357792775228)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }



    private fun createCircles48(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(43.846821183204014, -120.56384297106591))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarke48() {
        val coordinates = LatLng(43.846821183204014, -120.56384297106591)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles49(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(41.244077887168245, -77.21181316223907))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker49() {
        val coordinates = LatLng(41.244077887168245, -77.21181316223907)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles50(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(18.2574016015766, -66.59227349963844))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker50() {
        val coordinates = LatLng(18.2574016015766, -66.59227349963844)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////

    private fun createCircles51(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(41.58472417942721, -71.47885874734375))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker51() {
        val coordinates = LatLng(41.58472417942721, -71.47885874734375)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles52(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(7.552444801208526, 134.61115861053554))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker52() {
        val coordinates = LatLng(7.552444801208526, 134.61115861053554)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles53(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(33.89654488014526, -81.19338307218322))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker53() {
        val coordinates = LatLng(33.89654488014526, -81.19338307218322)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }

    private fun createCircles54(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(44.00928286773383, -99.90899723475438))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker54() {
        val coordinates = LatLng(44.00928286773383, -99.90899723475438)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles55(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(35.532989742463386, -86.58581099786741))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker55() {
        val coordinates = LatLng(35.532989742463386, -86.58581099786741)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles56(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(32.00832033575031, -99.93648434146183))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker56() {
        val coordinates = LatLng(32.00832033575031, -99.93648434146183)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }
    private fun createCircles57(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(39.36231269150112, -111.14001415909568))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker57() {
        val coordinates = LatLng(39.36231269150112, -111.14001415909568)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }



    private fun createCircles58(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(37.46938303948599, -78.64372314068423))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarke58() {
        val coordinates = LatLng(37.46938303948599, -78.64372314068423)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles59(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(38.86067665109502, -76.9959529781961))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker59() {
        val coordinates = LatLng(38.86067665109502, -76.9959529781961)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles60(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(18.342537909572226, -64.90644541801396))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker60() {
        val coordinates = LatLng(18.342537909572226, -64.90644541801396)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////

    private fun createCircles61(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(44.56704576305806, -72.58944019720346))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker61() {
        val coordinates = LatLng(44.56704576305806, -72.58944019720346)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles62(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(38.90809883450107, -77.03793312323974))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker62() {
        val coordinates = LatLng(38.90809883450107, -77.03793312323974)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles63(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(43.86985942622577, -88.80878276498918))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker63() {
        val coordinates = LatLng(43.86985942622577, -88.80878276498918)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }

    private fun createCircles64(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(38.650305529542585, -80.47010320641992))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker64() {
        val coordinates = LatLng(38.650305529542585, -80.47010320641992)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun createCircles65(){
        val circle = map.addCircle(
            CircleOptions()
                .center(LatLng(43.08281382497095, -107.32634795260041))
                .radius(500.0)
                .strokeWidth(10f)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 255, 0, 0))
                .clickable(true)
        )
        map.setOnCircleClickListener {
            // Flip the r, g and b components of the circle's stroke color.
            val strokeColor = it.strokeColor xor 0x00ffffff
            it.strokeColor = strokeColor
        }
    }

    private fun createMarker65() {
        val coordinates = LatLng(43.08281382497095, -107.32634795260041)
        map.addMarker(MarkerOptions()

            .position(coordinates)
            .title("ZONA DE ALTO RIESGO !")
        )
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 18f) ,
            4000,
            null

        )
    }


    private fun isLocationPermissionGranted() = ContextCompat.checkSelfPermission(
        this,
        Manifest.permission.ACCESS_FINE_LOCATION
    ) == PackageManager.PERMISSION_GRANTED

    private fun enableLocatio() {
        if (!::map.isInitialized) return
        if (isLocationPermissionGranted()) {
            if (ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return
            }
            if (ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return
            }
            map.isMyLocationEnabled = true
        } else {
            requestLocationPermission()

        }
    }

    private fun requestLocationPermission() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            )
        ) {
            Toast.makeText(this, "Ve a ajustes y acepta los permisos", Toast.LENGTH_SHORT).show()
        } else {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), REQUEST_CODE_LOCATION
            )
        }
    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when(requestCode){
            REQUEST_CODE_LOCATION -> if(grantResults.isNotEmpty()&& grantResults[0]==PackageManager.PERMISSION_GRANTED){
                if (ActivityCompat.checkSelfPermission(
                        this,
                        Manifest.permission.ACCESS_FINE_LOCATION
                    ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                        this,
                        Manifest.permission.ACCESS_COARSE_LOCATION
                    ) != PackageManager.PERMISSION_GRANTED
                ) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return
                }
                map.isMyLocationEnabled = true
            }else{ Toast.makeText(this, "Acepta los permisos de localizacion", Toast.LENGTH_SHORT).show()
        }
            else ->{}
        }

    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return
        }
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return
        }
        if (!::map.isInitialized)return
        if (!isLocationPermissionGranted())
            map.isMyLocationEnabled = false
         Toast.makeText(this, "Acepta los permisos de localizacion", Toast.LENGTH_SHORT).show()
    }

    override fun onMyLocationButtonClick(): Boolean {
        Toast.makeText(this, "Auch!", Toast.LENGTH_SHORT).show()
       return false
    }

    override fun onMapClick(p0: LatLng?) {
        if (p0 != null) {
            Toast.makeText(this, "Estas aqui! ${p0.latitude}, ${p0.longitude} ", Toast.LENGTH_SHORT).show()
        }
    }
}
