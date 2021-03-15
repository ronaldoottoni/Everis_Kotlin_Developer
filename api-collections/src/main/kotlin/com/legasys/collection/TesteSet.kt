package com.legasys.collection

fun main() {
    val joao  = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    //setOf gera tipo um conjunto de dados
    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    //Assim como na matemática, é possivel unir conjuntos,
    println("*-------UNION-------*")
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    //Retirar um conjunto de uma UNIÃO de vários conjuntos conjuntos
    println("*-------SUBTRACT-------*")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    //Retorna o que tem de COMUM nos dois conjuntos
    println("*-------INTERSECT-------*")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}