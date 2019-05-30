package com.johnlewis.merch

import dagger.Component

@Component(modules = arrayOf( TestModule::class ))
interface AppMaker {
    fun app(): App
}
