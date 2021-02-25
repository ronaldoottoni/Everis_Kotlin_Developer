programa
{
	
	funcao inicio()
	{
		escreva("1 - Abrir Netflix" + "\n" + "2 - Abrir Amazon Prime" + "\n" + "3 - Abrir HBO GO" + "\n" + "4 - Abrir Disney Channel" + "\n" + "5 - Sair")
		inteiro menu = 0
		escreva("\n"+"Sua opção: ")
		leia(menu)
		escolha(menu)
		{
			caso 1:
				escreva("OK! Abrir Netflix!")
				pare
			caso 2:
				escreva("OK! Abrir Amazon Prime!")
				pare
			caso 3:
				escreva("OK! Abrir HBO GO!")
				pare
			caso 4:
				escreva("OK! Abrir Disney Ch!")
				pare
			caso 5:
				escreva("OK! Saindo do menu...")
				pare
			caso contrario:
				escreva("Você deve escolhe as opções 1, 2, 3, 4 ou 5")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 520; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */