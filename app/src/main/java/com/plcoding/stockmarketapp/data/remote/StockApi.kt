package com.plcoding.stockmarketapp.data.remote

import com.plcoding.stockmarketapp.data.remote.dto.CompanyInfoDto
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {

    @GET("query?function=LISTING_STATUS") //query the API with LISTING_STATUS to get ResponseBody
    suspend fun getListings(
        @Query("apikey") apiKey: String = API_KEY
    ): ResponseBody

    @GET("query?function=TIME_SERIES_INTRADAY&interval=60min&datatype=csv")
    suspend fun getIntradayInfo(
        @Query("symbol") symbol: String,
        @Query("apikey") apikey: String = API_KEY
    ): ResponseBody

    @GET("query?function=OVERVIEW")
    suspend fun getCompanyInfo(
        @Query("symbol") symbol: String,
        @Query("apikey") apikey: String = API_KEY
    ): CompanyInfoDto

    companion object {
        const val API_KEY = "6ZOICID8EAZFYM24"
        const val BASE_URL = "https://alphavantage.co"
    }
}