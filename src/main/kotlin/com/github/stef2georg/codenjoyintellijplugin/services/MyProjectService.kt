package com.github.stef2georg.codenjoyintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.stef2georg.codenjoyintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
