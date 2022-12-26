package com.example.myapplication.service

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface DaoInterface {

    @GET("api/Surveys")
    suspend fun selectRespons(
        @Header("accept") authorization: String="text/plain",
    ): Response<String>


}