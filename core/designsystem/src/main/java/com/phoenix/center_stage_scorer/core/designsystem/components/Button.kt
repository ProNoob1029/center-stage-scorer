package com.phoenix.center_stage_scorer.core.designsystem.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ScorerButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        content = content
    )
}

@Preview
@Composable
fun ButtonPreview() {
    ScorerButton(onClick = {}) {
        Text(text = "Preview")
    }
}