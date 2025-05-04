/*Construir um programa JAVA que contenha um m�todo que leia dois array A e B com 6 elementos inteiros. 
 *Ap�s, gerar um novo array C resultante da soma dos elementos do array A + B.*/

import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {
		
	int[] A = new int[6];
	for (int x = 0; x < A.length; x++){
		A[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite os n�meros do array A: "));
	}
	int[] B = new int[6];
	for (int y = 0; y < B.length; y++){
		B[y] = Integer.parseInt(JOptionPane.showInputDialog("Digite os n�meros do array B: "));
	}
	int[] resultado = soma (A,B); //tenho que usar o [] para retornar o resultado como array. n�o esquecer disso

        // Exibe o resultado
	String mensagem = ""; 	//criou variavel mensagem para a mensagem para o usu�rio
	for (int i = 0; i < resultado.length; i++) {	//usar o for para mostrar todos os resultados do array
	    mensagem += "Elemento " + i + ": " + resultado[i] + "\n";	//aqui usa a variavel mensagem para elaborar a mesma mensagem 6 vezes.
	}
	JOptionPane.showMessageDialog(null, mensagem);	//chama a janela para exibir a mensagem para o usuario chamando a variavel mensagem.
	}
	
	public static int[] soma (int A[], int B[]){	//n�o esquecer que aqui tamb�m ten que usar o "int[]", j� que o resultado deve ser um array.
		int[] C = new int[6];	// voc� criou um array vazio com 6 posi��es
		for (int i = 0; i < A.length; i++) { 	//vou usar o tamanho do array "A" inv�s do "C" nesta etapa
			C[i] = A[i] + B[i];	// preenche cada posi��o de C com a soma dos valores de A e B
		}
		return C;
	}
	}
