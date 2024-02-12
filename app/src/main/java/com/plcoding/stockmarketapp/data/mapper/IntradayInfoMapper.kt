package com.plcoding.stockmarketapp.data.mapper

import com.plcoding.stockmarketapp.data.remote.dto.IntradayInfoDto
import com.plcoding.stockmarketapp.domain.model.IntraDayInfo
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

fun IntradayInfoDto.toIntradayInfo(): IntraDayInfo {
    val pattern = "yyyy-MM-dd HH:mm:ss"
    val formatter = DateTimeFormatter.ofPattern(pattern, Locale.getDefault())
    val localDateTime = LocalDateTime.parse(timeStamp, formatter)

    return IntraDayInfo(
        date = localDateTime,
        close = close
    )
}