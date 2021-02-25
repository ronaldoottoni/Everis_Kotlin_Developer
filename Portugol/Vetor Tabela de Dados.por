programa
{
	
	funcao inicio()
	{
		cadeia nome[]={"Andre", "Thiago","Bruno","Carlos","Cassio"}
		real altura[]={1.71, 1.78, 1.75, 1.87, 1.71}

		//Criando o cabeçalho da tabela que será exibida
		escreva("-------------------------------\n")
		escreva("|             TABELA          |\n")
		escreva("-------------------------------\n")
		escreva("|Nome" + "\t\t" + "|"+ "\t"+ "Altura" +"|\n")
		escreva("-------------------------------\n")

		//Percorrer o vetor e imprimir os dados
		para (inteiro posic = 0; posic < 5; posic ++){
			escreva("|" + nome[posic] + "\t\t" +"|" + "\t" + altura[posic] + "  |\n")
		}
		escreva("-------------------------------\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 607; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */