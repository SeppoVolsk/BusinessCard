package com.codelab.businesscard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.codelab.businesscard.components.Avatar
import com.codelab.businesscard.components.InfoBloc
import com.codelab.businesscard.components.Title

@Composable
fun BusinessCard() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.background(
            colorResource(id = R.color.background_color)
        )
    ) {
        Avatar()
        Title()
        InfoBloc()
    }
}