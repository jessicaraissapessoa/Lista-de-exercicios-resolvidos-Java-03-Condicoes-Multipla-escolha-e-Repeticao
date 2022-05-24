package listajava03_repeticao;

import java.util.Scanner;

public class listajava03_11 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 03 - Escolha, ternário, repetição
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa

Scanner teclado = new Scanner (System.in);

/*11. Imprimir os números 11, 21, 31,..., 101.*/

int numero = 11;

while (numero <= 101)
{
	System.out.println(numero);
	numero = numero + 10;
}

			
teclado.close();		
		
	}

}
