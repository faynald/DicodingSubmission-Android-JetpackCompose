package com.farhanrv.southeastasiannations.ui.screen.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.farhanrv.southeastasiannations.data.NationModel
import com.farhanrv.southeastasiannations.di.Injection
import com.farhanrv.southeastasiannations.ui.ViewModelFactory
import com.farhanrv.southeastasiannations.ui.common.UiState

@Composable
fun DetailScreen(
    modifier: Modifier = Modifier,
    nationName: String,
    viewModel: DetailViewModel = viewModel(
        factory = ViewModelFactory(
            Injection.provideRepository()
        )
    ),
    navigateBack: () -> Unit,
) {
    viewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
        when (uiState) {
            is UiState.Loading -> {
                viewModel.getNationByName(nationName)
            }
            is UiState.Success -> {
                val data = uiState.data
                DetailContent(
                    nation = data,
                    navigateBack = navigateBack
                )
            }
            is UiState.Error -> {}
        }
    }
}

@Composable
fun DetailContent(
    modifier: Modifier = Modifier.padding(16.dp),
    nation: NationModel,
    navigateBack: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = nation.name) },
                navigationIcon =
                {
                    IconButton(
                        onClick = { navigateBack() }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                }
            )
        },
        content = { paddingValues ->
            Column(modifier = Modifier.padding(paddingValues) ) {
                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())
                        .weight(1f)
                        .padding(16.dp)
                ) {
                    Column {
                        Image(
                            painter = painterResource(id = nation.flag),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = modifier
                                .height(200.dp)
                        )
                        val column1Weight = .3f
                        val column2Weight = .7f
                        Row(Modifier.fillMaxWidth()) {
                            TableCell(text = "Capital City", weight = column1Weight)
                            TableCell(text = ": ${nation.capitalCity}", weight = column2Weight)
                        }
                        Row(Modifier.fillMaxWidth()) {
                            TableCell(text = "Currency", weight = column1Weight)
                            TableCell(text = ": ${nation.currency}", weight = column2Weight)
                        }
                        Text(
                            text = "History :",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 8.dp)
                        )
                        Text(text = nation.history)
                    }
                }
            }
        }
    )
}

@Composable
fun RowScope.TableCell(
    text: String,
    weight: Float
) {
    Text(
        text = text,
        Modifier
            .weight(weight)
    )
}