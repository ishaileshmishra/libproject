package io.github.ishaileshmishra

import okhttp3.OkHttpClient
import okhttp3.Request

val client = OkHttpClient()
val request = Request.Builder()
    .url("https://api.pexels.com/v1/search?query=pastry/orientation=square")
    .addHeader("Authorization", "563492ad6f91700001000001d823a46fa27543d99343990fe281a219")
    .addHeader(
        "Cookie",
        "__cf_bm=LeFTdBTL6WPmEnI5CAOD6gSFbGxzNnX7CS0fDf1oXe0-1684407765-0-ASjGfps7Dh8Yt2hPLLZFaIZBgrhyr7Wm8wegcRXjC8EZ9yUUmAgzV+SL/fTN/bZJ937OVfmMFbr/2I23WVHLXgg="
    )
    .build()
val response = client.newCall(request).execute()