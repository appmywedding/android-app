package com.mywedding.presentation.main

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.mywedding.data.local.interactors.invited.InvitedInteractor
import com.mywedding.presentation.model.CustomViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val invitedInteractor: InvitedInteractor
) : ViewModel(), CustomViewModel {
    var state by mutableStateOf(MainState())
}