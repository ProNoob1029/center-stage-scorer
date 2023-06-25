package com.phoenix.center_stage_scorer.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.phoenix.center_stage_scorer.navigation.ScorerNavHost

@Composable
fun ScorerApp() {
    Scaffold { scaffoldPadding ->
        ScorerNavHost(
            modifier = Modifier.padding(scaffoldPadding)
        )
    }
}