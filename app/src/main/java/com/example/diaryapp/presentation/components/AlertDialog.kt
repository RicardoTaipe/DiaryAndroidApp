package com.example.diaryapp.presentation.components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.diaryapp.R

@Composable
fun CustomAlertDialog(
    title: String,
    message: String,
    isDialogOpened: Boolean,
    onDialogDismiss: () -> Unit,
    onConfirmClick: () -> Unit,
    confirmationButtonText: String = stringResource(R.string.yes),
    dismissButtonText: String = stringResource(R.string.no),

    ) {
    if (isDialogOpened) {
        AlertDialog(
            title = {
                Text(
                    text = title,
                    fontSize = MaterialTheme.typography.headlineSmall.fontSize,
                    fontWeight = FontWeight.Bold
                )
            }, text = {
                Text(
                    text = message,
                    fontSize = MaterialTheme.typography.bodyMedium.fontSize,
                    fontWeight = FontWeight.Normal
                )
            }, confirmButton = {
                Button(
                    onClick = {
                        onConfirmClick()
                        onDialogDismiss()
                    }) {
                    Text(text = confirmationButtonText)
                }
            }, dismissButton = {
                OutlinedButton(onClick = onDialogDismiss) {
                    Text(text = dismissButtonText)
                }
            }, onDismissRequest = onDialogDismiss
        )
    }
}

@Preview
@Composable
private fun DisplayAlertDialogPreview() {
    CustomAlertDialog(
        title = "Confirmation",
        message = "Are you sure you want to delete this item?",
        isDialogOpened = true,
        onDialogDismiss = {},
        onConfirmClick = {},
    )
}