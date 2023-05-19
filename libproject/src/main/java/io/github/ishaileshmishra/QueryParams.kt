package io.github.ishaileshmishra

interface QueryParams {

    fun addParam(key: String, value: String);
    fun addParams(queryParams: HashMap<String, Object>);
}