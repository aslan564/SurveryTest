package com.example.myapplication.util

import com.example.myapplication.service.DaoInterface
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

object RetrofitClient {
    private var BASE_URL: String = "*****"
    private fun addBearer(token: String): String {
        return " Bearer ".plus(token)
    }

    fun getClinet(token: String): Retrofit {

        val interceptor = (Interceptor { chain ->
            val requestBuilder = chain.request().newBuilder()
            requestBuilder.header("accept", "text/plain")
            requestBuilder.header("Authorization", addBearer(token))
            chain.proceed(requestBuilder.build())
        })
        val httpClient = OkHttpClient.Builder()
        httpClient.addInterceptor(interceptor)

        return Retrofit.Builder()
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .addConverterFactory(ScalarsConverterFactory.create())
            .client(httpClient.build())
            .baseUrl(BASE_URL)
            .build()

    }

}

object SurveyApi {
    val RETROFIT_SERVICE: DaoInterface by lazy {
        RetrofitClient.getClinet(
            "**.Zz8qRV8CRFo3fqAoZ6DchONAd6hiA9jNZXUXxNGlhH8"
        ).create(DaoInterface::class.java)
    }
}