package io.yokata.plugins

import io.ktor.server.application.*
import io.ktor.server.routing.*
import io.yokata.routes.search.searchExternalAPI

fun Application.configureRouting() {
    routing {
        searchExternalAPI()
    }
}
