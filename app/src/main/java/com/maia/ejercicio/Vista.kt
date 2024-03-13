package com.maia.ejercicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso

class Vista : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_vista)


        val fuente2=findViewById<TextView>(R.id.txtTitulo1)
        fuente2.typeface = ResourcesCompat.getFont(this,R.font.fuente3)

        /*btnsiguiente.setOnClickListener {
            val intent = Intent(this, Ingresar::class.java)
            startActivity(intent)
        }*/

        val imagen = findViewById<ImageView>(R.id.imgImagen1)
        //Picasso.get() .load("https://cdn.computerhoy.com/sites/navi.axelspringer.es/public/media/image/2014/07/49303-ranking-lenguajes-programacion.jpg?tf=3840x") .into(imagen)
        //Glide.with(this) .load("https://visme.co/blog/wp-content/uploads/2020/02/header-1200.gif") .into(imagen)


        val splashTimeout =3000L
        val handler =Handler(Looper.getMainLooper())

        handler.postDelayed({
            startActivity(Intent(this@Vista,Ingresar::class.java))
            finish()
        },splashTimeout)
    }

}