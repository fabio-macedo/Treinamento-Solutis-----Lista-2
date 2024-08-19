package Lista_de_Exercicios_2;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o 1º valor: ");
        int valor1 = sc.nextInt();
        System.out.println("Digite o 2º valor: ");
        int valor2 = sc.nextInt();

        maiorValor(valor1, valor2);
    }

    private static void maiorValor(int valor1, int valor2) {
        if (valor1 == valor2) {
            System.out.println("Os valores são iguais");
        }else if (valor1 > valor2) {
            System.out.println("O valor 1 é maior: " + valor1);
        }else{
            System.out.println("O valor 2 é maior: " + valor2);
        }
    }

    

    
}
