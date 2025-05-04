/*Construir um programa JAVA que contenha um método que leia dois array A e B com 6 elementos inteiros. 
 *Após, gerar um novo array C resultante da soma dos elementos do array A + B.*/

import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {
		
	int[] A = new int[6];
	for (int x = 0; x < A.length; x++){
		A[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite os números do array A: "));
	}
	int[] B = new int[6];
	for (int y = 0; y < B.length; y++){
		B[y] = Integer.parseInt(JOptionPane.showInputDialog("Digite os números do array B: "));
	}
	int[] resultado = soma (A,B); //tenho que usar o [] para retornar o resultado como array. não esquecer disso

        // Exibe o resultado
	String mensagem = ""; 	//criou variavel mensagem para a mensagem para o usuário
	for (int i = 0; i < resultado.length; i++) {	//usar o for para mostrar todos os resultados do array
	    mensagem += "Elemento " + i + ": " + resultado[i] + "\n";	//aqui usa a variavel mensagem para elaborar a mesma mensagem 6 vezes.
	}
	JOptionPane.showMessageDialog(null, mensagem);	//chama a janela para exibir a mensagem para o usuario chamando a variavel mensagem.
	}
	
	public static int[] soma (int A[], int B[]){	//não esquecer que aqui também ten que usar o "int[]", já que o resultado deve ser um array.
		int[] C = new int[6];	// você criou um array vazio com 6 posições
		for (int i = 0; i < A.length; i++) { 	//vou usar o tamanho do array "A" invés do "C" nesta etapa
			C[i] = A[i] + B[i];	// preenche cada posição de C com a soma dos valores de A e B
		}
		return C;
	}
	}
