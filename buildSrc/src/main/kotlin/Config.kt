const val rootName = "taboolib-project-sdk"
const val rootGroup = "org.example"
const val rootVersion = "1.0.0"

val installedTaboolibModules = setOf(
    "common",
    "common-5",
    "platform-bukkit",
    "module-nms",
    "module-nms-util",
    "module-kether",
    "module-configuration",
    "module-lang",
    "module-chat",
    "module-database",
    "module-metrics",
    "expansion-javascript",
    "expansion-player-database",
)

const val kotlinVersion = "1.8.10"
const val shadowJarVersion = "8.1.0"
const val repoTabooProject = "http://ptms.ink:8081/repository/releases"

val taboolibGradlePluginVersion = latestTaboolibPluginVersion
    .also { println("Using taboolib-gradle-plugin-version = $it") }
val taboolibVersion = latestTaboolibVersion
    .also { println("Using taboolib-version = $it") }