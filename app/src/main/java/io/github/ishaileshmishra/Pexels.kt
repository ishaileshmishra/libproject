package io.github.ishaileshmishra

import okhttp3.OkHttpClient
import okhttp3.Request
import org.jetbrains.annotations.NotNull


private fun buildRequest(url: String, apiKey: String, cookie: String = ""): Request {
    return Request.Builder()
        .url(url)
        .addHeader("Authorization", apiKey)
        .addHeader(
            "Cookie", cookie
        ).build()
}


class Pexels constructor(
    @NotNull val apiKey: String,
    private val cookie: String = "",
    private val client: OkHttpClient = OkHttpClient(),
    private val protocol: String = "https://",
    private val host: String = "api.pexels.com",
    private val version: String = "v1"
) {

    private fun validateAndReturnEndpoint(): String {
        if (apiKey.isBlank() || apiKey.isEmpty()) {
            throw NullPointerException("api_key is required field")
        }

        return "$protocol$host/$version/"
    }

    fun pagination(query: String, page: Int = 1, perPage: Int = 10): Pagination {
        var urlPath = validateAndReturnEndpoint()
        urlPath = "$urlPath$query?page=$page&perPage=$perPage"
        val request: Request = buildRequest(urlPath, apiKey, cookie)
        return Pagination(client, request)
    }

    fun photos(query: String): Photos {
        var urlPath = validateAndReturnEndpoint()
        urlPath = "$urlPath$query"
        val request: Request = buildRequest(urlPath, apiKey, cookie)
        return Photos(client, request)
    }

    fun videos(query: String): Videos {
        var urlPath = validateAndReturnEndpoint()
        urlPath = "$urlPath$query"
        val request: Request = buildRequest(urlPath, apiKey, cookie)
        return Videos(client, request)
    }

    fun collections(query: String): Collection {
        var urlPath = validateAndReturnEndpoint()
        urlPath = "$urlPath$query"
        val request: Request = buildRequest(urlPath, apiKey, cookie)
        return Collection(client, request)
    }
}