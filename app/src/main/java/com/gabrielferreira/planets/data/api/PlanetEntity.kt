package com.gabrielferreira.planets.data.api
import kotlinx.serialization.Serializable

@Serializable
data class PlanetEntity(

    val id : Int,
    val name : String,
    val description : String,
    val url : String,
)

