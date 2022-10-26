package com.example.spacex.di

import com.example.spacex.models.remote.BASE_URL
import com.example.spacex.models.remote.Service
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class ServiceModule {
    @Provides
    fun provideRetrofitClient() = OkHttpClient.Builder().build()

    @Provides
    fun provideConverterGson(): Converter.Factory = GsonConverterFactory.create()

    @Provides
    fun provideService(client: OkHttpClient,
        gsonFactory: Converter.Factory) = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(gsonFactory)
        .client(client)
        .build()
        .create(Service::class.java)
}