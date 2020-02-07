package me.kay.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class ReleasePlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        println '======================================================================================================'
        project.extensions.create("releaseInfo", ReleaseInfo)
        project.tasks.create("releaseInfoTask", ReleaseInfoTask)
    }
}
