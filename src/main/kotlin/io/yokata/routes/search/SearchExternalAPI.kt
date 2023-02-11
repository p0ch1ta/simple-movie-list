package io.yokata.routes.search

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.searchExternalAPI() {
    route("/search") {
        get("/name") {
            call.respondText("Test")
        }
    }
}