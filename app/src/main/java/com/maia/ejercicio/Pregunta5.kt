package com.maia.ejercicio

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView

class Pregunta5 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta5)


        val sonidophp = findViewById<Button>(R.id.SonPhp1)
        sonidophp.setOnClickListener {
            val sonido = MediaPlayer.create(this, R.raw.bien)
            sonido.start()

            Pregunta1.puntajes += 20

            val animatioEnd = findViewById<LottieAnimationView>(R.id.animationEnd)
            val layautContent = findViewById<LinearLayout>(R.id.layoutContent)


            layautContent.visibility = View.GONE

            animatioEnd.visibility = View.VISIBLE
            animatioEnd.playAnimation()
            animatioEnd.loop(true)

            val sleep = Thread {
                Thread.sleep(2000)
                runOnUiThread {
                    val intent = Intent(this, Puntaje::class.java)
                    startActivity(intent)
                }
            }
            sleep.start()


            val sonidojavascript = findViewById<Button>(R.id.SonJavaScript1)

            sonidojavascript.setOnClickListener {
                val sonido1 = MediaPlayer.create(this, R.raw.mal)
                sonido1.start()

                Pregunta1.puntajes -= 20
            }

            val sonidokotlin = findViewById<Button>(R.id.SonKotlin1)
            sonidokotlin.setOnClickListener {
                val sonido2 = MediaPlayer.create(this, R.raw.mal)
                sonido2.start()
                Pregunta1.puntajes -= 20
            }

            val sonidolaravel = findViewById<Button>(R.id.SonLaravel1)
            sonidolaravel.setOnClickListener {
                val sonido3 = MediaPlayer.create(this, R.raw.mal)
                sonido3.start()
                Pregunta1.puntajes -= 20
            }




        }
    }
}