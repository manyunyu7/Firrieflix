package com.feylabs.firrieflix.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.feylabs.firrieflix.R
import com.feylabs.firrieflix.databinding.ItemMovieBinding
import com.feylabs.firrieflix.model.MovieModel

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>()  {

    val listMovie = mutableListOf<MovieModel>()

    lateinit var movieInterface: MovieInterface

    fun setData(setterMovie : MutableList<MovieModel>){
        listMovie.clear()
        listMovie.addAll(setterMovie)
        notifyDataSetChanged()
    }

    fun setMyMovieInterface(interfaceMovie : MovieInterface){
        this.movieInterface=interfaceMovie
    }


    inner class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val vbind = ItemMovieBinding.bind(view)

        fun bind(model: MovieModel){

            vbind.root.setOnClickListener {
                movieInterface.onclick()
            }

            vbind.apply {
                labelMovieTitle.text = model.title
                labelMovieDesc.text=model.description
                labelMovieDirector.text = "by ${model.director}"
                labelMovieDate.text = "${model.releaseDate}"
            }
            Glide
                .with(vbind.root)
                .load(model.img_link)
                .centerCrop()
                .into(vbind.imgCover)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie,parent,false)
        return  MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(listMovie[position])
    }

    override fun getItemCount(): Int {
        return listMovie.size
    }

    interface MovieInterface{
        fun onclick()
    }
}