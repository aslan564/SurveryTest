package com.example.myapplication.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.repository.SurveyRepository
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val repository = SurveyRepository()
    var data = MutableLiveData<String>()
    init {
        getAllData()
    }

    private fun getAllData() = viewModelScope.launch {
        repository.getClientData {
            data.value = it
        }
    }

}