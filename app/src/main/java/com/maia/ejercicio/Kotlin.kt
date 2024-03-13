package com.maia.ejercicio

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.squareup.picasso.Picasso

class Kotlin : AppCompatActivity() {
    private var mediaPlayer: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        val sonidopython = findViewById<FloatingActionButton>(R.id.sonidoKotlin)
        sonidopython.setOnClickListener {
            mediaPlayer?.stop()
            mediaPlayer = MediaPlayer.create(this, R.raw.kotlin)
            mediaPlayer?.start()
        }

    }

    override fun onPause() {
        super.onPause()
        mediaPlayer?.let {
            it.stop()
            it.release()
            mediaPlayer = null
        }

            //val imagen = findViewById<ImageView>(R.id.imgKotlin)
            //Glide.with(this) .load("https://www.liblogo.com/img-logo/ko114k426-kotlin-logo-kotlin-logo-png-transparent-amp-svg-vector-freebie-supply.png") .into(imagen)

        }
    }
