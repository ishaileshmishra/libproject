package io.github.ishaileshmishra

import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

class Videos(client: OkHttpClient, urlPath: Request) : QueryParams {

    private val queryParams = hashMapOf<String, Any>()

    override fun addParam(key: String, value: String) {
        this.queryParams[key] = value
    }

    override fun addParams(queryParams: HashMap<String, Object>) {
        this.queryParams.putAll(queryParams)
    }

    fun fetch(): Response {
        return client.newCall(request).execute()
    }

}