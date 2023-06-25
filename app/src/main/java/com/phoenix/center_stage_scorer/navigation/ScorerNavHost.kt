package com.phoenix.center_stage_scorer.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.phoenix.center_stage_scorer.feature.editor.navigation.editorGraph
import com.phoenix.center_stage_scorer.feature.editor.navigation.editorGraphRoutePattern

@Composable
fun ScorerNavHost(
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = editorGraphRoutePattern,
        modifier = modifier
    ) {
        editorGraph()
    }
}