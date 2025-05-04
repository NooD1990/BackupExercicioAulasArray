import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int positivo = 0, negativo = 0;
    int[] numeros = new int[10];
        Scanner dados = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite numeros (positivos e negativos): ");
            numeros[i] = dados.nextInt();
            if (numeros[i] >= 0) {
            positivo++;
            }
            if (numeros[i] < 0) {
            negativo++;
            }            
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Numeros digitados: " + numeros[i]);
        }
        System.out.println("Qtde numeros negativos: " + negativo);        
        System.out.println("Qtde numeros positivos: " + positivo); 
        dados.close();
    }
}
