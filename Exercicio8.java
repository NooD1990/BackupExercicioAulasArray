/*A linguagem Java oferece uma opera��o arraycopy(), que copia os valores de um array para outro.
A sintaxe � dada por: System.arraycopy( origem, i, destino, j, n ).
Descubra (consultando bibliografia de refer�ncia) como utilizar esta opera��o para copiar os valores da vari�vel numeros para a vari�vel copia
, e construa um programa java para exemplificar.*/

import javax.swing.JOptionPane;

public class Exercicio8 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] copia = new int[5];

        // Preenche o array original
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero " + (i + 1) + ":"));
        }

        // Copia os valores do array numeros para copia
        System.arraycopy(numeros, 0, copia, 0, numeros.length);

        // Monta uma string para exibir os dois arrays
        String listaOriginal = "Original: ";
        String listaCopia = "C�pia: ";

        for (int i = 0; i < numeros.length; i++) {
            listaOriginal += numeros[i] + " ";
            listaCopia += copia[i] + " ";
        }

        // Exibe os dois arrays
        JOptionPane.showMessageDialog(null, listaOriginal + "\n" + listaCopia);
    }
}
