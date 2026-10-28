package aula05

fun main (){
    val idade = 17
    val contaAtiva = true


    if (idade >= 18 && contaAtiva == true) {
        println("Pode entrar")
    } else {
        println("Não pode entrar")
    }

    Operador()
}

fun Operador() {
    val idade = 25
    val estudante = true

    if (idade >= 60 || estudante == true) {
        println("Desconto Concedido")
    } else {
        println("Sem desconto")
    }
}

