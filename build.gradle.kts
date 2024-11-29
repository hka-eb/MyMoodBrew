// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.dagger.hilt.android) apply false
    //idk why i had to hardcode the version here but it wasnt working without it...
    //<catMeme>why do you have to make things so complicated</catMeme>
    id("com.google.devtools.ksp") version "1.9.24-1.0.20" apply false
}