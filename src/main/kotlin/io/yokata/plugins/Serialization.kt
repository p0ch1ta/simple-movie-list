package io.yokata.plugins

import com.fasterxml.jackson.core.JsonGenerator
import io.ktor.serialization.jackson.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        jackson {
            enable(JsonGenerator.Feature.IGNORE_UNKNOWN)
            //enable(SerializationFeature.INDENT_OUTPUT)
        }
    }
}
