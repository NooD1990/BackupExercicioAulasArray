/*Construir um programa JAVA que contenha um método que recebe como parâmetro um array de números inteiros e retorna
 *o  maior número existente no array. */

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        int[] numeros = new int[5]; // você pediu 10, mas o laço estava indo só até 5

        // Preencher o array
        for (int i = 0; i < numeros.length; i++) {  //length ajuda a não precisar mudar além do ja estipulado acima.
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        }

        // Chamar o método que calcula o maior número
        int maior = calcularMaior(numeros);

        // Mostrar o maior número
        JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
    }

    // Método que recebe um array de inteiros e retorna o maior número
    public static int calcularMaior(int[] array) {
        int maior = array[0]; // começa assumindo que o primeiro é o maior
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }
}
