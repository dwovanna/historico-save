package com.example.saveeats.receitascomponent.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Dicas() {


    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.BottomEnd
    ) {
        Image(
            painter = painterResource(id = com.example.saveeats.R.drawable.legumes),
            contentDescription = "",
            contentScale = ContentScale.Crop
        )

        Row() {
            Icon(painter = painterResource(id = com.example.saveeats.R.drawable.seta), contentDescription = "",
            tint = Color.White)
            
        }


        Surface(
            modifier = Modifier
                .height(700.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "Qual a duração dos alimentos no congelador?",
                    fontSize = 22.sp,
                    color = Color(41, 95, 27),
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(22.dp))

                Card(
                    modifier = Modifier
                        .width(380.dp)
                        .height(1.5.dp),
                    backgroundColor = Color(200, 200, 200)
                ) {}

                Spacer(modifier = Modifier.height(22.dp))

                Text(
                    text = "A duração dos alimentos congelados varia de acordo com o tipo de alimento e as condições de armazenamento. " +
                            "A temperatura ideal para o congelamento é de -18°C.",
                    fontSize = 13.sp

                )

                Spacer(modifier = Modifier.height(22.dp))

                Image(
                    painter = painterResource(id = com.example.saveeats.R.drawable.dica),
                    contentDescription = "",
                    modifier = Modifier
                        .width(230.dp)
                        .clip(RoundedCornerShape(32.dp))
                )

                Spacer(modifier = Modifier.height(22.dp))

                Text(
                    text = "Aqui estão algumas informações úteis sobre a validade dos alimentos congelados:\n" +
                            "\n" +
                            "Carnes: Carne moída ou picada pode durar de 3 a 4 meses, enquanto carne em peça pode durar de 8 a 12 meses.\n" +
                            "\n" +
                            "Comida processada e pratos prontos: Podem durar de 3 a 4 meses.\n" +
                            "\n" +
                            "Frutas e vegetais: Podem durar de 8 a 12 meses. \n" +
                            "\n" +
                            "Frango ou peru: Pode durar até 12 meses. \n" +
                            "\n" +
                            "   Lembre-se de que, para manter a qualidade dos alimentos congelados, é importante armazená-los em recipientes " +
                            "herméticos e etiquetá-los com a data de congelamento. Além disso, é importante descongelar os alimentos na geladeira" +
                            " ou no microondas, nunca em temperatura ambiente, para evitar o crescimento de bactérias.",
                    fontSize = 13.sp
                )

            }


        }


    }

}


@Preview(showSystemUi = true)
@Composable
fun DicasPreview() {
    Dicas()
}