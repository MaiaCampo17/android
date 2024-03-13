package com.maia.ejercicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Web : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        val btnphp = findViewById<Button>(R.id.btnPhp)
        btnphp.setOnClickListener {
            val intent = Intent(this,Php::class.java)
            startActivity(intent)
        }
        val btnjavascript = findViewById<Button>(R.id.btnJavaScript)
        btnjavascript.setOnClickListener {
            val intent = Intent(this,Javascript::class.java)
            startActivity(intent)
        }
        val btnpython = findViewById<Button>(R.id.btnPython)
        btnpython.setOnClickListener {
            val intent = Intent(this,Python::class.java)
            startActivity(intent)
        }
    }
}