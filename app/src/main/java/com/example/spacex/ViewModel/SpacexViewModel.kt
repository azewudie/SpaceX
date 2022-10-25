package com.example.spacex.ViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.spacex.Models.DataAPI.API
import com.example.spacex.Models.DataAPI.SpaceXDataX
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SpacexViewModel: ViewModel() {

    /**
     * Spacex API
     */
    open var _spaceXDataAPIResult = MutableLiveData<SpaceXDataX>()

    // Backing Field
    open val spaceXDataAPIResult: LiveData<SpaceXDataX>
        get() = _spaceXDataAPIResult

    /**
     * Error message
     */
    private val _errorMessages = MutableLiveData("")

    val errorMessages: LiveData<String>
        get() = _errorMessages

    fun spacexDataCall() {

        Log.d("RockAPI", "musicRock:${API.SpacexAPI.SpaceXByName()} ")

        val call = API.SpacexAPI.SpaceXByName()

        Log.d("CallApI", "musicRock: $call")

        call.enqueue(
            object : Callback<SpaceXDataX> {
               override fun onResponse(call: Call<SpaceXDataX>, response: Response<SpaceXDataX>) {
                    if (response.isSuccessful) {
                        var body = response.body()
                        Log.d("body", "onResponse:${body?.size} ")
                        val resultSpaceX = body

//                        Log.d("BodyMusic", "onResponse:${resultSpaceX} ")
                        _spaceXDataAPIResult.value = resultSpaceX

                        Log.d("rockMusicResult", "onResponse:${resultSpaceX} ")


                    } else {
                        _errorMessages.value = response.message()
                    }
                }

                override fun onFailure(call: Call<SpaceXDataX>, t: Throwable) {
                    t.printStackTrace()
                    _errorMessages.value = t.message ?: "Unknown error"
                    print(errorMessages)
                }

            }
        )
    }


}