package listajava03_repeticao;

import java.util.Scanner;

public class listajava03_10 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 03 - Escolha, ternário, repetição
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*10. Imprimir os números pares de 2 a 50.*/

	for (int numero = 2; numero <= 50; numero++)
	{
		if (numero %2 == 0) System.out.println(numero);
	}

			
teclado.close();		
		
	}

}
