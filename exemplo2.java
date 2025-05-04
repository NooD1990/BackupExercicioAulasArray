/*
Crie uma matriz 3x3 de inteiros.
Peça para o usuário digitar os valores para cada posição.
Depois, exiba a matriz formatada como uma tabela.
*/
import java.util.Scanner;

public class exemplo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] [] matriz = new int [3] [3];
		
		//Entrada de dados: preencher a matriz
		System.out.println("Digite os valores para a matriz 3x3:");
		for (int i = 0; i < 3; i++) { //linhas
			for (int j = 0; j < 3; j++) { //colunas
				System.out.print("Posição [" + i + "][" + j + "]: ");
				matriz[i][j] = scanner.nextInt();
			}
		}
		
		//Saída de dados: exibir matriz
		System.out.println("\nMatriz digitada:");
		for (int i = 0; i <3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + "\t"); //"\t" = tabulação para alinhar
			}
			System.out.println(); //quebra de linha
		}
		scanner.close();
	}
}
