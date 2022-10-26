package com.example.spacex.models

import kotlinx.coroutines.flow.Flow

interface IRepository {
    fun getAllSpaceXData(): Flow<SpaceXPresentationData>
}