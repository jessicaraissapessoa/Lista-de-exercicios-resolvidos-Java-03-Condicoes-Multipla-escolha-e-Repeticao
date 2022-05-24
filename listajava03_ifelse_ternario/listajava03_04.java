package listajava03_ifelse_ternario;

import java.util.Scanner;

public class listajava03_04 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 03 - Escolha, ternário, repetição
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*04. Escreva um algoritmo que receba um número e imprima uma das mensagens: "É múltiplo de 3" ou "Não é múltiplo de 3". */

	System.out.println("Informe um número: ");
	int numero = teclado.nextInt();
	
//forma 1:
	
	if (numero %3 == 0) System.out.println(numero + " é múltiplo de 3.");
	else System.out.println(numero + " não é múltiplo de 3.");


//forma 2:
	
	String resultado = (numero %3 == 0) ? (numero + " não é múltiplo de 3.") : (numero + " não é múltiplo de 3.");
	System.out.println(resultado);
	
	
teclado.close();		
		
	}

}
