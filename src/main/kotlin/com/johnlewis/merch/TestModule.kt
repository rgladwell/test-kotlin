package com.johnlewis.merch

import dagger.Module
import dagger.Provides

@Module
class TestModule() {

    @Provides fun info(): Info = Greeting

}
