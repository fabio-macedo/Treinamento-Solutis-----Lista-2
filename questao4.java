package Lista_de_Exercicios_2;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        final double km = 1.609;

        System.out.println("Digite a distância em milhas:");
        double milhas = new Scanner(System.in).nextDouble();

        System.out.println("Adistancia em quilômetros é: " + (milhas * km) + "km");
    }
}
