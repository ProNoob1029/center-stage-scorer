package com.phoenix.center_stage_scorer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.phoenix.center_stage_scorer.core.designsystem.theme.CenterstagescorerTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CenterstagescorerTheme {

            }
        }
    }
}