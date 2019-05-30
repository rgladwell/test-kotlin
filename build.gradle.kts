plugins {
    id("org.jetbrains.kotlin.jvm").version("1.3.21")
    application
    kotlin("kapt") version "1.3.31"
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    implementation("com.google.dagger:dagger:2.22.1" )
    kapt("com.google.dagger:dagger-compiler:2.22.1" )

    compile("io.ktor:ktor-server-netty:1.2.1")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    mainClassName = "com.johnlewis.merch.AppKt"
}
