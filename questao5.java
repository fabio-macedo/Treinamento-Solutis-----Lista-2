package Lista_de_Exercicios_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Map<Integer, String> dias = new HashMap<>();
        dias.put(1, "Segunda");
        dias.put(2, "Terça");
        dias.put(3, "Quarta");
        dias.put(4, "Quinta");
        dias.put(5, "Sexta");
        dias.put(6, "Sábado");
        dias.put(7, "Domingo");
        
        System.out.println("Digite um número de 1 a 7 correspondente aos dias da semana:");
        int num = new Scanner(System.in).nextInt();


        System.out.println(dias.getOrDefault(num, "Não há essa opção!"));
    }
}
