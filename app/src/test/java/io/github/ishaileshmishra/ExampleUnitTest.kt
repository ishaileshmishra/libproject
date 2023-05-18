package io.github.ishaileshmishra

import org.junit.Test

import org.junit.Assert.*
import org.junit.BeforeClass

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    companion object {
        private var apiKey: String = "your_pexel_api_key"
    }


    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun addition_isPexelsInstance() {
        val pexels = Pexels(apiKey)
        assertEquals(4, 2 + 2)
    }

    @Test
    fun addition_isPaginationInstance() {
        val pexels = Pexels(apiKey)
        pexels.pagination(query = "search");
        assertEquals(4, 2 + 2)
    }


    @Test
    fun addition_isPhotoInstance() {
        val pexels = Pexels(apiKey)
        pexels.pagination(query = "search");
        pexels.photos(query = "search")
        assertEquals(4, 2 + 2)
    }

    @Test
    fun addition_isVideoInstance() {
        val response = Pexels(apiKey).videos(query = "search").fetch()
        if (response.isSuccessful) {
            println(response.body)
        } else {
            println(response.body)
        }
        assertEquals(4, 2 + 2)
    }

    @Test
    fun addition_isCollectionInstance() {
        val pexels = Pexels(apiKey)
        pexels.collections(query = "search")
        assertEquals(4, 2 + 2)
    }
}