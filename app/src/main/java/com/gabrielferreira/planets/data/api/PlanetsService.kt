package com.gabrielferreira.planets.data.api

import retrofit2.http.GET

interface PlanetsService {

    //Em @GET fica o Path da nossa URL
    @GET("planets")
    suspend fun getPlanets(): List<PlanetEntity>


}