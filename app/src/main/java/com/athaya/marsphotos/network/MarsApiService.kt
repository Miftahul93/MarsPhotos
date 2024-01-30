package com.athaya.marsphotos.network

import com.athaya.marsphotos.model.MarsPhoto
import retrofit2.http.GET


interface MarsApiService {
    @GET("photos")
    suspend fun getPhotos(): List<MarsPhoto>
}