package listajava03_repeticao;

import java.util.Scanner;

public class listajava03_14 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 03 - Escolha, ternário, repetição
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*14. Escreva um programa que gere os números de 1000 a 1999, designando se são ou não divisíveis por 11
 * e se o módulo (resto) da divisão por 11 é ou não 5.
 * A saída do programa deve seguir o seguinte exemplo:
 * Ex:
 * 1000 não é divisível por 11 e o módulo da divisão não é 5.
 * 1001 é divisível por 11 e o módulo da divisão não é 5.
 * 1017 não é divisível por 11 e o módulo da divisão é 5.*/

	
	for ( int numero = 1000; numero <= 1999; numero++)
	{
		
		if (numero %11 == 0) System.out.println(numero + " é divisível por 11 e o módulo da divisão não é 5.");
		else if (numero %11 == 5) System.out.println(numero + " não é divisível por 11 e o módulo da divisão é 5.");
		else System.out.println(numero + " não é divisível por 11 e o módulo da divisão não é 5.");
			
	}

		
teclado.close();		
		
	}

}
