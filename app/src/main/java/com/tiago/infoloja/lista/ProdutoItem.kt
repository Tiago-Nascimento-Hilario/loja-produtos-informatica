package com.tiago.infoloja.lista

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tiago.infoloja.model.Produto


@Composable
fun ProdutoItem( produto: Produto){
    val context = LocalContext.current
    Spacer(modifier = Modifier.padding(8.dp))
    Column(
        modifier = Modifier.fillMaxWidth().background(Color.White, shape = RoundedCornerShape(15.dp)).padding(10.dp)
    ) {
        Row( modifier = Modifier.fillMaxWidth().background(Color.White).padding(10.dp)) {
            Image(
                painter = painterResource(produto.imagem),
                contentDescription = null,
                modifier = Modifier.size(100.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = produto.nome,
                fontSize = 14.sp,
                modifier = Modifier.fillMaxWidth().padding(10.dp)
            )
        }
        Text(
            text = produto.preco,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Red,
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Á vista ou pix",
            fontSize = 14.sp,
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            textAlign = TextAlign.Center
        )
        OutlinedButton(
            onClick = { Toast.makeText(context, produto.nome, Toast.LENGTH_SHORT).show() },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = "Comprar",
                fontSize = 16.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
    }


}