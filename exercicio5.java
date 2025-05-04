/*
Crie uma matriz 2x3 com valores fixos.
Crie uma nova matriz 3x2 (transposta).
Copie os valores de forma que:
transposta[j][i] = original[i][j]
Mostre a matriz original e a transposta.
*/

public class exercicio5 {
	public static void main(String[] args) {
		
		// Matriz 2x3: 2 linhas, 3 colunas
		int[][] original = {
				{1, 2, 3},
				{4, 5, 6}
		};
		 // Transposta: 3x2 (3 linhas, 2 colunas)
		int[][] transposta = new int [3] [2];
		
		// Transposição: troca linha por coluna
		for(int i = 0; i < 2; i++) { //linhas original
			for(int j = 0; j < 3; j++) { //colunas original
				transposta[j][i] = original[i][j];
			}
		}
		
		//exibir a matriz original
		System.out.println("Matriz original: ");
		for(int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(original[i][j] + "\t");
			}
			System.out.println();//lembrar desde println para fazer a formatação da matriz certo
		}
		
		//Exibir a matris transposta
		System.out.println("Matriz transposta: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(transposta[i][j] + "\t");
			}
			System.out.println(); //lembrar desde println para fazer a formatação da matriz certo
		}
	}
}
