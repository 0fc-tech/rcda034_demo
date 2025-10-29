package com.example.mod4viewmodel

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun RatingScreen(modifier: Modifier = Modifier,
                 viewModel: RatingViewModel = viewModel()) {
    val currentRating by viewModel.currentRating.collectAsState()
    val ratingState by viewModel.ratingState.collectAsState()
    val userAnswer by viewModel.userAnswer.collectAsState()

    Column(modifier) {
        Slider(
            value = currentRating,
            steps = 9,
            valueRange = 0f..10f,
            onValueChange = { viewModel.updateRating(it)}
        )
        if(!ratingState){
            Text("Qu'est ce qu'on pourrait faire de mieux la prochaine fois")
            TextField(
                value=userAnswer,
                onValueChange = {viewModel.updateText(it)}
            )
        }else{
            Text("Nous sommes contents de voir que cela s'est bien passé")
        }
    }

}