import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id("com.github.johnrengelman.shadow") version shadowJarVersion
}

dependencies {
    compileTabooLib()
    compileCore(11903)

    rootProject
        .childProjects["project"]!!
        .childProjects
        .values
        .forEach { implementation(it) }
}

tasks {
    withType<ShadowJar> {
        // options
        archiveAppendix.set("")
        archiveClassifier.set("")
        archiveVersion.set(rootVersion)
        archiveBaseName.set(rootName)
        // exclude
        exclude("META-INF/**")
        // taboolib
        relocate("taboolib", "$rootGroup.taboolib")
        relocate("org.tabooproject", "$rootGroup.taboolib.library")
        // kotlin
        relocate("kotlin.", "kotlin1810.") { exclude("kotlin.Metadata") }
    }
    build {
        dependsOn(shadowJar)
    }
}