package com.maia.ejercicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Lenguajes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lenguajes)


        val btnmovil = findViewById<Button>(R.id.btnMovil1)
        btnmovil.setOnClickListener {
            val intent = Intent(this, Movil::class.java)
            startActivity(intent)
        }

        val btnweb = findViewById<Button>(R.id.btnWeb1)
        btnweb.setOnClickListener {
            val intent = Intent(this,Web::class.java)
            startActivity(intent)
        }
    }
}