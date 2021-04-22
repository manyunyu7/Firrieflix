package com.feylabs.firrieflix.util.seeder

import com.feylabs.firrieflix.R
import com.feylabs.firrieflix.model.MovieModel

object MovieSeeder {

    fun movieSeeder(): MutableList<MovieModel> {
        val tempList = mutableListOf<MovieModel>()

        tempList.add(
            MovieModel(
                id = 1,
                title = "A Start is Born",
                type = MovieModel.MovieType.MOVIE,
                description = "",
                releaseDate = "",
                artist = arrayListOf(MovieModel.Artist("", "Henry Aaugusta", play_as = "Joko")),
                director = "",
                imbdRating = "",
                img_link = R.drawable.poster_a_start_is_born,
            ),
        )

        tempList.add(
            MovieModel(
                id = 2,
                title = "Alita",
                type = MovieModel.MovieType.MOVIE,
                description = "",
                releaseDate = "",
                artist = arrayListOf(MovieModel.Artist("", "Henry Aaugusta", play_as = "Joko")),
                director = "",
                imbdRating = "",
                img_link = R.drawable.poster_alita,
            ),
        )

        tempList.add(
            MovieModel(
                id = 4,
                title = "Bohemian Rhapsody",
                type = MovieModel.MovieType.MOVIE,
                description = "",
                releaseDate = "",
                artist = arrayListOf(MovieModel.Artist("", "Henry Aaugusta", play_as = "Joko")),
                director = "",
                imbdRating = "",
                img_link = R.drawable.poster_bohemian,
            ),
        )

        tempList.add(
            MovieModel(
                id = 5,
                title = "Cold Persuit",
                type = MovieModel.MovieType.MOVIE,
                description = "",
                releaseDate = "",
                artist = arrayListOf(MovieModel.Artist("", "Henry Aaugusta", play_as = "Joko")),
                director = "",
                imbdRating = "",
                img_link = R.drawable.poster_cold_persuit,
            ),
        )

        tempList.add(
            MovieModel(
                id = 6,
                title = "Creed II",
                type = MovieModel.MovieType.MOVIE,
                description = "",
                releaseDate = "",
                artist = arrayListOf(MovieModel.Artist("", "Henry Aaugusta", play_as = "Joko")),
                director = "",
                imbdRating = "",
                img_link = R.drawable.poster_creed,
            ),
        )

        tempList.add(
            MovieModel(
                id = 7,
                title = "Glass",
                type = MovieModel.MovieType.MOVIE,
                description = "",
                releaseDate = "",
                artist = arrayListOf(MovieModel.Artist("", "Henry Aaugusta", play_as = "Joko")),
                director = "",
                imbdRating = "",
                img_link = R.drawable.poster_glass,
            ),
        )

        tempList.add(
            MovieModel(
                id = 8,
                title = "How To Train Your Dragon",
                type = MovieModel.MovieType.MOVIE,
                description = "",
                releaseDate = "",
                artist = arrayListOf(MovieModel.Artist("", "Henry Aaugusta", play_as = "Joko")),
                director = "",
                imbdRating = "",
                img_link = R.drawable.poster_how_to_train,
            ),
        )

        tempList.add(
            MovieModel(
                id = 9,
                title = "Infinity War",
                type = MovieModel.MovieType.MOVIE,
                description = "",
                releaseDate = "",
                artist = arrayListOf(MovieModel.Artist("", "Henry Aaugusta", play_as = "Joko")),
                director = "",
                imbdRating = "",
                img_link = R.drawable.poster_infinity_war,
            ),
        )

        tempList.add(
            MovieModel(
                id = 10,
                title = "Spiderman",
                type = MovieModel.MovieType.MOVIE,
                description = "",
                releaseDate = "",
                artist = arrayListOf(MovieModel.Artist("", "Henry Aaugusta", play_as = "Joko")),
                director = "",
                imbdRating = "",
                img_link = R.drawable.poster_spiderman,
            ),
        )



        return tempList
    }

}