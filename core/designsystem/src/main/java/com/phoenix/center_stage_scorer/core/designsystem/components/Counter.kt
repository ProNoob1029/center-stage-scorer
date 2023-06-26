package com.phoenix.center_stage_scorer.core.designsystem.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ScorerCounter(
    modifier: Modifier = Modifier,
    number: Int = 0
) {
    val text = remember(number) {
        number.toString()
    }

    Surface(
        color = MaterialTheme.colorScheme.primaryContainer,
        shape = ButtonDefaults.shape,
    ) {
        Box(
            modifier = modifier.size(40.0.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(text = text)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScorerPreview() {
    ScorerCounter(
        number = 69
    )
}