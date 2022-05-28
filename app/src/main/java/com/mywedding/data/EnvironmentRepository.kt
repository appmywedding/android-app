package com.mywedding.data

import javax.inject.Inject

class EnvironmentRepository @Inject constructor() {
    var currentEnvironment: Environments = Environments.Dev // ToDo: Make it persistent
}

enum class Environments {
    Production,
    Dev
}