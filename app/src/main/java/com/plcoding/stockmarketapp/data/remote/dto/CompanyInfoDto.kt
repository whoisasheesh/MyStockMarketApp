package com.plcoding.stockmarketapp.data.remote.dto

import com.squareup.moshi.Json

data class CompanyInfoDto(
    //adding annotation @field to let the android studio know that the API actually return the value as declared otherwise you need not do it.
    @field:Json(name = "Symbol") val symbol: String?,
    @field:Json(name = "Description") val description: String?,
    @field:Json(name = "Name") val name: String?,
    @field:Json(name = "Country") val country: String?,
    @field:Json(name = "Industry") val industry: String?
)
