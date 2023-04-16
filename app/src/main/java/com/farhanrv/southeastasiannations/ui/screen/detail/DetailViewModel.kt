package com.farhanrv.southeastasiannations.ui.screen.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.farhanrv.southeastasiannations.data.AppRepository
import com.farhanrv.southeastasiannations.data.NationModel
import com.farhanrv.southeastasiannations.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DetailViewModel(
    private val repository: AppRepository
) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<NationModel>> =
        MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<NationModel>>
        get() = _uiState

    fun getNationByName(name: String) {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            _uiState.value = UiState.Success(repository.getNationByName(name))
        }
    }
}