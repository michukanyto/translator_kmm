package com.plcoding.translator_kmm.translate.data.remote

import io.ktor.client.HttpClient
import io.ktor.client.engine.darwin.Darwin
import io.ktor.serialization.kotlinx.json.json

actual class HttpClientFactory {
    actual fun create(): HttpClient {
        return io.ktor.client.HttpClient(Darwin) {
            install(io.ktor.client.plugins.contentnegotiation.ContentNegotiation) {
                json()
            }
        }
    }
}