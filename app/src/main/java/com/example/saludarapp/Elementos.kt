package com.example.saludarapp

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldColors
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StyledTextField(name:String,onNameChanged:(String) -> Unit){

  OutlinedTextField(value = name,
    onValueChange = onNameChanged,
    label = { Text("Ingrese su Nombre") },
    modifier = Modifier
      .padding(20.dp)
      .fillMaxWidth()
  )
}

@Composable
fun Btn_hola(context: Context,name: String,apellido:String){
  Button(onClick = { onSaludar(context,name,apellido) },
  modifier = Modifier.padding(20.dp).fillMaxWidth()) {
    Text(text = "Saludo")
  }
}


fun onSaludar(context:Context,name:String,apellido: String){
  var intent = Intent(context,Saludo::class.java)
  intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
  intent.putExtra("name",name)
  intent.putExtra("apellido",apellido)
  context.startActivity(intent)
}

/**
 *  @param String name
 *  @description Método para Compose Saludo
 */
@Composable
fun Greeting(name: String,apellido:String) {
  Text(text = "Hola $name $apellido!", fontSize = 25.sp)
}
