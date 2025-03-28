package com.example.diaryapp.presentation.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.diaryapp.R
import com.example.diaryapp.presentation.components.GoogleButton

private val AuthenticationContentPadding = 40.dp
private val LogoSize = 120.dp
private val SpacerHeight = 20.dp

@Composable
fun AuthenticationContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(all = AuthenticationContentPadding),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.weight(9f)
        ) {
            Image(
                modifier = Modifier.size(LogoSize),
                painter = painterResource(id = R.drawable.google_logo),
                contentDescription = stringResource(R.string.google_logo_content_description)
            )
            Spacer(modifier = Modifier.height(SpacerHeight))
            Text(
                text = stringResource(id = R.string.auth_title),
                fontSize = MaterialTheme.typography.titleLarge.fontSize
            )
            Text(
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
                text = stringResource(id = R.string.auth_subtitle),
                fontSize = MaterialTheme.typography.bodyMedium.fontSize
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .weight(2f)
                .fillMaxWidth()
        ) {
            GoogleButton(loadingState = false) {}
        }
    }
}

@Preview
@Composable
private fun AuthenticationContentPreview() {
    AuthenticationContent()
}