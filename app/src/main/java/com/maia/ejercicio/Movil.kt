package com.maia.ejercicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Movil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movil)

        val btnkotlin = findViewById<Button>(R.id.btnKotlin)
        btnkotlin.setOnClickListener {

            val intent =Intent(this,Kotlin::class.java)
            startActivity(intent)
        }
        val btnjava = findViewById<Button>(R.id.btnJava)
        btnjava.setOnClickListener {

            val intent = Intent( this,Java::class.java)
            startActivity(intent)
        }
        val btnswift = findViewById<Button>(R.id.btnSwift)
        btnswift.setOnClickListener {
            val intent = Intent(this,Swift::class.java)
            startActivity(intent)
        }
    }
}