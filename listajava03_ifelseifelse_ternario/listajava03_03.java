package listajava03_ifelseifelse_ternario;

import java.util.Scanner;

public class listajava03_03 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 03 - Escolha, ternário, repetição
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*03. Leia dois números e efetue a adição. Caso o valor resultante da adição seja maior que 20, esse deverá ser apresentado somando a ele 8.
 * Caso o valor resultante da adição seja menor ou igual a 20, esse deverá ser apresentado subtraindo dele 5. */

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
	
			
teclado.close();		
		
	}

}
