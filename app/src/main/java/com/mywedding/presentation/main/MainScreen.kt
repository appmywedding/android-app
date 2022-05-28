package com.mywedding.presentation.main

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.mywedding.ui.theme.MyWeddingTheme
import com.mywedding.util.DestinationNavigatorPreview
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Composable
@Destination(start = true)
fun MainScreen(
    navigator: DestinationsNavigator,
    viewModel: MainViewModel = hiltViewModel(),
) {
    val state = viewModel.state
    Column {
        Text("Hoi")
    }

}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyWeddingTheme {
        MainScreen(DestinationNavigatorPreview())
    }
}

