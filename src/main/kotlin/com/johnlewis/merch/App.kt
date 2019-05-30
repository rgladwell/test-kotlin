package com.johnlewis.merch

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import javax.inject.Inject

class App @Inject constructor(info: Info) {
    val message = info.message
}

fun main(args: Array<String>) {
    val app =
        DaggerAppMaker
            .builder()
            .build()
            .app()

    embeddedServer(Netty, 8080) {
        routing {
            get("/") {
                call.respondText(app.message, ContentType.Text.Html)
            }
        }
    }.start(wait = true)
}
