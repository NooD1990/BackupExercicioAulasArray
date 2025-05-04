/*
Crie uma matriz 3x3 com valores fixos.
Mostre apenas os valores da diagonal principal.
Exemplo: elementos [0][0], [1][1], [2][2]
*/
public class exercicio4 {
    public static void main(String[] args) {
        
        int[][] matriz = {
            {1, 2, 3},
            {5, 6, 7},
            {8, 9, 0}
        };

        System.out.println("Elementos da diagonal principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + "\t");
        }
    }
}

