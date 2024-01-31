package com.plcoding.stockmarketapp.domain.model

// we will only use these type of domain data models to show in UI because by doing this it
// has no relation with the data level models because in data level we are using third party libraries.
data class CompanyListing(
    val name: String,
    val symbol: String,
    val exchange: String,
)
