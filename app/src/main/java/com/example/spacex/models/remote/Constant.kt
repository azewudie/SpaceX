package com.example.spacex.models.remote

import com.example.spacex.models.SpaceXPresentationData
import com.example.spacex.models.data.SpaceXDataX
import okhttp3.ResponseBody

//https://api.spacexdata.com/v3/launches
const val BASE_URL = "https://api.spacexdata.com/"
const val END_URL ="v3/launches"


//region Helper methods
fun ResponseBody?.toPresentation(): SpaceXPresentationData {
    return this?.let { SpaceXPresentationData.Error(it.toString()) } ?: SpaceXPresentationData.Error("Unknown")
}

fun String.toPresentation(): SpaceXPresentationData {
    return SpaceXPresentationData.Error(this)
}

fun SpaceXDataX.toPresentation(): SpaceXPresentationData {
    return SpaceXPresentationData.Response(this)
}

//endregion
