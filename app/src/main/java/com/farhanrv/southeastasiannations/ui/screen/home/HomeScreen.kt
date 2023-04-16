package com.farhanrv.southeastasiannations.ui.screen.home

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.farhanrv.southeastasiannations.data.NationModel
import com.farhanrv.southeastasiannations.di.Injection
import com.farhanrv.southeastasiannations.ui.ViewModelFactory
import com.farhanrv.southeastasiannations.ui.common.UiState
import androidx.lifecycle.viewmodel.compose.viewModel
import com.farhanrv.southeastasiannations.ui.components.NationItem

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = viewModel(
        factory = ViewModelFactory(Injection.provideRepository())
    ),
    navigateToDetail: (NationModel) -> Unit,
    navigateToAbout: () -> Unit
) {
    viewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
        when (uiState) {
            is UiState.Loading -> {
                viewModel.getAllNations()
            }
            is UiState.Success -> {
                HomeContent(
                    nations = uiState.data,
                    modifier = modifier,
                    navigateToDetail = navigateToDetail,
                    navigateToAbout = navigateToAbout
                )
            }
            is UiState.Error -> {}
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeContent(
    nations: List<NationModel>,
    modifier: Modifier = Modifier,
    navigateToDetail: (NationModel) -> Unit,
    navigateToAbout: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Southeast Asian Nations") },
                actions = {
                    IconButton(
                        onClick = { navigateToAbout() },
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Person,
                            contentDescription = "Back"
                        )
                    }
                }
            )
        },
        content = {
            LazyVerticalGrid(
                columns = GridCells.Adaptive(160.dp),
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = modifier
            ) {
                items(nations) { data ->
                    NationItem(
                        photo = data.flag,
                        modifier.clickable {
                            navigateToDetail(data)
                        }
                    )
                }
            }
        })
}
