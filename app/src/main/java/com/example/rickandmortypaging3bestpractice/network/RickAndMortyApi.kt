package com.example.rickandmortypaging3bestpractice.network

import com.example.rickandmortypaging3bestpractice.data.dto.CharacterResponse
import com.example.rickandmortypaging3bestpractice.util.Constants
import retrofit2.http.GET
import retrofit2.http.Query

interface RickAndMortyApi {
    @GET(Constants.END_POINT)
    suspend fun getCharacters(
        @Query("page") page: Int
    ): CharacterResponse
}