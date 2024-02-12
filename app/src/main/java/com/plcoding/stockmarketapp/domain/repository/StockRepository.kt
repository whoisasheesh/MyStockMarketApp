package com.plcoding.stockmarketapp.domain.repository

import com.plcoding.stockmarketapp.domain.model.CompanyInfo
import com.plcoding.stockmarketapp.domain.model.CompanyListing
import com.plcoding.stockmarketapp.domain.model.IntraDayInfo
import com.plcoding.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {
    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>> //we could also use CompanyListingEntity but we are in the domain layer which is why we will not access anything from data layer

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntraDayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}
// Flow is a coroutine that emits multiple values over period of time

