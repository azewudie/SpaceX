package com.example.spacex.Models.DataAPI
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * This is a singleton
 */
object API {
    val SpacexAPI: Service by lazy {
        collectionRetrofit()
    }

    private fun collectionRetrofit(): Service {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Service::class.java)
    }

}