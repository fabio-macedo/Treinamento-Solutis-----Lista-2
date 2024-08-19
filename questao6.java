package Lista_de_Exercicios_2;

import java.util.ArrayList;

public class questao6 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 15; i <= 30; i++) {
            if (i%2 != 0) {
                numeros.add(i);
            }
        }
        calculaProduto(numeros);     
    }

    private static void calculaProduto(ArrayList<Integer> numeros) {
        long produto = 1;
        for (Integer x : numeros) {
            produto *= x;
        }
        System.out.println("Produto dos números ímpares de 15 a 30: " + produto);
    }
}
