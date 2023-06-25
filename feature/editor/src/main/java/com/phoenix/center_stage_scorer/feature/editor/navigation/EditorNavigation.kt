package com.phoenix.center_stage_scorer.feature.editor.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.phoenix.center_stage_scorer.feature.editor.EditorScreen

const val editorGraphRoutePattern = "editor_graph"
const val editorRoute = "editor_route"

fun NavController.navigateToEditorGraph(navOptions: NavOptions? = null) {
    this.navigate(editorGraphRoutePattern, navOptions)
}

fun NavGraphBuilder.editorGraph(
    nestedGraphs: NavGraphBuilder.() -> Unit = {},
) {
    navigation(
        route = editorGraphRoutePattern,
        startDestination = editorRoute
    ) {
        composable(route = editorRoute) {
            EditorScreen()
        }
        nestedGraphs()
    }
}