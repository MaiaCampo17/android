package com.maia.ejercicio

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pregunta3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta3)

        val sonidopre = findViewById<Button>(R.id.SonPhp)
        sonidopre.setOnClickListener {
            val sonido1= MediaPlayer.create(this,R.raw.mal)
            sonido1.start()
            Pregunta1.puntajes -= 20
        }
        val sondiopre2= findViewById<Button>(R.id.SonLaravel)
        sondiopre2.setOnClickListener {
            val sonido2= MediaPlayer.create(this,R.raw.mal)
            sonido2.start()
            Pregunta1.puntajes -= 20
        }
        val sonidopre3 = findViewById<Button>(R.id.SonKotlin)
        sonidopre3.setOnClickListener {
            val sonido3 = MediaPlayer.create(this,R.raw.mal)
            sonido3.start()
            Pregunta1.puntajes -= 20
        }

        val sonidopre4 = findViewById<Button>(R.id.SonJavaScript)
        sonidopre4.setOnClickListener {
            val sonido4 = MediaPlayer.create(this,R.raw.bien)
            sonido4.start()

            Pregunta1.puntajes += 20

            val intent = Intent (this, Pregunta4 :: class.java)
            startActivity(intent)



        }


    }

}
