package com.example.calc

object ApiClient {
    var retrofit = Retrofit.Builder()
        .baseUrl("<your base url goes here>")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun <T> buildApiClient(apiInterface: Class<T>) : T{
        return retrofit.create(apiInterface)
    }
}