package com.github.johan-sun.ideapluginsample.services

import com.intellij.openapi.project.Project
import com.github.johan-sun.ideapluginsample.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
