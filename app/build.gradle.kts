plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
//    alias(libs.plugins.dagger.hilt)
//    alias(libs.plugins.google.services)
//    alias(libs.plugins.google.ksp)
//    alias(libs.plugins.jetbrains.kotlin.compose)
    id("io.realm.kotlin")
}

android {
    namespace = "com.example.diaryapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.diaryapp"
        minSdk = 23
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
//    // Compose Navigation
//    implementation(libs.androidx.navigation.compose)
//    // Firebase
//    implementation(libs.firebase.auth.ktx)
//    implementation(libs.firebase.storage.ktx)
//
//    // Room components
//    implementation(libs.androidx.room.runtime)
//    ksp(libs.androidx.room.compiler)
//    implementation(libs.androidx.room.ktx)
//
//    // Runtime Compose
//    implementation(libs.androidx.lifecycle.runtime.compose)
//
//    // Splash API
//    implementation(libs.androidx.core.splashscreen)
//
//    // Mongo DB Realm
//    implementation(libs.kotlinx.coroutines.core)
//    implementation(libs.library.sync)
//
//    // Dagger Hilt
//    implementation(libs.hilt.android)
//    ksp(libs.hilt.compiler)
//    implementation(libs.androidx.hilt.navigation.compose)
//
//    // Coil
//    implementation(libs.coil.compose)
//
//    // Date-Time Picker
//    implementation(libs.core)
//
//    // CALENDAR
//    implementation(libs.calendar)
//
//    // CLOCK
//    implementation(libs.clock)
//
//    // Message Bar Compose
//    implementation(libs.messagebarcompose)
//
//    // One-Tap Compose
//    implementation(libs.onetapcompose)
//
//    // Desugar JDK
//    coreLibraryDesugaring(libs.desugar.jdk.libs)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}