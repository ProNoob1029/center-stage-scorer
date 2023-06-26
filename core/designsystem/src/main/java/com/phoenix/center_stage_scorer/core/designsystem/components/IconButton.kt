package com.phoenix.center_stage_scorer.core.designsystem.components

import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.phoenix.center_stage_scorer.core.designsystem.icons.ScorerIcons

@Composable
fun ScorerIconButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    enabled: Boolean = true,
    content: @Composable () -> Unit
) {
    FilledIconButton(
        modifier = modifier,
        onClick = onClick,
        enabled = enabled,
        content = content
    )
}

@Preview(showBackground = true)
@Composable
fun IconButtonPreview() {
    ScorerIconButton(onClick = {}) {
        Icon(
            imageVector = ScorerIcons.Add,
            contentDescription = null
        )
    }
}