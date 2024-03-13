package com.maia.ejercicio

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val movies: List<Movie>, private val context: Context) :
    RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = movies[position]

        holder.imageMovie.setImageResource(movie.image)
        holder.textTitle.text = movie.title
        holder.textYear.text = movie.year.toString()




    }
    override fun getItemCount(): Int {
        return movies.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageMovie: ImageView = itemView.findViewById(R.id.image_movie)
        val textTitle: TextView = itemView.findViewById(R.id.text_title)
        val textYear: TextView = itemView.findViewById(R.id.text_year)
    }
}
