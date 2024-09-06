package com.marcossalto.basicloginapp.ui

sealed class LoginEvent {
    data object OnLoginButtonClicked : LoginEvent()
}