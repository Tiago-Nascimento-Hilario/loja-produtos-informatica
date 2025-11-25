package com.tiago.infoloja.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tiago.infoloja.R
import com.tiago.infoloja.lista.ProdutoItem
import com.tiago.infoloja.model.Produto


@Preview(showBackground = true)
@Composable
fun Home(){

    val listaDeProdutos : MutableList<Produto> = mutableListOf(

        Produto(
            nome = "SSD 1 TB Kingston NV2, M.2 2280 PCIe, NVMe, Leitura: 3500 Mb/s e Gravação: 2100 MB/s",
            imagem = R.drawable.img1,
            preco = "R$369,99"
        ),
        Produto(
            nome = "Cooler Fan Rise Mode, 120mm, Preto - RM-BK-01-FB",
            imagem = R.drawable.img2,
            preco= "R$6,99"
        ),
        Produto(
            nome = "Placa de Vídeo RTX 4060 Ventus 2x Black OC MSI NVIDIA GeForce, 8GB GDDR6, DLSS, Ray Tracing",
            imagem = R.drawable.img3,
            preco = "R$2100,99"
        ),
        Produto(
            nome = "Processador Intel Core i5-14400, 10-Core, 16-Threads, 3.5GHz (4.7GHz Turbo), Cache 20MB",
            imagem = R.drawable.img4,
            preco = "R$ 1457,00"
        ),
        Produto(
            nome = "Processador AMD Ryzen 5 5600G, 3.9GHZ, Cache 16MB, Hexa Core, 12 Threads, AM4",
            imagem = R.drawable.img5,
            preco = "R$ 953,82"
        ),
        Produto(
            nome = "Gabinete NZXT H5 Flow Compact, Mid Tower, ATX, Lateral e Frontal em Vidro Temperado",
            imagem = R.drawable.img6,
            preco= "R$ 549,99"
        )

    )
    val primeiraCor = Color.Blue
    val segundaCor = Color.Red
    Column(
        modifier = Modifier.fillMaxSize().background(
            brush = Brush.linearGradient(
                colors = listOf(primeiraCor, segundaCor)
            )
        ).padding(top = 10.dp)

    ) {
        LazyColumn( modifier = Modifier.padding(10.dp)) {
            itemsIndexed(listaDeProdutos){
                _,produto ->
                ProdutoItem(produto = produto)
            }
        }
    }
}