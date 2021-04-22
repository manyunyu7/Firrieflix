package com.feylabs.firrieflix.viewmodel

import androidx.lifecycle.ViewModel
import com.feylabs.firrieflix.model.MovieModel
import com.feylabs.firrieflix.model.ShowModel
import com.feylabs.firrieflix.util.seeder.MovieSeeder
import com.feylabs.firrieflix.util.seeder.ShowSeeder

class ShowViewModel : ViewModel() {

    fun getShow() : MutableList<ShowModel> = ShowSeeder.showSeeder()

}