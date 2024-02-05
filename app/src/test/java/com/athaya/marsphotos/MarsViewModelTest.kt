package com.athaya.marsphotos

import com.athaya.marsphotos.fake.FakeDataSource
import com.athaya.marsphotos.fake.FakeNetworkMarsPhotosRepository
import com.athaya.marsphotos.rules.TestDispatcherRule
import com.athaya.marsphotos.ui.screen.MarsUiState
import com.athaya.marsphotos.ui.screen.MarsViewModel
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class MarsViewModelTest {

    @get:Rule
    val testDispatcher = TestDispatcherRule()
    @Test
    fun marsViewModel_getMarsPhotos_verifyMarsUiStateSuccess() =
        runTest {
            val marsViewModel = MarsViewModel(
                marsPhotosRepository = FakeNetworkMarsPhotosRepository()
            )
            assertEquals(
                MarsUiState.Success(FakeDataSource.photosList),
                marsViewModel.marsUiState
            )
        }
}