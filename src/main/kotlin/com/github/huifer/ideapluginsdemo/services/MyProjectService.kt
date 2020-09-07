package com.github.huifer.ideapluginsdemo.services

import com.intellij.openapi.project.Project
import com.github.huifer.ideapluginsdemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
