package com.feylabs.firrieflix.model

data class ShowModel(
    val id : Int,
    val type : MovieType,
    val title : String,
    val description : String,
    val theme : String = "",
    val releaseDate : String,
    val imbdRating : String,
    val img_link : String,
    val director : String,
    val artist : ArrayList<Artist>
){
    data class Artist(
        val id:String,
        val name:String,
        val img_link:String,
        val play_as:String,
    )

    enum class MovieType {
        MOVIE,SHOW
    }
}