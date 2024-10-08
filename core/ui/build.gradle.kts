plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.ksp.android)
}

android {
    namespace = "ru.sogya.healthivity.core.ui"
    buildFeatures {
        compose = true
        buildConfig = true
    }
}

dependencies {

    api(libs.androidx.core.ktx)
    api(libs.androidx.lifecycle.runtime.ktx)
    api(libs.androidx.activity.compose)
    api(platform(libs.androidx.compose.bom))
    api(libs.androidx.ui)
    api(libs.androidx.ui.graphics)
    api(libs.androidx.ui.tooling.preview)
    api(libs.androidx.material3)


    debugApi(libs.yatagan.api.dynamic)
    releaseApi(libs.yatagan.api.compiled)
    kspRelease(libs.yatagan.processor.ksp)
}