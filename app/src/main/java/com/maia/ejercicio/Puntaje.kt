package com.maia.ejercicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView

class Puntaje : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puntaje)

        val puntaje = Pregunta1.puntajes
        val text=puntaje.toString()
        val puntajes= findViewById<TextView>(R.id.textPuntaje)

        puntajes.text = text

        val btnRegresar = findViewById<Button>(R.id.btnRegresar)
        btnRegresar.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }





    }
}