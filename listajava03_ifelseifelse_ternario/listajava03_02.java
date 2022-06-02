package listajava03_ifelseifelse_ternario;

import java.util.Scanner;

public class listajava03_02 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 03 - Escolha, ternário, repetição
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*02. Faça um programa que peça um valor e mostre na tela se o valor é 'positivo' (<0) ou 'negativo' (<0). */

	System.out.println("Informe um número: ");
	int numero = teclado.nextInt();
	
	if (numero < 0) System.out.println(numero + " é um número negativo.");
	else if (numero > 0) System.out.println(numero + " é um número positivo.");
	else System.out.println(numero + " não é positivo nem negativo.");

			
teclado.close();		
		
	}

}
