package com.maia.ejercicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import com.airbnb.lottie.LottieAnimationView

class Ingresar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar)
        val nombre = findViewById<EditText>(R.id.nombre)
        val alias = findViewById<EditText>(R.id.alias)
        val edad = findViewById<EditText>(R.id.edad)
        val direccion = findViewById<EditText>(R.id.direccion)
        val tele = findViewById<EditText>(R.id.telefono)



        val btnconti = findViewById<Button>(R.id.btnContinuar)

        btnconti.setOnClickListener {

            val animation = findViewById<LottieAnimationView>(R.id.animationView)
            val layoutcontent = findViewById<LinearLayout>(R.id.layoutcontent)

            layoutcontent.visibility  = View.GONE

            animation.visibility = View.VISIBLE
            animation.playAnimation()
            animation.loop(true)

            val sleep = Thread{
                Thread.sleep(2000)
                runOnUiThread{
                    val intent = Intent(this, Bienvenida::class.java)
                    intent.putExtra("nombre", nombre.text.toString())
                    intent.putExtra("alias", alias.text.toString())
                    intent.putExtra("edad", edad.text.toString())
                    intent.putExtra("direccion", direccion.text.toString())
                    intent.putExtra("telefono", tele.text.toString())
                    startActivity(intent)
                }
            }


            sleep.start()
        }
        val rgGenero = findViewById<RadioGroup>(R.id.genero)
        val idioma1= findViewById<CheckBox>(R.id.Español)
        val idioma2 = findViewById<CheckBox>(R.id.Ingles)
        val idioma3 = findViewById<CheckBox>(R.id.Aleman)
        val idioma4 = findViewById<CheckBox>(R.id.Frances)

        idioma1.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                Toast.makeText(this, "Selecciono el idioma Español", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText( this,"Quita la seleccion del idioma", Toast.LENGTH_SHORT).show()
            }
        }

        idioma2.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                Toast.makeText(this, "Selecciono el idioma Ingles", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText( this,"Quita la seleccion del Ingles", Toast.LENGTH_SHORT).show()
            }
        }
        idioma3.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                Toast.makeText(this, "Selecciono el idioma Aleman", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText( this,"Quita la seleccion del Aleman", Toast.LENGTH_SHORT).show()
            }
        }
        idioma4.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                Toast.makeText(this, "Selecciono el idioma Frances", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText( this,"Quita la seleccion del Frances", Toast.LENGTH_SHORT).show()
            }
        }

        rgGenero.setOnCheckedChangeListener { radioGroup, id ->
            if (id == R.id.Femenino){
                Toast.makeText(this, "Usted selecciono femenino", Toast.LENGTH_SHORT).show()
            }
            else{

                Toast.makeText(this, "usted selecciono masculino ", Toast.LENGTH_SHORT).show()
            }
        }


    }


}




