package com.example.spacex.Models.DataAPI

import retrofit2.Call
import retrofit2.http.GET

interface  Service{
    @GET(END_URL)
    fun SpaceXByName(): Call<SpaceXDataX>


}