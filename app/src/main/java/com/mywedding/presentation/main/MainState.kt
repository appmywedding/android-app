package com.mywedding.presentation.main

import com.mywedding.domain.model.Invited
import com.mywedding.presentation.model.State

data class MainState(
    val invited: List<Invited> = emptyList()
): State