package com.maia.ejercicio


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Lista de películas
        val movies = listOf(
            Movie("El Rey León", 1994, R.drawable.reyleon),
            Movie("Toy Story", 1995, R.drawable.toystory),
            Movie("Buscando a Nemo", 2003, R.drawable.buscandoanemo),
            Movie("Valiente", 2012, R.drawable.valiente),
            Movie("Intensamente", 2015, R.drawable.intensamente),
            Movie("Coco", 2017, R.drawable.coco),
            Movie("Luca", 2021, R.drawable.luca),
            Movie("Cómo Entrenar a Tu Dragón", 2010, R.drawable.dragon),
            Movie("Zootopia", 2016, R.drawable.zootopia),
            Movie("Enredados", 2010, R.drawable.enredados),
        )

        // Configuración del RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = MovieAdapter(movies, this) // Pass the context from MainActivity2
        recyclerView.adapter = adapter

    }
}
