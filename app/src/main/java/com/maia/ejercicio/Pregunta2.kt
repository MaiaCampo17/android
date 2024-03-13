package com.maia.ejercicio

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat

class Pregunta2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta2)

        val fuente2=findViewById<TextView>(R.id.txtPregunta2)
        fuente2.typeface = ResourcesCompat.getFont(this,R.font.fuente3)


        val res = findViewById<Button>(R.id.SonidoPhp)
        res.setOnClickListener {
            val res1 = MediaPlayer.create(this, R.raw.bien)
            res1.start()

            val intent = Intent (this, Pregunta3 :: class.java)
            startActivity(intent)

            Pregunta1.puntajes += 20
        }
        val res1 = findViewById<Button>(R.id.SonidoLaravel)
        res1.setOnClickListener {
            val respuesta = MediaPlayer.create(this,R.raw.mal)
            respuesta.start()
            Pregunta1.puntajes -= 20
        }
        val res2 = findViewById<Button>(R.id.SonidoKotlin)
        res2.setOnClickListener {
            val respuesta1= MediaPlayer.create(this,R.raw.mal)
            respuesta1.start()
            Pregunta1.puntajes -= 20
        }
        val res3 = findViewById<Button>(R.id.SonidoJavaScript)
        res3.setOnClickListener {
            val respuesta2 = MediaPlayer.create(this,R.raw.mal)
            respuesta2.start()
            Pregunta1.puntajes -= 20
        }



    }

}
