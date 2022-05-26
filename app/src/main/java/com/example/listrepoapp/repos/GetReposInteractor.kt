package com.example.listrepoapp.repos

import com.example.listrepoapp.api.ApiResponse
import com.example.listrepoapp.api.Endpoint
import com.example.listrepoapp.api.Posts
import retrofit2.Response

class GetReposInteractor(private val endpoint: Endpoint) {
    suspend fun execute(page : Int): Response<ApiResponse<Posts>> = endpoint.getPosts(page)
}