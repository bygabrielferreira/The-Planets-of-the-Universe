package com.gabrielferreira.planets.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.gabrielferreira.planets.data.api.PlanetsClient
import com.gabrielferreira.planets.ui.main.PlanetData

class PlanetsRepository {

    private val service = PlanetsClient.getService()

    suspend fun getPlanetsList(): List<PlanetData>{
        return withContext(Dispatchers.IO){
           service.getPlanets().map { PlanetData(it.name, it.description) }
        }
   }

}