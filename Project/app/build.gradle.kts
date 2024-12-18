//plugins {
//    alias(libs.plugins.android.application)
//    alias(libs.plugins.kotlin.android)
//    alias(libs.plugins.kotlin.compose)
//}
//
//android {
//    namespace = "com.example.newsheadlines"
//    compileSdk = 34
//
//    defaultConfig {
//        applicationId = "com.example.newsheadlines"
//        minSdk = 24
//        targetSdk = 34
//        versionCode = 1
//        versionName = "1.0"
//
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//    }
//
//    buildTypes {
//        release {
//            isMinifyEnabled = false
//            proguardFiles(
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
//        }
//    }
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_11
//        targetCompatibility = JavaVersion.VERSION_11
//    }
//    kotlinOptions {
//        jvmTarget = "11"
//    }
//    buildFeatures {
//        compose = true
//    }
//}
//
//dependencies {
//    //
//    implementation ("androidx.room:room-common:2.5.0")
//    implementation ("androidx.room:room-ktx:2.5.0")
//    //
//    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
//    implementation ("com.squareup.okhttp3:okhttp:5.0.0-alpha.2")
//    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
//    //
//    implementation("io.coil-kt:coil-compose:1.4.0")
//    implementation(libs.androidx.core.ktx)
//    implementation(libs.androidx.lifecycle.runtime.ktx)
//    implementation(libs.androidx.activity.compose)
//    implementation(platform(libs.androidx.compose.bom))
//    implementation(libs.androidx.ui)
//    implementation(libs.androidx.ui.graphics)
//    implementation(libs.androidx.ui.tooling.preview)
//    implementation(libs.androidx.material3)
//    testImplementation(libs.junit)
//    androidTestImplementation(libs.androidx.junit)
//    androidTestImplementation(libs.androidx.espresso.core)
//    androidTestImplementation(platform(libs.androidx.compose.bom))
//    androidTestImplementation(libs.androidx.ui.test.junit4)
//    debugImplementation(libs.androidx.ui.tooling)
//    debugImplementation(libs.androidx.ui.test.manifest)
//
//    implementation ("androidx.compose.material:material:1.0.5")
//    implementation ("androidx.compose.ui:ui-tooling:1.0.5")
//    implementation ("androidx.compose.material:material:1.5.0")
//    implementation ("androidx.compose.ui:ui-tooling-preview:1.5.0")
//
//}
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.newsheadlines"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.newsheadlines"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    // Room components
    implementation("androidx.room:room-common:2.5.0")
    implementation("androidx.room:room-ktx:2.5.0")

    // Retrofit and OkHttp
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:5.0.0-alpha.2")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // Coil for image loading
    implementation("io.coil-kt:coil-compose:1.4.0")

    // AndroidX components
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)

    // Compose libraries
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.material3)
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)

    // Testing libraries
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // Avoid duplicates
    implementation("androidx.compose.material:material:1.5.0")
    implementation("androidx.compose.ui:ui-tooling:1.5.0")
    implementation("androidx.compose.ui:ui-tooling-preview:1.5.0")
    implementation("io.coil-kt:coil-compose:1.4.0")

}

