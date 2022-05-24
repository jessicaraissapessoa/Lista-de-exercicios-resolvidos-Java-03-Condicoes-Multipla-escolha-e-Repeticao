package listajava03_desafio;

import java.util.Scanner;

public class listajava03_desafio {

	public static void main(String[] args) {

//Lista de Exercícios de Java 03 - Escolha, ternário, repetição
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*DESAFIO
 * Escreva um programa que leia os números de 1999 para 100 e:
 * a) Mostre quais são divisíveis por 11: 
 *    quantos são, qual o resultado da soma entre esses números, quantos são pares e quantos são ímpares;
 * b) Mostre quais não são divisíveis por 11 cujo módulo da divisão por 11 seja 5: 
 *    quantos são, qual o resultado da soma entre esses números, quantos são pares e quantos são ímpares;
 * c) Informe a quantidade de números de 1999 a 100;
 * d) Informe a soma dos números de 1999 a 100.*/


/*a) Mostre quais são divisíveis por 11: 
quantos são, qual o resultado da soma entre esses números, quantos são pares e quantos são ímpares; */

int contadorgeralA = 0;
int contadorparesA = 0;
int contadorimparesA = 0;

int somaA = 0;

	for (int numeroA = 1999; numeroA >= 100; numeroA--)
	{
		
		if (numeroA %11 == 0)
		{
			contadorgeralA++;
			
			System.out.println(numeroA);
			
			somaA = somaA + numeroA;
			
			if (numeroA %2 == 0) contadorparesA++;
			else contadorimparesA++;
			
		}
				
	}
	
	System.out.println("Quantos números divisíveis por 11 de 1999 a 100: " + contadorgeralA);
	System.out.println("A soma dos números divisíveis por 11 de 1999 a 100: " + somaA);
	System.out.println("Quantos números pares divisíveis por 11 de 1999 a 100: " + contadorparesA);
	System.out.println("Quantos números ímpares divisíveis por 11 de 1999 a 100: " + contadorimparesA);


/*b) Mostre quais não são divisíveis por 11 cujo módulo da divisão por 11 seja 5: 
quantos são, qual o resultado da soma entre esses números, quantos são pares e quantos são ímpares; */
	
int contadorgeralB = 0;
int contadorparesB = 0;
int contadorimparesB = 0;

int somaB = 0;

	for (int numeroB = 1999; numeroB >= 100; numeroB--)
	{
		
		if (numeroB %11 == 5)
		{
			
			contadorgeralB++;
			
			System.out.println(numeroB);
			
			somaB = somaB + numeroB;
			
			if (numeroB %2 == 0) contadorparesB++;
			else contadorimparesB++;
				
		}
		
	}
	
	System.out.println("Quantos números não divisíveis por 11 com módulo 5 de 1999 a 100: " + contadorgeralB);
	System.out.println("A soma dos números não divisíveis por 11 com módulos 5 de 1999 a 100: " + somaB);
	System.out.println("Quantos números pares não divisíveis por 11 com módulo 5 de 1999 a 100: " + contadorparesB);
	System.out.println("Quantos números ímpares divisíveis por 11 com módulo 5 de 1999 a 100: " + contadorimparesB);
	
	
/*c) Informe a quantidade de números de 1999 a 100; */
	
int contadorgeralC = 0;

	for (int numeroC = 1999; numeroC >= 100; numeroC--)
	{
		
		contadorgeralC++;
		
	}
	
	System.out.println("Quantidade de números de 1999 a 100: " + contadorgeralC);
	
	
/*d) d) Informe a soma dos números de 1999 a 100.*/
	
int somaD = 0;

	for (int numeroD = 1999; numeroD >= 100; numeroD--)
	{
		somaD = somaD + numeroD;
	}
	
	System.out.println("Soma dos números de 1999 a 100: " + somaD);
	
teclado.close();		
		
	}

}
