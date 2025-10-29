pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Demonstrations"
include(":app")
include(":mod2demovariable")
include(":mod2conditionsboucle")
include(":mod2functions")
include(":mod2kotlinpoo")
include(":mod3layout")
include(":mod3spacermodifier")
include(":mod4gestioninteraction")
include(":mod4viewmodel")
include(":mod3lazycolumn")
