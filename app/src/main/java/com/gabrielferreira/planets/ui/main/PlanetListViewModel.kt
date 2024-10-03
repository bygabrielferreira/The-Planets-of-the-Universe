package com.gabrielferreira.planets.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import com.gabrielferreira.planets.data.PlanetsRepository

class PlanetListViewModel : ViewModel() {
    private val repository = PlanetsRepository()
    private val state = MutableLiveData<State>()
    val viewState: LiveData<State>
        get() = state

    fun loadData() {
        viewModelScope.launch {
            state.value = State.Loading
            val planets = repository.getPlanetsList()
            state.value = State.Content(planets)
        }
    }
}

sealed class State {
    data class Content(val list: List<PlanetData>) : State()
    object Loading : State()

    object Error : State()
}