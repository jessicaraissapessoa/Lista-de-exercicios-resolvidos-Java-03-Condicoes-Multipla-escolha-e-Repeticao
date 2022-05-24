package listajava03_multiplaescolha_switchcase;

import java.util.Scanner;

public class listajava03_08 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 03 - Escolha, ternário, repetição
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*08. Implemente um programa que realize uma das quatro operações (+), (-), (*) ou (/) entre duas variáveis
 * a partir da escolha do usuário.*/

	System.out.println("Digite '+', '-', '*' ou '/' para escolher qual operação matemática deseja realizar: \n");
	System.out.println("+ - Adição");
	System.out.println("- - Subtração");
	System.out.println("* - Multiplicação");
	System.out.println("/ - Divisão \n");
	
	String operacao = teclado.next();
	
	System.out.println("Escolha o primeiro número da operação: ");
	double num1 = teclado.nextDouble();
	System.out.println("Escolha o segundo número da operação: ");
	double num2 = teclado.nextDouble();
		

	switch (operacao)
	{
	case "+": 
		{
			double adicao = num1 + num2;
			
			System.out.println(num1 + " + " + num2 + " = " + adicao);
		}
	break;
	
	case "-": 
		{
			double subtração = num1 - num2;
			
			System.out.println(num1 + " - " + num2 + " = " + subtração);
		}
	break;
	
	case "*": 
		{
			double multiplicacao = num1 * num2;
			
			System.out.println(num1 + " * " + num2 + " = " + multiplicacao);
		}
	break;
	
	case "/": 
		{
			double divisao = num1 / num2;
			
			System.out.println(num1 + " / " + num2 + " = " + divisao);
		}
	break;
	
	default: System.out.println("Opção inválida");
	}

			
teclado.close();		
		
	}

}
