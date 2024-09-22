plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "net.afterday.compas"
    compileSdk = 34

    defaultConfig {
        applicationId = "net.afterday.compas"
        minSdk = 24
        targetSdk = 29
        versionCode = 1813
        versionName = "1813"

        testInstrumentationRunner = "com.support.android.test.runner.AndroidJUnitRunner"
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
}

dependencies {
    implementation(libs.rxandroid)
    // Because RxAndroid releases are few and far between, it is recommended you also
    // explicitly depend on RxJava's latest version for bug fixes and new features.
    // (see https://github.com/ReactiveX/RxJava/releases for latest 3.x.x version)
    implementation(libs.rxjava)
    implementation(libs.percent)
    implementation(libs.zxing.android.embedded)

    debugImplementation(libs.leakcanary.android)
    releaseImplementation(libs.leakcanary.android.no.op)
    implementation(libs.gson)
    implementation(libs.constraintlayout)
    implementation(libs.recyclerview)
    implementation(libs.legacy.support.v4)
    implementation(libs.zxing.android.embedded)
    implementation(libs.streamsupport)
    implementation(libs.design)

    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}