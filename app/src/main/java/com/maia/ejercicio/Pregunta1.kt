package com.maia.ejercicio

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pregunta1 : AppCompatActivity() {

    companion object{
        var puntajes = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_pregunta1)
        val sonidopre = findViewById<Button>(R.id.SonidoPhp)
        sonidopre.setOnClickListener {
            val sonido1=MediaPlayer.create(this,R.raw.mal)
            sonido1.start()
            puntajes= puntajes - 20
        }
        val sondiopre2= findViewById<Button>(R.id.SonidoLaravel)
        sondiopre2.setOnClickListener {
            val sonido2=MediaPlayer.create(this,R.raw.mal)
            sonido2.start()
            puntajes= puntajes - 20
        }
        val sonidopre3 = findViewById<Button>(R.id.SonidoKotlin)
        sonidopre3.setOnClickListener {
            val sonido3 = MediaPlayer.create(this,R.raw.bien)
            sonido3.start()

            val intent = Intent (this, Pregunta2 :: class.java)
            startActivity(intent)

            puntajes= puntajes + 20
        }
        val sonidopre4 = findViewById<Button>(R.id.SonidoJavaScript)
        sonidopre4.setOnClickListener {
            val sonido4 = MediaPlayer.create(this,R.raw.mal)
            sonido4.start()
            puntajes= puntajes - 20

        }







    }

}






