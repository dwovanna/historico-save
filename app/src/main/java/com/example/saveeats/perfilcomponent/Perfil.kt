package com.example.saveeats.perfilcomponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.saveeats.R

@Composable
fun Perfil() {

    var searchState by remember{
        mutableStateOf(TextFieldValue(""))
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {

        Row() {

            Icon(
                painter = painterResource(id = R.drawable.seta_saida),
                contentDescription = "",
                modifier = Modifier.size(30.dp)
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row {
                Image(
                    painter = painterResource(id = com.example.saveeats.R.drawable.mulherteste),
                    contentDescription = "",
                    modifier = Modifier
                        .size(80.dp)
                )

                Spacer(modifier = Modifier.width(16.dp))

                Column(

                ) {

                    Text(text = "Amanda Santos",
                        fontSize = 18.sp,
                    )

                    Text(text = "santosamanda@gmail.com",
                        color = Color(85, 85, 85)
                    )

                }

            }

            Spacer(modifier = Modifier.height(40.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.width(320.dp)
            ) {
                OutlinedTextField(
                    value = searchState,
                    onValueChange = {
                        searchState = it
                    },
                    modifier = Modifier
                        .height(60.dp)
                        .width(320.dp)
                    ,
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.person),
                            contentDescription = "",
                            tint = Color(72, 138, 39)
                        )
                    },
                    label = {
                        Text(
                            text = "Amanda Santos",
                        )
                    },
                    shape = RoundedCornerShape(30),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color(72,138,39),
                        unfocusedBorderColor = Color(72,138,39)
                    )

                )

                Spacer(modifier = Modifier.height(15.dp))

                OutlinedTextField(
                    value = searchState,
                    onValueChange = {
                        searchState = it
                    },
                    modifier = Modifier
                        .height(60.dp)
                        .width(320.dp)
                    ,
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.cpf),
                            contentDescription = "",
                            tint = Color(72, 138, 39)
                        )
                    },
                    label = {
                        Text(
                            text = "000.00-123",
                        )
                    },
                    shape = RoundedCornerShape(30),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color(72,138,39),
                        unfocusedBorderColor = Color(72,138,39)
                    )

                )

                Spacer(modifier = Modifier.height(15.dp))

                OutlinedTextField(
                    value = searchState,
                    onValueChange = {
                        searchState = it
                    },
                    modifier = Modifier
                        .height(60.dp)
                        .width(320.dp)
                    ,
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.senha),
                            contentDescription = "",
                            tint = Color(72, 138, 39)
                        )
                    },
                    label = {
                        Text(
                            text = "***********",
                        )
                    },
                    shape = RoundedCornerShape(30),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color(72,138,39),
                        unfocusedBorderColor = Color(72,138,39)
                    )

                )

                Spacer(modifier = Modifier.height(15.dp))

                OutlinedTextField(
                    value = searchState,
                    onValueChange = {
                        searchState = it
                    },
                    modifier = Modifier
                        .height(60.dp)
                        .width(320.dp)
                    ,
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.celular),
                            contentDescription = "",
                            tint = Color(72, 138, 39)
                        )
                    },
                    label = {
                        Text(
                            text = "11-4345-9087",
                        )
                    },
                    shape = RoundedCornerShape(30),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color(72,138,39),
                        unfocusedBorderColor = Color(72,138,39)
                    )

                )

                Spacer(modifier = Modifier.height(15.dp))

                OutlinedTextField(
                    value = searchState,
                    onValueChange = {
                        searchState = it
                    },
                    modifier = Modifier
                        .height(60.dp)
                        .width(320.dp)
                    ,
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.person),
                            contentDescription = "",
                            tint = Color(72, 138, 39)
                        )
                    },
                    label = {
                        Text(
                            text = "amanda@gmail.com",
                        )
                    },
                    shape = RoundedCornerShape(30),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color(72,138,39),
                        unfocusedBorderColor = Color(72,138,39)
                    )

                )

                Spacer(modifier = Modifier.height(50.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End

                ) {

                    Button(onClick = { /*TODO*/ },
                        modifier = Modifier
                            .height(45.dp)
                            .width(130.dp),
                        shape = RoundedCornerShape(size = 20.dp),
                        colors = ButtonDefaults.buttonColors(
                            Color(72,138,39)
                        )
                    ){

                        Text(text = "Salvar",
                            color = Color.White,
                            fontSize = 20.sp)
                    }

                }
            }






        }



    }
}






@Preview(showSystemUi = true)
@Composable
fun PerfilPreview() {
    Perfil()
}