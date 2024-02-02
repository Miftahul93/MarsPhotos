package com.athaya.marsphotos.fake

import com.athaya.marsphotos.model.MarsPhoto
import com.athaya.marsphotos.network.MarsApiService

class FakeMarsApiService : MarsApiService {
    override suspend fun getPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}