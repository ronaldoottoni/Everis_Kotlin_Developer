package com.legasys.collection

fun main() {
    val joao  = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    //Este tipo de lista não é mutável em tempo de execução
    val funcionarios = listOf(joao, pedro, maria)

    //Função padrãoo para impressão do conteúdo da lista
    funcionarios.forEach { println(it) }

    //Função para encontrar determinado valor dentro da coleção
    println("*------FIND--------*")
    println(funcionarios.find { it.nome == "Maria" })

    //Função para organizar o conteúdo da coleção por um determinado atributo
    println("*------SORTED BY--------*")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    //Função para agrupar o conteúdo da coleçao por um determinado atributo
    println("*---GROUP BY--------*")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
    )
{
    override fun toString(): String =
        """
            Nome...: $nome
            Salario: $salario
        """.trimIndent()
}