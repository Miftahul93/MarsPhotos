package com.athaya.marsphotos.ui.screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.athaya.marsphotos.network.MarsApi
import kotlinx.coroutines.launch

class MarsViewModel: ViewModel(){
    /** The mutable state that stores the status of the most recent request */
    var marsUiState : String by mutableStateOf("")
        private set

    /**
     * Call getMarsPhotos() on init so we can display status immediately
     */
    init {
        getMarsPhotos()
    }

    /**
     * Gets Mars photos information from the mars Api Retrofit service and Updates
     * [MarsPhoto] [List] [MutableList]
     */
    private fun getMarsPhotos() {
        viewModelScope.launch {
            val listResult = MarsApi.retrofitService.getPhotos()
            marsUiState = listResult
        }
    }
}