programa
{
	
	funcao inicio()
	{
		cadeia catalog[][]={{"João  ","São Paulo     ","(11) 9999-5241"}, {"Maria ","Ribeirão Preto","(16) 9999-8596"}, {"Ana   ","Manaus        ","(92) 9999-8574"}}
		inteiro count = 0

		escreva("----------------------------------------"+"\n")
		escreva("|Nome  |Cidade        |Contato         |"+"\n")
		escreva("----------------------------------------"+"\n")
		faca{
			escreva("|" + catalog[count][0] + "|" + catalog[count][1] + "|" + catalog[count][2] +"  |"+ "\n")
			count++
		}enquanto(count<=2)
		escreva("----------------------------------------"+"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 603; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */