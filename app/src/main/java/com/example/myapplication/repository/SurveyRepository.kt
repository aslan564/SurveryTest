package com.example.myapplication.repository

import com.example.myapplication.util.SurveyApi

class SurveyRepository {
    private val service = SurveyApi.RETROFIT_SERVICE
    suspend fun getClientData(onComplete: (String) -> Unit) {
        try {
            val response = service.selectRespons()
            if (response.isSuccessful) {
                response.body()?.let {
                    onComplete(it)
                } ?: onComplete(response.message())
            } else onComplete(response.message())

        } catch (ec: Exception) {
            ec.printStackTrace()
            onComplete(ec.toString())
        }
    }
}