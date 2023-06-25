package com.phoenix.center_stage_scorer.feature.editor.components

import androidx.compose.foundation.lazy.LazyListScope
import com.phoenix.center_stage_scorer.core.designsystem.components.ScorerTextField

fun LazyListScope.textField(
    value: String,
    onValueChange: (String) -> Unit,
    hint: String? = null,
    key: Any? = null
) {
    item(key = key) {
        ScorerTextField(
            value = value,
            onValueChange = onValueChange,
            hint = hint
        )
    }
}