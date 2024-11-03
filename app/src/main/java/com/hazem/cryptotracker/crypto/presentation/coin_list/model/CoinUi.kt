package com.hazem.cryptotracker.crypto.presentation.coin_list.model

import androidx.annotation.DrawableRes
import com.hazem.cryptotracker.crypto.presentation.coin_details.DataPoint

data class CoinUi(
    val id:String,
    val rank:Int,
    val name:String,
    val symbol:String,
    val marketCapUsd: DisplayableNumber,
    val changePercent24Hr: DisplayableNumber,
    @DrawableRes val iconRes: Int,
    val coinPriceHistory: List<DataPoint> = emptyList()
)


