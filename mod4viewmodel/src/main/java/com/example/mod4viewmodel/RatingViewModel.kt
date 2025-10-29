package com.example.mod4viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
class RatingViewModel : ViewModel() {
    val _ratingState = MutableStateFlow(false)
    val ratingState : StateFlow<Boolean> = _ratingState

    val _currentRating = MutableStateFlow(5f)
    val currentRating : StateFlow<Float> = _currentRating

    val _userAnswer = MutableStateFlow<String>("")
    val userAnswer : StateFlow<String> = _userAnswer

    fun updateText(text: String) {
        _userAnswer.value = text
    }

    fun updateRating(rating: Float) {
        if (rating < 8) {
            _ratingState.value = false
        } else {
            _ratingState.value = true
            _userAnswer.value = ""
        }
        _currentRating.value = rating
    }
}