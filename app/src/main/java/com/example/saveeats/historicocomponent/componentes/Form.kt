package com.example.saveeats.historicocomponent.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.text.Normalizer.Form

@Composable
fun Form() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp)
    ) {

        Text(
            text = "Histórico",
            fontSize = 25.sp,

            )

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {


            items(4) {

                Spacer(modifier = Modifier.height(25.dp))


                Row() {
                    Text(
                        text = "Seg 31 julho 2023",
                        color = Color(104, 104, 104),
                    )

                }

                Spacer(modifier = Modifier.height(10.dp))



                Card(
                    modifier = Modifier
                        .width(350.dp)
                        .height(147.dp)
                        .shadow(
                            elevation = 8.dp,
                            spotColor = Color(0xFF000000),
                            ambientColor = Color(0xFF000000),
                            shape = RoundedCornerShape(30.dp)
                        ),
                    backgroundColor = Color(212, 227, 204),
                    shape = RoundedCornerShape(30.dp)

                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(8.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(5.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = com.example.saveeats.R.drawable.pizzaa),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(50.dp)
                            )
                            
                            Spacer(modifier = Modifier.width(15.dp))

                            Text(
                                text = "Pizzaria Dois Irmãos",
                                fontSize = 20.sp
                            )
                        }

                        Spacer(modifier = Modifier.height(2.dp))

                        Card(
                            modifier = Modifier
                                .width(270.dp)
                                .height(1.5.dp),
                            backgroundColor = Color(255, 141, 6)
                        ) {

                        }

                        Spacer(modifier = Modifier.height(6.dp))

                        Row() {
                            Icon(
                                painter = painterResource(id = com.example.saveeats.R.drawable.baseline_verified_24),
                                contentDescription = "",
                                tint = Color(72, 138, 39),
                                modifier = Modifier.size(15.dp)
                            )

                            Spacer(modifier = Modifier.width(4.dp))

                            Text(
                                text = "Pedido concluído Nº 7800",
                                color = Color(104, 104, 104),
                                fontSize = 10.sp
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        Card(
                            modifier = Modifier
                                .width(145.dp)
                                .height(40.dp),
                            shape = RoundedCornerShape(30.dp),
                            backgroundColor = Color(72, 138, 39)

                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(5.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {

                                Text(
                                    text = "Detalhes do pedido",
                                    color = Color.White

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
fun FormPreview() {
    Form()
}