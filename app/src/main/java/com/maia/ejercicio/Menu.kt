package com.maia.ejercicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnlenguajes = findViewById<Button>(R.id.btnLenguajes)
        btnlenguajes.setOnClickListener {
            val intent = Intent(this, Lenguajes::class.java)
            startActivity(intent)


        }
        val btnframeworks = findViewById<Button>(R.id.btnFrameworks)
        btnframeworks.setOnClickListener {
            val intent = Intent(this, Frameworks::class.java)
            startActivity(intent)
        }

        val btnpreguntas = findViewById<Button>(R.id.btnPreguntas)
        btnpreguntas.setOnClickListener {
            val intent = Intent(this, Pregunta1::class.java)
            startActivity(intent)
        }
        val btncalculadora = findViewById<Button>(R.id.btnCalculadora)
        btncalculadora.setOnClickListener {
            val intent = Intent(this, Calculadora::class.java)
            startActivity(intent)
        }
        val btnpeli = findViewById<Button>(R.id.btnPeliculas)
        btnpeli.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }



    }
}