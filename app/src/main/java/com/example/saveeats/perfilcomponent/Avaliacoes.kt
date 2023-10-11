package com.example.saveeats.perfilcomponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.saveeats.R

@Composable
fun Avaliacoes() {

    var favoriteState by remember {
        mutableStateOf(false)
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
                    painter = painterResource(id = R.drawable.mulherteste),
                    contentDescription = "",
                    modifier = Modifier
                        .size(80.dp)
                )

                Spacer(modifier = Modifier.width(16.dp))

                Column(

                ) {

                    Text(
                        text = "Amanda Santos",
                        fontSize = 18.sp,
                    )

                    Text(
                        text = "santosamanda@gmail.com",
                        color = Color(85, 85, 85)
                    )

                }

            }


        }

        Spacer(modifier = Modifier.height(30.dp))

        Row {

            Text(
                text = "Avaliações ",
                fontSize = 22.sp,
                color = Color(20, 58, 11)
            )

        }

        Spacer(modifier = Modifier.height(10.dp))

        Column(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,


                ) {

                items(5) {

                    Spacer(modifier = Modifier.height(20.dp))

                    Card(
                        modifier = Modifier
                            .width(350.dp)
                            .height(70.dp)
                            .shadow(
                                elevation = 8.dp,
                                spotColor = Color(0xFF000000),
                                ambientColor = Color(0xFF000000),
                                shape = RoundedCornerShape(10.dp)
                            ),
                        backgroundColor = Color(233, 233, 234),
                        shape = RoundedCornerShape(10.dp),
                    ) {


                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(5.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.pizzaseg),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(60.dp)
                            )

                            Column(
                                modifier = Modifier
                                    .absoluteOffset(x = -35.dp)
                            ) {

                                Text(
                                    text = "Pizzaria Dois Irmãos",
                                    fontSize = 18.sp
                                )

                                Row() {

                                    Icon(
                                        painter = painterResource(id = com.example.saveeats.R.drawable.estrelinhas),
                                        contentDescription = "",
                                        tint = Color(255, 193, 7, 255),
                                        modifier = Modifier.width(18.dp)
                                    )

                                    Spacer(modifier = Modifier.width(5.dp))

                                    Text(
                                        text = "4.6",
                                        fontSize = 14.sp,
                                        color = Color(255, 193, 7, 255)
                                    )

                                    Spacer(modifier = Modifier.width(10.dp))

                                    Text(
                                        text = "Pizzaria",
                                        fontSize = 14.sp,
                                        color = Color(104, 104, 104)
                                    )

                                }


                            }
                            if (favoriteState == false) {
                                Icon(
                                    painter = painterResource(id = R.drawable.favoritei),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(22.dp)
                                        .clickable{
                                            favoriteState = true
                                        },
                                    tint = Color(155,155,155)
                                )

                            } else {
                                Icon(
                                    painter = painterResource(id = R.drawable.favoritos),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(22.dp)
                                        .clickable{
                                            favoriteState = false
                                        },
                                    tint = Color(255, 0, 0, 255)
                                )
                            }


                        }
                    }
                }
            }


        }

    }


}


@Preview(showSystemUi = true)
@Composable
fun AvaliacoesPreview() {
    Avaliacoes()
}