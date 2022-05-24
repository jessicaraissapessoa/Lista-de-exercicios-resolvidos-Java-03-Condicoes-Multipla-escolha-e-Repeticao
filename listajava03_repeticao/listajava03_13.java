package listajava03_repeticao;

import java.util.Scanner;

public class listajava03_13 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 03 - Escolha, ternário, repetição
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*13. Desenvolver um programa que efetue a soma de todos os números ímpares que são múltiplos de três
 * e que se encontram no conjunto dos números de 1 a 100.*/

	int soma = 0;
	
	for ( int numero = 1; numero <= 100; numero++)
	{
		
		if  (numero %2 != 0)
		{
			
			if (numero %3 == 0)
			{
				
				soma = soma + numero;
				
			}
			
		}
		
	}


System.out.println("A soma dos números ímpares e múltiplos de 3 de 1 a 100 é: " + soma);
			
teclado.close();		
		
	}

}
