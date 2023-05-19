package io.github.ishaileshmishra

import okhttp3.OkHttpClient
import okhttp3.Request

val client = OkHttpClient()
val request = Request.Builder()
    .url("https://api.pexels.com/v1/search?query=pastry/orientation=square")
    .addHeader("Authorization", "")
    .addHeader(
        "Cookie",
        ""
    )
    .build()
val response = client.newCall(request).execute()