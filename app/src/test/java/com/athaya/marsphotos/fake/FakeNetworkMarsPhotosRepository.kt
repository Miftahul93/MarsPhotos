package com.athaya.marsphotos.fake

import com.athaya.marsphotos.data.MarsPhotosRepository
import com.athaya.marsphotos.model.MarsPhoto

class FakeNetworkMarsPhotosRepository : MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}