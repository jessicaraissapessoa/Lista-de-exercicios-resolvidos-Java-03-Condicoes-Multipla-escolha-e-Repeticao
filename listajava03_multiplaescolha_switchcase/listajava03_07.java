package listajava03_multiplaescolha_switchcase;

import java.util.Scanner;

public class listajava03_07 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 03 - Escolha, ternário, repetição
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*07. Escreva um programa para imprimir o menu abaixo:
 * 1 - Solteiro(a)
 * 2 - Desquitado(a)
 * 3 - Casado(a)
 * 4 - Divorciado(a)
 * 5 - Viúvo(a)
 * O usuário deverá selecionar uma das opções do menu. O programa deverá imprimir o estado civil de acordo com a opção selecionada pelo usuário.
 * Uma mensagem de erro deverá ser emitida caso seja selecionada uma opção inexistente. */

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

			
teclado.close();		
		
	}

}
