package com.example.AplicacionMovilPelicula.domain

import com.example.AplicacionMovilPelicula.data.MovieRepository
import com.example.AplicacionMovilPelicula.domain.model.MovieItem
import javax.inject.Inject

class GetMovies @Inject constructor(private val movieRepository: MovieRepository) {

    suspend fun getAll(page: Int): MutableList<MovieItem> {
        return movieRepository.getMovies(page)
    }
}