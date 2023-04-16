package com.farhanrv.southeastasiannations.ui.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.farhanrv.southeastasiannations.data.AppRepository
import com.farhanrv.southeastasiannations.data.NationModel
import com.farhanrv.southeastasiannations.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class HomeViewModel(
    private val repository: AppRepository
) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<List<NationModel>>> = MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<List<NationModel>>>
        get() = _uiState

    fun getAllNations() {
        viewModelScope.launch {
            repository.getAllNations()
                .catch {
                    _uiState.value = UiState.Error(it.message.toString())
                }
                .collect { nation ->
                    _uiState.value = UiState.Success(nation)
                }
        }
    }
}