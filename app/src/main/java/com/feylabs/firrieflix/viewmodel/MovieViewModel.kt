package com.feylabs.firrieflix.viewmodel

import androidx.lifecycle.ViewModel
import com.feylabs.firrieflix.model.MovieModel
import com.feylabs.firrieflix.util.seeder.MovieSeeder

class MovieViewModel : ViewModel() {

    fun getMovie() : MutableList<MovieModel> = MovieSeeder.movieSeeder()

}