package com.hazem.cryptotracker.crypto.presentation.coin_list

import androidx.compose.runtime.Immutable
import com.hazem.cryptotracker.crypto.presentation.coin_list.model.CoinUi

@Immutable
data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<CoinUi> = emptyList(),
    val selectedCoin: CoinUi? = null
)
