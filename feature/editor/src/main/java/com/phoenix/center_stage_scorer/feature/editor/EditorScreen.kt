package com.phoenix.center_stage_scorer.feature.editor

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.stringResource
import com.phoenix.center_stage_scorer.feature.editor.components.textField

@Composable
fun EditorScreen() {
    var text by remember {
        mutableStateOf("")
    }
    val hint = stringResource(id = R.string.Title)
    LazyColumn() {
        textField(
            value = text,
            onValueChange = { text = it },
            hint = hint
        )
    }
}