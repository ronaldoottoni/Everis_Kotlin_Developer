//Algoritimo com finalidade de mostrar a tabuada de um numero qualquer que o usuário informar

programa
{
	
	funcao inicio()
	{
		inteiro tabuada, contador, limite, resultado
		contador = 0
		limite = 10

		//Solicita ao usuário o número da tabuda que ele deseja que seja mostrada
		escreva("De qual número você quer a tabuada?"+"\n")
		leia(tabuada)

		//Loop para calculo e demonstração dos resultados
		faca{
			resultado = tabuada * contador
			escreva(tabuada + " X "+ contador + " = " + resultado + "\n")
			contador ++ 
		}enquanto(contador<=limite)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 365; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */