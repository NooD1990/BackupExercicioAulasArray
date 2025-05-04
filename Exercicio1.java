/*Uma ind�stria deseja controlar as temperaturas de uma m�quina. Considere o problema de registrar as temperaturas di�rias
 *de uma m�quina, correspondente ao ano (365 dias) de opera��o da m�quina. O valor de cada dia � armazenado em uma
 *vari�vel interna a uma estrutura array conhecida pela vari�vel-apontador temperatura. */

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        // Criar um array para armazenar 10 temperaturas
        double[] temperaturas = new double[10];

        // Criando um objeto Scanner para ler a entrada do usu�rio
        Scanner dados = new Scanner(System.in);

        // Armazena a temperatura no array
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a Temperatura: ");
            temperaturas[i] = dados.nextDouble();  
        }
        // Exibindo as temperaturas digitadas
        for (int i = 0; i < 10; i++) {
            System.out.println("Temperaturas: " + temperaturas[i]);
        }
        dados.close();
    }
}
