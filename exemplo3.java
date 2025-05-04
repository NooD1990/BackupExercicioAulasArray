/*
Crie uma matriz 2x2 com valores fixos no código.
Some todos os valores da matriz.
Mostre o total somado no final.
*/

import java.util.Scanner;

public class exemplo3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int [] [] A = {
				{9 , 8},
				{7, 6}
		};
		int [] [] B = {
				{5, 4},
				{3, 2}
		};
		int [] [] C = new int [2] [2];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		System.out.println("Resultado da soma dasmatrizes A + B");
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(C[i][j] + "\t");
			}
			System.out.println(); //lembrar desde println para fazer a formatação da matriz certo
		}
		scanner.close();
	}
}
