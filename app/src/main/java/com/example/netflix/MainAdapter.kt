package com.example.netflix

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.netflix.model.Movie

class mainAdapter(private val movies: List<Movie>): RecyclerView.Adapter<mainAdapter.movieViewHolder>() {

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): movieViewHolder {
         val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
         return movieViewHolder(view)
     }

     override fun onBindViewHolder(holder: movieViewHolder, position: Int) {
        val movie = movies[position]
         holder.bind(movie)
     }

     override fun getItemCount(): Int {
         return movies.size
     }

     inner class movieViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(movie: Movie){
            val imageCover : ImageView = itemView.findViewById(R.id.image_cover)
            imageCover.setImageResource(movie.coverUrl)
        }
     }
 }