package com.github.buptfarmer.androidpackageanalyzerplugin.services

import com.intellij.openapi.project.Project
import com.github.buptfarmer.androidpackageanalyzerplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
