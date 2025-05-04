/*Construir um programa JAVA que contenha um m�todo que recebe como par�metro um array de n�meros inteiros e�retorna
 *o �maior n�mero existente no array. */

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        int[] numeros = new int[5]; // voc� pediu 10, mas o la�o estava indo s� at� 5

        // Preencher o array
        for (int i = 0; i < numeros.length; i++) {  //length ajuda a n�o precisar mudar al�m do ja estipulado acima.
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
        }

        // Chamar o m�todo que calcula o maior n�mero
        int maior = calcularMaior(numeros);

        // Mostrar o maior n�mero
        JOptionPane.showMessageDialog(null, "O maior n�mero �: " + maior);
    }

    // M�todo que recebe um array de inteiros e retorna o maior n�mero
    public static int calcularMaior(int[] array) {
        int maior = array[0]; // come�a assumindo que o primeiro � o maior
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }
}
