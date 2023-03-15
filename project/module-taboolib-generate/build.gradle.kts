plugins {
    id("io.izzel.taboolib") version taboolibGradlePluginVersion
}

taboolib {
    version = taboolibVersion
    installedTaboolibModules.forEach { install(it) }

    description {
        name = rootName

        contributors {
            name("Arasple")
        }

        dependencies {
            name("PlaceholderAPI").optional(true)
        }

        bukkitNodes = HashMap<String, Any>().apply {
            put("api-version", 1.13)
            put("built-date", currentISODate)
            put("built-by", systemUserName)
            put("built-os", systemOS)
            put("built-ip", systemIP)
        }

    }

    classifier = null
    options("skip-minimize", "keep-kotlin-module", "skip-taboolib-relocate")
}