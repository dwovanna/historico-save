package com.example.saveeats.historicocomponent.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Description() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {

        Row() {
            Icon(
                painter = painterResource(id = com.example.saveeats.R.drawable.baseline_west_24),
                contentDescription = "",
                modifier = Modifier.size(40.dp)
            )

            Spacer(modifier = Modifier.width(50.dp))

            Text(text = "Detalhes do Pedido",
                fontSize = 25.sp
            )
        }

        Spacer(modifier = Modifier.height(30.dp))
        Row() {

            Image(painter = painterResource(id =com.example.saveeats.R.drawable.paooo),
                contentDescription = "",
                modifier = Modifier
                    .size(80.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Column(

            ) {
                Text(text = "Padaria Dois Irmãos",
                    fontSize = 20.sp
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Pedido Nº1234 ",
                    color = Color(104, 104, 104),
                    fontSize = 12.sp
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Ver Cardápio",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(41, 95, 27)

                )
            }

        }

        Spacer(modifier = Modifier.height(20.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Row(

            ) {
                Card(
                    modifier = Modifier
                        .width(330.dp)
                        .height(42.dp),
                    backgroundColor = Color(239, 239, 239),
                    shape = RoundedCornerShape(12.dp)
                ) {

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Row(

                        ) {

                            Icon(
                                painter = painterResource(id = com.example.saveeats.R.drawable.baseline_verified_24),
                                contentDescription = "",
                                tint = Color(72, 138, 39),
                                modifier = Modifier.size(22.dp)
                            )

                            Spacer(modifier = Modifier.width(6.dp))

                            Text(text = "Pedido concluído ás 03:20",
                                fontSize = 17.sp
                            )

                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(18.dp))

            Card(
                modifier = Modifier
                    .width(380.dp)
                    .height(1.5.dp),
                backgroundColor = Color(255, 141, 6)
            ) {}

            Spacer(modifier = Modifier.height(25.dp))

        }
        Row {
            Image(painter = painterResource(id = com.example.saveeats.R.drawable.paess),
                contentDescription = "",
                modifier = Modifier
                    .size(55.dp)
            )

            Spacer(modifier = Modifier.width(6.dp))

            Column() {

                Text(text = "10 Pães",
                    fontSize = 18.sp
                )

                Row {

                    Text(text = "Não possui observacões",
                        color = Color(104, 104, 104),
                        fontSize = 12.sp
                    )

                    Spacer(modifier = Modifier.width(105.dp))

                    Text(text = "R$ 5,00",)
                }


            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        Column(

        ) {

            Text(text = "Resumo de valores",
                fontSize = 20.sp,
                color = Color(41, 95, 27)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row() {

                Text(text = "SubTotal",
                    color = Color(104, 104, 104),
                    fontSize = 12.sp
                )

                Spacer(modifier = Modifier.width(248.dp))

                Text(text = "R$ 5,00",)
                
            }

            Spacer(modifier = Modifier.height(5.dp))

            Row() {

                Text(text = "Taxa de entrega",
                    color = Color(104, 104, 104),
                    fontSize = 12.sp
                )

                Spacer(modifier = Modifier.width(220.dp))

                Text(text = "Grátis",
                    color = Color(41, 95, 27)
                )
                
            }



            Spacer(modifier = Modifier.height(5.dp))

            Row() {

                Text(text = "Total",
                    color = Color(104, 104, 104),
                    fontSize = 12.sp
                )

                Spacer(modifier = Modifier.width(270.dp))

                Text(text = "R$ 5,00",)

            }

            Spacer(modifier = Modifier.height(15.dp))

            Text(text = "Pagamento",
                fontSize = 20.sp,
                color = Color(41, 95, 27)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row {

                Text(text = "Pago pelo app",
                    color = Color(104, 104, 104),
                    fontSize = 12.sp
                )

                Spacer(modifier = Modifier.width(135.dp))

                Icon(
                    painter = painterResource(id = com.example.saveeats.R.drawable.pagamento),
                    contentDescription = "",
                    tint = Color(206, 159, 104),
                    modifier = Modifier.size(20.dp)
                )

                Spacer(modifier = Modifier.width(5.dp))

                Text(text = "Mastercard 1864",
                )
                
            }


            Spacer(modifier = Modifier.height(15.dp))

            Text(text = "Endereço de entrega",
                fontSize = 20.sp,
                color = Color(41, 95, 27)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "Rua Elton Silva 45",
                color = Color(104, 104, 104),
                fontSize = 12.sp
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(text = "Jandira, São Paulo",
                color = Color(104, 104, 104),
                fontSize = 12.sp
            )

           Spacer(modifier = Modifier.height(15.dp))

            Text(text = "Avaliações",
                fontSize = 20.sp,
                color = Color(41, 95, 27)
            )

            Spacer(modifier = Modifier.height(15.dp))
            
            Row {

                Icon(painter = painterResource(id = com.example.saveeats.R.drawable.avaliacao),
                    contentDescription = "" )

                Spacer(modifier = Modifier.width(3.dp))

                Icon(painter = painterResource(id = com.example.saveeats.R.drawable.avaliacao),
                    contentDescription = "" )

                Spacer(modifier = Modifier.width(3.dp))

                Icon(painter = painterResource(id = com.example.saveeats.R.drawable.avaliacao),
                    contentDescription = "" )

                Spacer(modifier = Modifier.width(3.dp))

                Icon(painter = painterResource(id = com.example.saveeats.R.drawable.avaliacao),
                    contentDescription = "" )

                Spacer(modifier = Modifier.width(200.dp))

                Text(text = "Enviar",
                    fontSize = 15.sp,
                    color = Color(41, 95, 27)
                )
            }




        }





        

    }
    
}





@Preview(showSystemUi = true)
@Composable
fun DescriptionPreview() {
    Description()
}