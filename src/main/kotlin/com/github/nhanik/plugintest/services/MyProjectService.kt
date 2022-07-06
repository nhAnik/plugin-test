package com.github.nhanik.plugintest.services

import com.intellij.openapi.project.Project
import com.github.nhanik.plugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
