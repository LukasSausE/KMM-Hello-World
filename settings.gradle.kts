pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
    }
    
}
rootProject.name = "KMM-Hello-World"


include(":iosApp")
include(":androidApp")
include(":shared")
