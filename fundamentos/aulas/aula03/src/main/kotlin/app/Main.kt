package app

import vitrine.Produto

fun main () {

    val cadProdutoVitrine = Produto(
        codigo = 1, 
        descriçao = "Monitor", 
        preço = 850.0
    )
    val cadProdutoCarrinho = carrinho.Produto (
        id = 1, 
        valor = 850.0, 
        qtd = 5
    )

    println("Produto da vitrine: $cadProdutoVitrine")
    println("Produto do carrinho: $cadProdutoCarrinho")
}