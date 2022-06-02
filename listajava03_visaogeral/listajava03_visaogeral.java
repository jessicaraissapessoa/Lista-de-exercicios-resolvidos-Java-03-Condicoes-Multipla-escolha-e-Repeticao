package listajava03_visaogeral;

import java.text.DecimalFormat;
import java.util.Scanner;

public class listajava03_visaogeral {

	public static void main(String[] args) {
	
//Lista de Exercícios de Java 03 - Escolha, ternário, repetição
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
				
Scanner teclado = new Scanner (System.in);
/*


//if/else if/else; Ternário 
 

	/*01. Escreva um programa que leia um número e informe 'par' ou 'ímpar'.

	System.out.println("Informe um número: ");
	int numero = teclado.nextInt();
	
	
	//forma 1:
	
	if (numero %2 == 0) System.out.println("Par.");
	else System.out.println("Ímpar.");

	
	//forma 2:
	
	String resultado = (numero %2 == 0) ? ("Par.")
			: ("Ímpar.");
	System.out.println(resultado);
		
		
		
		
	/*02. Faça um programa que peça um valor e mostre na tela se o valor é 'positivo' (<0) ou 'negativo' (<0).

	System.out.println("Informe um número: ");
	int numero = teclado.nextInt();
	
	if (numero < 0) System.out.println(numero + " é um número negativo.");
	else if (numero > 0) System.out.println(numero + " é um número positivo.");
	else System.out.println(numero + " não é positivo nem negativo.");
		
		
		
		
	/*03. Leia dois números e efetue a adição. Caso o valor resultante da adição seja maior que 20, esse deverá ser apresentado somando a ele 8.
	Caso o valor resultante da adição seja menor ou igual a 20, esse deverá ser apresentado subtraindo dele 5.

	System.out.println("Informe o primeiro número: ");
	int num1 = teclado.nextInt();
	
	System.out.println("Informe o segundo número: ");
	int num2 = teclado.nextInt();
	
	int soma = num1 + num2;
	
	int maiorque20 = soma + 8;
	int menorigual20 = soma - 5;

	
	//forma 1:
	
	if (soma > 20)
	{
		System.out.println(num1 + " + " + num2 + " = " + soma);
		System.out.println(soma + " + 8 = " + maiorque20);
	}
	else
	{
		System.out.println(num1 + " + " + num2 + " = " + soma);
		System.out.println(soma + " - 5 = " + menorigual20);
	}

	
	//forma 2:
	
	String resultado = (soma > 20) ? (soma + " + 8 = " + maiorque20) : (soma + " - 5 = " + menorigual20);
	System.out.println(resultado);
		
		
		
		
	/*04. Escreva um algoritmo que receba um número e imprima uma das mensagens: "É múltiplo de 3" ou "Não é múltiplo de 3". 

	System.out.println("Informe um número: ");
	int numero = teclado.nextInt();
	
	//forma 1:
	
	if (numero %3 == 0) System.out.println(numero + " é múltiplo de 3.");
	else System.out.println(numero + " não é múltiplo de 3.");


	//forma 2:
	
	String resultado = (numero %3 == 0) ? (numero + " não é múltiplo de 3.") : (numero + " não é múltiplo de 3.");
	System.out.println(resultado);

		
		
		
//Múltipla escolha: switch-case
 

	/*05. Faça um programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra, imprimir: "F - Feminino", "M - Masculino", "Sexo Inválido".

	System.out.println("Informe 'F' para feminino ou 'M' para masculino: ");
	String foum = teclado.next();
	
	
	switch (foum.toUpperCase())
	{
	case "F": System.out.println("Feminino.");
	break;
	case "M": System.out.println("Masculino.");
	break;
	default: System.out.println("Sexo inválido.");
	}
		
		
		
		
	/*06. Implemente um programa que informe se uma letra que foi informada é uma vogal.

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
		
		
		
		
	/*07. Escreva um programa para imprimir o menu abaixo:
	1 - Solteiro(a)
	2 - Desquitado(a)
	3 - Casado(a)
	4 - Divorciado(a)
	5 - Viúvo(a)
	O usuário deverá selecionar uma das opções do menu. O programa deverá imprimir o estado civil de acordo com a opção selecionada pelo usuário.
	Uma mensagem de erro deverá ser emitida caso seja selecionada uma opção inexistente.

	System.out.println("Informe o número para escolher uma das opções de estado civil: \n");
	System.out.println("1 - Solteiro(a)");
	System.out.println("2 - Desquitado(a)");
	System.out.println("3 - Casado(a)");
	System.out.println("4 - Divorciado(a)");
	System.out.println("5 - Viúvo(a)");
	
	
	int estadocivil = teclado.nextInt();
	
	
	switch (estadocivil)
	{
	case 1: System.out.println("Você é solteiro(a).");
	break;
	case 2: System.out.println("Você é desquitado(a)");
	break;
	case 3: System.out.println("Você é casado(a)");
	break;
	case 4: System.out.println("Você é Divorciado(a)");
	break;
	case 5: System.out.println("Você é viúvo(a)");
	break;
	default: System.out.println("Opção inválida");
	}
		
		
		
		
	/*08. Implemente um programa que realize uma das quatro operações (+), (-), (*) ou (/) entre duas variáveis
	a partir da escolha do usuário.

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
	
		
		
		
//Repetição
 

	/*09. Escrever seu nome na tela 10 vezes. Um nome por linha.

	int contagem = 1;
	
	while (contagem <=10)
	{
		System.out.println("Jéssica Raissa Pessoa");
		contagem++;
	}
		
		
		
		
	/*10. Imprimir os números pares de 2 a 50.

	for (int numero = 2; numero <= 50; numero++)
	{
		if (numero %2 == 0) System.out.println(numero);
	}
		
		
		
		
	/*11. Imprimir os números 11, 21, 31,..., 101.

	int numero = 11;

	while (numero <= 101)
	{
	System.out.println(numero);
	numero = numero + 10;
	}
		
		
		
		
	/*12. Exibir a soma dos números compreendidos de 1 a 5.

	int soma = 0;
	int numero = 1;

	while (numero <= 5)
	{
	soma = soma + numero;
	numero++;
	}

	System.out.println(soma);
			
	teclado.close();
		
		
		
		
	*13. Desenvolver um programa que efetue a soma de todos os números ímpares que são múltiplos de três
	e que se encontram no conjunto dos números de 1 a 100.

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
		
		
		
		
	/*14. Escreva um programa que gere os números de 1000 a 1999, designando se são ou não divisíveis por 11
	e se o módulo (resto) da divisão por 11 é ou não 5.
	A saída do programa deve seguir o seguinte exemplo:
	Ex:
	1000 não é divisível por 11 e o módulo da divisão não é 5.
	1001 é divisível por 11 e o módulo da divisão não é 5.
	1017 não é divisível por 11 e o módulo da divisão é 5.*/

	
	for ( int numero = 1000; numero <= 1999; numero++)
	{
		
		if (numero %11 == 0) System.out.println(numero + " é divisível por 11 e o módulo da divisão não é 5.");
		else if (numero %11 == 5) System.out.println(numero + " não é divisível por 11 e o módulo da divisão é 5.");
		else System.out.println(numero + " não é divisível por 11 e o módulo da divisão não é 5.");
			
	}
			
	
	
	
	//Desafio
	 

	/*DESAFIO
	 * Escreva um programa que leia os números de 1999 para 100 e:
	 * a) Mostre quais são divisíveis por 11: 
	 *    quantos são, qual o resultado da soma entre esses números, quantos são pares e quantos são ímpares;
	 * b) Mostre quais não são divisíveis por 11 cujo módulo da divisão por 11 seja 5: 
	 *    quantos são, qual o resultado da soma entre esses números, quantos são pares e quantos são ímpares;
	 * c) Informe a quantidade de números de 1999 a 100;
	 * d) Informe a soma dos números de 1999 a 100.


	/*a) Mostre quais são divisíveis por 11: 
	quantos são, qual o resultado da soma entre esses números, quantos são pares e quantos são ímpares;

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
	quantos são, qual o resultado da soma entre esses números, quantos são pares e quantos são ímpares;
		
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
		
		
	/*c) Informe a quantidade de números de 1999 a 100;
		
	int contadorgeralC = 0;

		for (int numeroC = 1999; numeroC >= 100; numeroC--)
		{
			
			contadorgeralC++;
			
		}
		
		System.out.println("Quantidade de números de 1999 a 100: " + contadorgeralC);
		
		
	/*d) d) Informe a soma dos números de 1999 a 100.
		
	int somaD = 0;

		for (int numeroD = 1999; numeroD >= 100; numeroD--)
		{
			somaD = somaD + numeroD;
		}
		
		System.out.println("Soma dos números de 1999 a 100: " + somaD);
				
		
				
		
*/		
teclado.close();		

	}

}
