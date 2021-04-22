package com.feylabs.firrieflix.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.feylabs.firrieflix.R
import com.feylabs.firrieflix.databinding.ItemMovieBinding
import com.feylabs.firrieflix.model.MovieModel
import com.feylabs.firrieflix.model.ShowModel

class ShowAdapter : RecyclerView.Adapter<ShowAdapter.ShowViewHolder>()  {

    val listMovie = mutableListOf<ShowModel>()

    fun setData(setterMovie : MutableList<ShowModel>){
        listMovie.clear()
        listMovie.addAll(setterMovie)
        notifyDataSetChanged()
    }

    inner class ShowViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val vbind = ItemMovieBinding.bind(view)

        fun bind(model: ShowModel){
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie,parent,false)
        return  ShowViewHolder(view)
    }

    override fun onBindViewHolder(holder: ShowViewHolder, position: Int) {
        holder.bind(listMovie[position])
    }

    override fun getItemCount(): Int {
        return listMovie.size
    }
}