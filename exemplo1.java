public class exemplo1 {
	public static void main(String[] args) {
		//Passo 1: Criar as matrizes A e B já com os valores
		int[] [] A = {
				{1, 2},
				{3, 4}
		};
		
		int[] [] B = {
				{4, 5},
				{6, 7}
		};
		
		//Passo 2: Criar a matriz C para armazenar o resultado
		int[][] C = new int[2][2];
		
		//Passo 3: Somar A + B e armazenar em C
		for (int i = 0; i < 2; i++) { //linhas
			for (int j = 0; j < 2; j++) { //colunas
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		
		//Passo 4: Exibir a matriz C
		System.out.println("Resultado da soma das matrizes A + B:");
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(C[i][j] + "\t");
			}
			System.out.println();
		}
	}
}