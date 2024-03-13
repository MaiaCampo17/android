package com.maia.ejercicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Bienvenida : AppCompatActivity() {

    companion object {
        var nombre: String = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)

        val reciNombre= findViewById<TextView>(R.id.recibirNombre)
        val reciAlias = findViewById<TextView>(R.id.recibirAlias)
        val reciEdad = findViewById<TextView>(R.id.recibirEdad)
        val reciDireccion= findViewById<TextView>(R.id.recibirDirec)
        val reciTelefono = findViewById<TextView>(R.id.recibirTele)

        val recibirNombre =intent.getStringExtra("nombre")
        val recibirAlias = intent.getStringExtra("alias")
        val recibirEdad = intent.getStringExtra("edad")
        val recibirDireccion =intent.getStringExtra("direccion")
        val recibirTelefono = intent.getStringExtra("telefono")

        reciNombre.text = recibirNombre
        reciAlias.text = recibirAlias
        reciEdad.text = recibirEdad
        reciDireccion.text = recibirDireccion
        reciTelefono.text= recibirTelefono

        val btnsigueinte = findViewById<Button>(R.id.btnIniciar)
        btnsigueinte.setOnClickListener {

            nombre = recibirNombre.toString()
            val intent = Intent (this, Menu :: class.java)
            startActivity(intent)
        }


    }


}