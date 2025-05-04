//Escreva um programa JAVA para ler os elementos de uma array(10) e após, organizar e mostrar os valores lidos em ordem crescente.
import java.util.Arrays;
import java.util.Scanner;

public class exemploProva {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[10];
		
		//Entrada de 10 valores
		System.out.println("Digite 10 números: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Número "+ (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
		}
		
		//Ordenando os valores em ordem crescente
		Arrays.sort(numeros);
		
		//Ordenando os valores em ordem decrescente
		/*-----------------------------------------------
		// Inverte o array para ficar em ordem decrescente
		for (int i = 0; i < numeros.length / 2; i++) {
    		int temp = numeros[i];
    		numeros[i] = numeros[numeros.length - 1 - i];
    		numeros[numeros.length - 1 - i] = temp;
		}
		
		---------------------------------------------------*/
		//Exibindo os valores ordenados
		System.out.println("\nNúmeros em ordem crescente: ");
		for (int num : numeros) {
			System.out.print(num + " ");
		}
		scanner.close();
	}

}
