package com.phoenix.center_stage_scorer.core.designsystem.components

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ScorerTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    hint: String? = null,
    enabled: Boolean = true,
    readOnly: Boolean = false,
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        enabled = enabled,
        readOnly = readOnly,
        placeholder = {
            hint?.let {
                Text(text = it)
            }
        },
        modifier = modifier
    )
}

@Preview
@Composable
fun TextFieldPreview() {
    ScorerTextField(
        value = "Preview",
        onValueChange = {}
    )
}

@Preview
@Composable
fun TextFieldHintPreview() {
    ScorerTextField(
        value = "",
        onValueChange = {},
        hint = "Hint"
    )
}