package Lista_de_Exercicios_2;

import java.util.ArrayList;

public class questao7 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        double resultado =0;

        for(int i = 3; i<= 100; i+=3){
            numeros.add(i);
        }
       
        for (Integer x : numeros) {
            resultado = (double) x/2;
            System.out.println(x + "/2 = " + resultado);
        }
    }
}
