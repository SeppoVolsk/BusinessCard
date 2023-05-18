package com.codelab.businesscard.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.codelab.businesscard.R

@Composable
fun Avatar() {
    Column {
        val avatarSize = 150.dp
        Box(
            modifier = Modifier
                .size(width = avatarSize, height = avatarSize)
                .background(
                    colorResource(R.color.background_avatar_color)
                )
        ) {
            Image(painterResource(id = R.drawable.android_logo), null)
        }
    }
}