package com.codelab.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codelab.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),

                    ) {

                }
            }
        }
    }
}

@Composable
fun AvatarWidget() {
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

@Composable
fun TitleWidget() {
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

@Composable
fun InfoStringWidget(description: String, picture: ImageVector) {
    Row() {
        androidx.compose.material.Icon(
            imageVector = picture,
            tint = colorResource(id = R.color.subtitle_color),
            contentDescription = null
        )
        Spacer(Modifier.width(20.dp))
        Text(description)
    }
}

@Composable
fun InfoBlocWidget() {
    Column(horizontalAlignment = Alignment.Start) {
        InfoStringWidget(
            description = stringResource(R.string.phone),
            picture = Icons.Outlined.Phone
        )
        Spacer(Modifier.height(20.dp))
        InfoStringWidget(
            description = stringResource(R.string.social_tag),
            picture = Icons.Outlined.Share
        )
        Spacer(Modifier.height(20.dp))
        InfoStringWidget(
            description = stringResource(R.string.mail),
            picture = Icons.Outlined.Email
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.background(
                colorResource(id = R.color.background_color)
            )
        ) {
            AvatarWidget()
            TitleWidget()
            InfoBlocWidget()
        }
    }
}