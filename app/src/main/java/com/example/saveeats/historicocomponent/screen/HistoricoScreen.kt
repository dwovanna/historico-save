package com.example.saveeats.historicocomponent.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.saveeats.historicocomponent.componentes.Form

@Composable
fun HistoricoScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Form()
    }

}

@Preview(showSystemUi = true)
@Composable
fun HistoricoScreenPreview() {
    HistoricoScreen()
}