package com.example.listrepoapp.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Endpoint {
    @GET("search/repositories?q=language:kotlin&sort=stars")
    suspend fun getPosts(@Query("page") page: Int):
            Response<ApiResponse<Posts>>
}