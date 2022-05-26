package com.example.listrepoapp.repos

import com.example.listrepoapp.api.Posts

sealed class ReposViewState {

    data class Repos (val posts: List<Posts>) : ReposViewState()

    object Empty : ReposViewState()

    object Error : ReposViewState()

    object ErrorTimeOut : ReposViewState()

}
