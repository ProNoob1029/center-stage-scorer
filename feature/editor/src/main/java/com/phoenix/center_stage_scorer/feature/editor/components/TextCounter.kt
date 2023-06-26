package com.phoenix.center_stage_scorer.feature.editor.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.phoenix.center_stage_scorer.core.designsystem.components.ScorerCounter
import com.phoenix.center_stage_scorer.core.designsystem.components.ScorerIconButton
import com.phoenix.center_stage_scorer.core.designsystem.icons.ScorerIcons

fun LazyListScope.textCounter(
    modifier: Modifier = Modifier,
    text: String,
    number: Int,
    onClickRemove: () -> Unit,
    onClickAdd: () -> Unit,
    removeButtonDescription: String? = null,
    addButtonDescription: String? = null,
    removeEnabled: Boolean = true,
    addEnabled: Boolean = true,
    key: Any? = null
) {
    item(key = key) {
        TextCounter(
            modifier = modifier,
            text = text,
            number = number,
            onClickRemove = onClickRemove,
            onClickAdd = onClickAdd,
            removeButtonDescription = removeButtonDescription,
            addButtonDescription = addButtonDescription,
            removeEnabled = removeEnabled,
            addEnabled = addEnabled
        )
    }
}

@Composable
internal fun TextCounter(
    modifier: Modifier = Modifier,
    text: String,
    number: Int,
    onClickRemove: () -> Unit,
    onClickAdd: () -> Unit,
    removeButtonDescription: String? = null,
    addButtonDescription: String? = null,
    removeEnabled: Boolean = true,
    addEnabled: Boolean = true,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier.weight(1f),
            text = text
        )
        Row(
            modifier = Modifier.width(IntrinsicSize.Min),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(
                modifier = Modifier.weight(1f),
                contentAlignment = Alignment.Center
            ) {
                ScorerCounter(number = number)
            }
            Box(
                modifier = Modifier.weight(1f),
                contentAlignment = Alignment.Center
            ) {
                ScorerIconButton(
                    onClick = onClickRemove,
                    enabled = removeEnabled
                ) {
                    Icon(
                        imageVector = ScorerIcons.Remove,
                        contentDescription = removeButtonDescription
                    )
                }
            }
            Box(
                modifier = Modifier.weight(1f),
                contentAlignment = Alignment.Center
            ) {
                ScorerIconButton(
                    onClick = onClickAdd,
                    enabled = addEnabled
                ) {
                    Icon(
                        imageVector = ScorerIcons.Add,
                        contentDescription = addButtonDescription
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 400)
@Composable
fun TextCounterPreview() {
    TextCounter(
        text = "Text Counter:",
        number = 69,
        onClickRemove = {},
        onClickAdd = {},
    )
}