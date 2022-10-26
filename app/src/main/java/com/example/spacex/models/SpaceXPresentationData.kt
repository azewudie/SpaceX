package com.example.spacex.models

import com.example.spacex.models.data.SpaceXDataX

/**
 * Used to encapsulate multiple types into a single type, this will help to avoid using
 * multiple livedata to propagate different events  like error or response.
 */
sealed class SpaceXPresentationData{
    data class Response(val response: SpaceXDataX): SpaceXPresentationData()
    data class Error(val errorMessage: String): SpaceXPresentationData()
    data class Loading(val isLoading: Boolean = true): SpaceXPresentationData()
}
