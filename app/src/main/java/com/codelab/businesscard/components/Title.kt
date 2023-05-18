package com.codelab.businesscard.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.codelab.businesscard.R

@Composable
fun Title() {
    Column {
        Text(
            text = stringResource(R.string.owner_name),
            fontSize = 35.sp,
        )
        Text(
            text = stringResource(R.string.role),
            color = colorResource(id = R.color.subtitle_color),
            fontWeight = FontWeight.Bold
        )
    }
}