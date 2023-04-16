package com.farhanrv.southeastasiannations.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.farhanrv.southeastasiannations.R
import com.farhanrv.southeastasiannations.ui.theme.Shapes
import com.farhanrv.southeastasiannations.ui.theme.SoutheastAsianNationsTheme

@Composable
fun NationItem(
    photo: Int,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(photo),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(170.dp)
                .height(100.dp)
                .clip(Shapes.medium)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun NationItemPreview() {
    SoutheastAsianNationsTheme {
        NationItem(R.drawable.flag_indonesia)
    }
}