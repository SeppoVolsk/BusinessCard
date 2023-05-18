package com.codelab.businesscard.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.codelab.businesscard.R

@Composable
fun InfoBloc() {
    Column(horizontalAlignment = Alignment.Start) {
        InfoString(
            description = stringResource(R.string.phone),
            picture = Icons.Outlined.Phone
        )
        Spacer(Modifier.height(20.dp))
        InfoString(
            description = stringResource(R.string.social_tag),
            picture = Icons.Outlined.Share
        )
        Spacer(Modifier.height(20.dp))
        InfoString(
            description = stringResource(R.string.mail),
            picture = Icons.Outlined.Email
        )
    }
}
@Composable
fun InfoString(description: String, picture: ImageVector) {
    Row() {
        Icon(
            imageVector = picture,
            tint = colorResource(id = R.color.subtitle_color),
            contentDescription = null
        )
        Spacer(Modifier.width(20.dp))
        Text(description)
    }
}