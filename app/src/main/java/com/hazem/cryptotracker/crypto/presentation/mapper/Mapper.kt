package com.hazem.cryptotracker.crypto.presentation.mapper

import com.hazem.cryptotracker.crypto.domain.Coin
import com.hazem.cryptotracker.crypto.presentation.coin_list.model.CoinUi
import com.hazem.cryptotracker.crypto.presentation.coin_list.model.DisplayableNumber
import com.hazem.cryptotracker.crypto.presentation.mapper.Mapper.toDisplayedNumber
import com.hazem.cryptotracker.utils.getDrawableIdForCoin
import java.text.NumberFormat
import java.util.Locale

object Mapper {
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
}

fun Coin.toCoinUi(): CoinUi {
    return CoinUi(
        id = id,
        name = name,
        symbol = symbol,
        rank = rank,
        marketCapUsd = marketCapUsd.toDisplayedNumber(),
        priceUsd = priceUsd.toDisplayedNumber(),
        changePercent24Hr = changePercent24Hr.toDisplayedNumber(),
        iconRes = getDrawableIdForCoin(symbol)

    )
}