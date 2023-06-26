package com.phoenix.center_stage_scorer.feature.editor

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.phoenix.center_stage_scorer.feature.editor.components.textCounter
import com.phoenix.center_stage_scorer.feature.editor.components.textField

@Composable
fun EditorScreen() {
    var titleText by remember {
        mutableStateOf("")
    }
    val titleHint = stringResource(id = R.string.Title)

    var counterNr by remember {
        mutableStateOf(0)
    }
    val counterText = stringResource(id = R.string.Text_Counter)
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        textField(
            value = titleText,
            onValueChange = { titleText = it },
            hint = titleHint
        )
        textCounter(
            number = counterNr,
            text = counterText,
            onClickAdd = { counterNr++ },
            onClickRemove = { counterNr-- }
        )
    }
}