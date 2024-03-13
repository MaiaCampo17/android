package com.maia.ejercicio

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.squareup.picasso.Picasso

class Java : AppCompatActivity() {
    private var mediaPlayer: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java)

        val sonidopython = findViewById<FloatingActionButton>(R.id.sonidoJava)
        sonidopython.setOnClickListener {
            mediaPlayer?.stop()
            mediaPlayer = MediaPlayer.create(this, R.raw.java)
            mediaPlayer?.start()
        }
        val imagen = findViewById<ImageView>(R.id.imgJava)
        Picasso.get() .load("https://cdn-icons-png.flaticon.com/512/226/226777.png") .into(imagen)

    }
    override fun onPause() {
        super.onPause()
        mediaPlayer?.let {
            it.stop()
            it.release()
            mediaPlayer = null
        }
    }


    }



