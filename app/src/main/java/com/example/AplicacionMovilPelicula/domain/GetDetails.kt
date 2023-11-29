package com.example.AplicacionMovilPelicula.domain

import com.example.AplicacionMovilPelicula.data.MovieRepository
import com.example.AplicacionMovilPelicula.domain.model.MovieDetailsItem
import javax.inject.Inject

class GetDetails @Inject constructor(private val movieRepository: MovieRepository) {

    suspend fun getDetails(id: Int): MovieDetailsItem? {
        return movieRepository.getDetailsMovie(id)
    }
}