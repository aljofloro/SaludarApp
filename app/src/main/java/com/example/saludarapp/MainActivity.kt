package com.example.saludarapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.saludarapp.ui.theme.SaludarAppTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContent {
      SaludarAppTheme {

        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize()
          , color = MaterialTheme.colors.background) {
          var name by remember{ mutableStateOf("") }
          var apellido by remember{ mutableStateOf("") }
          Row(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.fillMaxWidth()) {

              StyledTextField(name= name,onNameChanged = {name = it})
              StyledTextField(name= apellido,onNameChanged = {apellido = it})
              Btn_hola(baseContext,name,apellido)
            }
          }
        }
      }
    }
  }
}