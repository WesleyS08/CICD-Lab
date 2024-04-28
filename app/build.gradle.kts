plugins {
    alias(libs.plugins.androidApplication) // Verifique se está configurado corretamente
}

android {
    namespace = "com.example.mqttav" // Verifique se este é o namespace correto
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mqttav"
        minSdk = 26
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    packaging {
        resources {
            val exclusions = mutableListOf(
                "META-INF/INDEX.LIST",
                "META-INF/io.netty.versions.properties"
            )
            excludes.addAll(exclusions)
        }
    }

}



dependencies {
    implementation("com.hivemq:hivemq-mqtt-client:1.2.1")
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
