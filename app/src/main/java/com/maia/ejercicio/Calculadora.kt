package com.maia.ejercicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.ViewStubCompat.OnInflateListener

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        var precio = findViewById<TextView>(R.id.precio)
        val mostrar = findViewById<TextView>(R.id.mostrarDescuento)
        val total = findViewById<EditText>(R.id.total)


        val productos = findViewById<RadioGroup>(R.id.Productos)
        productos.setOnCheckedChangeListener { radioGroup, id ->

            val precioTv = 2000000
            val precioRadio = 50000
            if (id == R.id.Televisor){
                Toast.makeText(this, "Usted selecciono el producto Televisor ", Toast.LENGTH_SHORT).show()
                precio.setText(precioTv.toString())
            }
            else{
                Toast.makeText(this, "usted selecciono el producto Radio", Toast.LENGTH_SHORT).show()
                precio.setText(precioRadio.toString())
            }
        }



        val descu = findViewById<CheckBox>(R.id.Descuento)
        descu.setOnCheckedChangeListener { compoundButton, b ->

            if (b) {
                Toast.makeText(this, "Selecciono el descuento", Toast.LENGTH_SHORT).show()
                val resultado = precio.text.toString()
                val des = resultado.toDouble()
                val res = des * 0.10
                mostrar.setText(res.toString())

            }

        }

        val btnCalcular = findViewById<Button>(R.id.Calcula)
        btnCalcular.setOnClickListener {
            val precio = precio.text.toString()
            val num1 = precio.toDouble()

            val valor2 = mostrar.text.toString()
            val num2 = valor2.toDouble()

            val resultado = num1 - num2
            total.setText(resultado.toString())
        }




    }

}
