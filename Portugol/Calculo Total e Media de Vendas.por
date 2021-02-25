programa
{
	
	funcao inicio()
	{
		real jan, fev, mar, abr,  total, media
		cadeia vendedor

		escreva("Informe o nome do vendedor: ")
		leia(vendedor)

		escreva("Informe o valor das vendas de Janeiro: ")
		leia(jan)

		escreva("Informe o valor das vendas de Fevereiro: ")
		leia(fev)

		escreva("Informe o valor das vendas de Março: ")
		leia(mar)

		escreva("Informe o valor das vendas de Abril: ")
		leia(abr)

		total = jan+fev+mar+abr
		media = total/4

		escreva("O vendedor " + vendedor + " vendeu um total de R$ " + total + " nos primeiros quatro meses, com média mensal de R$ " + media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 596; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */