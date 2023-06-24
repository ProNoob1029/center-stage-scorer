@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    id("center_stage_scorer.android.library")
    id("center_stage_scorer.android.library.compose")
}

android {
    namespace = "com.phoenix.center_stage_scorer.core.designsystem"
    /*lint {
        checkDependencies = true
    }*/
}

dependencies {
    api(libs.compose.foundation)
    api(libs.compose.foundation.layout)
    api(libs.compose.material.iconsExtended)
    api(libs.compose.ui.util)
    api(libs.compose.ui.tooling.preview)
    api(libs.compose.material3)
    api(libs.compose.runtime)

    debugApi(libs.compose.ui.tooling)

    implementation(libs.core.ktx)
}