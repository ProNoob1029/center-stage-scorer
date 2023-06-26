package com.phoenix.center_stage_scorer.feature.editor.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.phoenix.center_stage_scorer.feature.editor.EditorScreen

const val editorRoute = "editor_route"

fun NavController.navigateToEditorGraph(navOptions: NavOptions? = null) {
    this.navigate(editorRoute, navOptions)
}

fun NavGraphBuilder.editorScreen() {
    composable(route = editorRoute) {
        EditorScreen()
    }
}