import com.phoenix.center_stage_scorer.ScorerBuildType

@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    id("center_stage_scorer.android.application")
    id("center_stage_scorer.android.application.compose")
    id("center_stage_scorer.android.hilt")
    id("center_stage_scorer.android.application.flavors")
    //alias(libs.plugins.com.android.application)
    //alias(libs.plugins.org.jetbrains.kotlin.android)
}

android {
    namespace = "com.phoenix.center_stage_scorer"
    //compileSdk = 33

    defaultConfig {
        applicationId = "com.phoenix.center_stage_scorer"
        //minSdk = 24
        //targetSdk = 33
        versionCode = 1
        versionName = "0.0.1"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        debug {
            applicationIdSuffix = ScorerBuildType.DEBUG.applicationIdSuffix
        }

        val release by getting {
            isMinifyEnabled = true
            applicationIdSuffix = ScorerBuildType.RELEASE.applicationIdSuffix
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("debug")
        }
        create("benchmark") {
            // Enable all the optimizations from release build through initWith(release).
            initWith(release)
            matchingFallbacks += listOf("release")
            // Debug key signing is available to everyone.
            signingConfig = signingConfigs.getByName("debug")
            // Only use benchmark proguard rules
            proguardFiles("benchmark-rules.pro")
            isMinifyEnabled = true
            applicationIdSuffix = ScorerBuildType.BENCHMARK.applicationIdSuffix
        }
    }
    /*compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.androidxComposeCompiler.get()
    }*/
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    @Suppress("UnstableApiUsage")
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}

dependencies {
    implementation(project(":core:designsystem"))

    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.core.ktx)
    implementation(libs.activity.compose)
    //implementation(platform(libs.compose.bom))
    //implementation(libs.compose.ui)
    //implementation(libs.compose.ui.graphics)
    //implementation(libs.compose.ui.tooling.preview)
    //implementation(libs.compose.material3)
    testImplementation(libs.junit4)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
    //androidTestImplementation(platform(libs.compose.bom))
    //androidTestImplementation(libs.compose.ui.test.junit4)
    //debugImplementation(libs.compose.ui.tooling)
    debugImplementation(libs.compose.ui.test.manifest)
}