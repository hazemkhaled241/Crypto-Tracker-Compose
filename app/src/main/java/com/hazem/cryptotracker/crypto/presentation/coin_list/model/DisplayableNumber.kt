package com.hazem.cryptotracker.crypto.presentation.coin_list.model

import java.text.NumberFormat
import java.util.Locale

data class DisplayableNumber(
    val value: Double,
    val formatted: String
)

fun Double.toDisplayedNumber(): DisplayableNumber {
    val formatter = NumberFormat.getNumberInstance(Locale.getDefault()).apply {
        minimumFractionDigits = 2
        maximumFractionDigits = 2
    }
    return DisplayableNumber(
        value = this,
        formatted = formatter.format(this)
    )
}