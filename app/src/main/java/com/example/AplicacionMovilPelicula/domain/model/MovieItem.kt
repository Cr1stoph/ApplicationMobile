package com.example.AplicacionMovilPelicula.domain.model

import com.example.AplicacionMovilPelicula.core.Credentials
import com.example.AplicacionMovilPelicula.data.model.ResultApi

data class MovieItem(
    val id: Int,
    val title: String,
    val posterPath: String,
)

fun ResultApi.toDomain(): MovieItem {
    val poster = "${Credentials.PATH_IMG}${this.posterPath}"
    return MovieItem(id, title, poster)
}