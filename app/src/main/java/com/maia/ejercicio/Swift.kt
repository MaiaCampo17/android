package com.maia.ejercicio

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Swift : AppCompatActivity() {
    private var mediaPlayer: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swift)


        val sonidopython = findViewById<FloatingActionButton>(R.id.sonidoSwift)
        sonidopython.setOnClickListener {
            mediaPlayer?.stop()
            mediaPlayer = MediaPlayer.create(this, R.raw.swift)
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
    }
}