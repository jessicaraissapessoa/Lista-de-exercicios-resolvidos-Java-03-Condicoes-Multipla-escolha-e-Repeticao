package listajava03_ifelseifelse_ternario;

import java.util.Scanner;

public class listajava03_01 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 03 - Escolha, ternário, repetição
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*01. Escreva um programa que leia um número e informe 'par' ou 'ímpar'. */

	System.out.println("Informe um número: ");
	int numero = teclado.nextInt();
	
	
//forma 1:
	
	if (numero %2 == 0) System.out.println("Par.");
	else System.out.println("Ímpar.");

	
//forma 2:
	
	String resultado = (numero %2 == 0) ? ("Par.")
			: ("Ímpar.");
	System.out.println(resultado);
	
			
teclado.close();		
		
	}

}
