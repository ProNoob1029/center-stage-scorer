package com.phoenix.center_stage_scorer.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.phoenix.center_stage_scorer.feature.editor.navigation.editorRoute
import com.phoenix.center_stage_scorer.feature.editor.navigation.editorScreen

@Composable
fun ScorerNavHost(
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = editorRoute,
        modifier = modifier
    ) {
        editorScreen()
    }
}