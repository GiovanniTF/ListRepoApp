package com.example.listrepoapp.api

import com.google.gson.annotations.SerializedName

data class ApiResponse<T>(
    @SerializedName("items")
    val response: List<T>
)
