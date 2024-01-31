package com.plcoding.stockmarketapp.data.remote

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {


    @GET("query?function=LISTING_STATUS") //query the API with LISTING_STATUS to get ResponseBody
    suspend fun getListings(
        @Query("apiKey") apiKey: String
    ): ResponseBody

    companion object {
        const val API_KEY = "TBSKJWBUPC5EHBQV"
        const val BASE_URL = "https://alphavantage.co"
    }
}