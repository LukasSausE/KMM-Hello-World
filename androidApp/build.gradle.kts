plugins {
    kotlin("multiplatform")
    id("com.android.application")
}

repositories {
    google()
}

kotlin {
    android()
    sourceSets {
        val androidMain by getting {
            dependencies {
                implementation(project(":shared"))
                implementation("com.google.android.material:material:1.3.0")
                implementation("androidx.appcompat:appcompat:1.3.0")
                implementation("androidx.constraintlayout:constraintlayout:2.0.4")
            }
        }
    }
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "dev.lause.kmm.hello.world.androidApp"
        minSdkVersion(24)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        viewBinding = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}
