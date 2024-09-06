package com.marcossalto.basicloginapp.ui.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.marcossalto.basicloginapp.ui.LoginState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class LoginViewModel() : ViewModel() {
    val _state = MutableStateFlow<LoginState>(LoginState.Idle)
    val state = _state.asStateFlow()

    fun onLoginButtonClicked(userName: String, password: String) {
        _state.value = LoginState.Loading

        viewModelScope.launch {
            delay(2000)
            if (userName != "admin" || password != "admin") {
                _state.value = LoginState.Success
            } else {
                _state.value = LoginState.Error("Invalid credentials")
            }
        }
    }
}