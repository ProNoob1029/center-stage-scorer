package com.phoenix.center_stage_scorer.feature.editor.components

import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.phoenix.center_stage_scorer.core.designsystem.components.ScorerTextField

fun LazyListScope.textField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    hint: String? = null,
    key: Any? = null
) {
    item(key = key) {
        TextField(
            modifier = modifier,
            value = value,
            onValueChange = onValueChange,
            hint = hint
        )
    }
}

@Composable
internal fun TextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    hint: String? = null
) {
    ScorerTextField(
        modifier = modifier,
        value = value,
        onValueChange = onValueChange,
        hint = hint
    )
}