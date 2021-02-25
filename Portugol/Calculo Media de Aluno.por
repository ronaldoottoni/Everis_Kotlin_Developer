//Função do algoritimo: Calcular a média aritimética e apresentar uma mensagem
//Autor: Ronaldo Ottoni
//Data: 23/02/2021

programa
{
	
	funcao inicio()
	{
		real nota1, nota2, nota3, nota4, media
		cadeia aluno

		escreva("Digite o nome do aluno:")
		leia(aluno)

		escreva("Digite a nota 1:")
		leia(nota1)
	
		escreva("Digite a nota 2:")
		leia(nota2)

		escreva("Digite a nota 3:")
		leia(nota3)

		escreva("Digite a nota 4:")
		leia(nota4)

		media = (nota1 + nota2 + nota3 + nota4)/4

		escreva("Sua média é: " + media)

		//Verifica se a média é igual ou maior do que 7, caso seja, apresentar mensagem APROVADO
		se(media >= 7){
			escreva("\n" + "PARABÉNS! você foi >>>> APROVADO! <<<<")
		}

		//Caso média seja menor do que 7, apresentar a mensagem REPROVADO
		senao{
			escreva("\n" + "QUE TRISTE :(  << Você não foi aprovado! >>")
		}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 823; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */