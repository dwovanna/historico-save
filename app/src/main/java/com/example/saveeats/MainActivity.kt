package com.example.saveeats

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.saveeats.historicocomponent.componentes.Receitas
import com.example.saveeats.historicocomponent.screen.HistoricoScreen
import com.example.saveeats.ui.theme.SaveEatsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SaveEatsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Receitas()
                }
            }
        }
    }
}



