package com.gabrielferreira.planets.data.api

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import retrofit2.Retrofit

object PlanetsClient {

    fun getService() : PlanetsService {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://us-central1-android-course-api.cloudfunctions.net/")
            .addConverterFactory(Json.asConverterFactory(MediaType.parse("application/json")!!))
            .build()

        return retrofit.create(PlanetsService::class.java)

    }
}