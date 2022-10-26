package com.example.spacex.models.remote

import com.example.spacex.models.data.SpaceXDataX
import retrofit2.Response
import retrofit2.http.GET

interface  Service{
    @GET(END_URL)
    suspend fun spaceXDataRequest(): Response<SpaceXDataX>
}