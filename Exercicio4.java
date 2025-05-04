/*Considere o problema de registrar 10 valores inteiros. Cada valor é armazenado em uma variável interna a uma
 estrutura array chamada valores. Após cadastro, verificar e mostrar a quantidade de números pares e ímpares digitados.*/

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		int impares = 0, pares = 0;
	int[] numeros = new int[10];
		Scanner dados = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite numeros: ");
			numeros[i] = dados.nextInt();
			if (numeros[i]%2==0){
				pares++;
			}else {
				impares++;
			}
		}
		System.out.print("Numero digitados: ");
		for (int i = 0; i < 5; i++) {
			System.out.print("\n"+numeros[i]);
		}
        System.out.println("\nQtde numeros impares: " + impares);        
        System.out.println("Qtde numeros pares: " + pares); 
        dados.close();
	}
}
