package com.example.listrepoapp.api

import com.example.listrepoapp.api.WebClient.createEndpoint
import org.koin.dsl.module

val apiModule = module {
    single { createEndpoint() }
}