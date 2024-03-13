package com.maia.ejercicio

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Python : AppCompatActivity() {

    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_python)

        val sonidopython = findViewById<FloatingActionButton>(R.id.sonidoPython)
        sonidopython.setOnClickListener {
            mediaPlayer?.stop()
            mediaPlayer = MediaPlayer.create(this, R.raw.python)
            mediaPlayer?.start()
        }

        val imagen = findViewById<ImageView>(R.id.imgPython)
        Glide.with(this)
            .load("https://static.wikia.nocookie.net/programa/images/e/e4/Python.png/revision/latest?cb=20161203141448&path-prefix=es")
            .into(imagen)
    }

    override fun onPause() {
        super.onPause()
        mediaPlayer?.let { // Use a safe null check
            it.stop()
            it.release()
            mediaPlayer = null
        }
    }
}
