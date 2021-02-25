programa
{
	
	funcao inicio()
	{
		inteiro vetor[]={1,3,5,7,9} // Declara o vetor com 5 posições, lembrando que o índice inicia em 0
		inteiro numero  //Armazenar o número que o usuário está procurando
		logico achou = falso // Variavel para armazenar o resultado da pesquisa Falso ou Verdadeiro

		escreva("Qual número deseja procurar? "+"\n")
		leia(numero)

		para(inteiro posic = 0; posic < 5; posic ++)
		{
			se (vetor[posic] == numero){
				escreva("Encontrando na posição: " + posic + "\n")
				achou = verdadeiro
			}
		}

		se (nao achou)
		{
			escreva("O número não está no vetor\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 206; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */