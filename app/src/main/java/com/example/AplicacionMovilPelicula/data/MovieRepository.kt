package com.example.AplicacionMovilPelicula.data

import com.example.AplicacionMovilPelicula.core.Credentials
import com.example.AplicacionMovilPelicula.data.model.ListMoviesModel
import com.example.AplicacionMovilPelicula.data.network.ApiService
import com.example.AplicacionMovilPelicula.domain.model.MovieDetailsItem
import com.example.AplicacionMovilPelicula.domain.model.MovieItem
import com.example.AplicacionMovilPelicula.domain.model.toDomain
import javax.inject.Inject

class MovieRepository @Inject constructor(
    private val apiService: ApiService
) {

    suspend fun getMovies(page: Int): MutableList<MovieItem> {
        val response = apiService.getMovies(page)
        Credentials.pagesTotal = response?.pTotal() ?: 1
        return response?.results?.map { it.toDomain() } as MutableList<MovieItem>
    }

    fun ListMoviesModel.pTotal() = totalPages

    suspend fun getDetailsMovie(id: Int): MovieDetailsItem? {
        val response = apiService.getMovieId(id)
        return response?.toDomain()
    }
}