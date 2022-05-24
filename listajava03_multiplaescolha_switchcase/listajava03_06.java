package listajava03_multiplaescolha_switchcase;

import java.util.Scanner;

public class listajava03_06 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 03 - Escolha, ternário, repetição
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*06. Implemente um programa que informe se uma letra que foi informada é uma vogal. */

	System.out.println("Informe uma letra: ");
	String letra = teclado.next();
	
	
	switch (letra.toLowerCase())
	{
	case "a": System.out.println(letra + " é uma vogal.");
	break;
	case "e": System.out.println(letra + " é uma vogal.");
	break;
	case "i": System.out.println(letra + " é uma vogal.");
	break;
	case "o": System.out.println(letra + " é uma vogal.");
	break;
	case "u": System.out.println(letra + " é uma vogal.");
	break;
	default: System.out.println(letra + " não é uma vogal.");
	}

			
teclado.close();		
		
	}

}
