@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    id("center_stage_scorer.android.feature")
    id("center_stage_scorer.android.library.compose")
}

android {
    namespace = "com.phoenix.center_stage_scorer.feature.editor"
}