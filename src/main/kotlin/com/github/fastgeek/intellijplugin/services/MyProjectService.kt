package com.github.fastgeek.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.fastgeek.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
