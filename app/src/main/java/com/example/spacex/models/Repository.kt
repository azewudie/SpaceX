package com.example.spacex.models

import com.example.spacex.models.remote.Service
import com.example.spacex.models.remote.toPresentation
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class Repository(private val service: Service): IRepository {

    override fun getAllSpaceXData(): Flow<SpaceXPresentationData> {
        return flow {
            emit(SpaceXPresentationData.Loading())
            val response = service.spaceXDataRequest()
            if (response.isSuccessful){
                response.body()?.let {spaceXResponse ->
                    emit( spaceXResponse.toPresentation() )
                } ?: emit( response.message().toPresentation() )
            }else{
                emit( response.errorBody().toPresentation() )
            }
            emit(SpaceXPresentationData.Loading(false))
        }
    }
}

