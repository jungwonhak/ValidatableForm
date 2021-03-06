
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Find which updates are available by running
 *     `$ ./gradlew buildSrcVersions`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version.
 */
object Versions {
    const val de_fayard_buildsrcversions_gradle_plugin: String = "0.6.5"

    const val com_android_tools_build_gradle: String = "3.5.1"

    const val android_maven_gradle_plugin: String = "2.0" // available: "2.1"

    const val gradle_bintray_plugin: String = "1.7.3" // available: "1.8.4"

    const val org_jetbrains_kotlin: String = "1.3.50"

    const val easyvalidation_core: String = "1.0.1"

    const val androidx_lifecycle: String = "2.1.0"

    const val core_ktx: String = "1.1.0"

    const val material: String = "1.0.0"

    /**
     * Current version: "5.4.1"
     * See issue 19: How to update Gradle itself?
     * https://github.com/jmfayard/buildSrcVersions/issues/19
     */
    const val gradleLatestVersion: String = "5.6.2"
}

/**
 * See issue #47: how to update buildSrcVersions itself
 * https://github.com/jmfayard/buildSrcVersions/issues/47
 */
val PluginDependenciesSpec.buildSrcVersions: PluginDependencySpec
    inline get() =
            id("de.fayard.buildSrcVersions").version(Versions.de_fayard_buildsrcversions_gradle_plugin)
