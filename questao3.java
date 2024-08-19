package Lista_de_Exercicios_2;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        //ler um numero, e escrever todos os primos menores que ele.

        System.out.println("Digite um número, e mostrarei os primos menores que ele:");
      
        int number = new Scanner(System.in).nextInt();
        while(number <= 0){
            System.out.println("Digite um número positivo");
            number = new Scanner(System.in).nextInt();
       };
        primosMenores(number);
    }

    private static void primosMenores(int number) {
        if (number == 1) {
            System.out.println("Por definição, o número " + number + " não é considerado primo!");
        }else if(number == 2){
            System.out.println(number + " é primo, e não há primos menores!");
        }
        
        for(int i = number-1; i > 2; i--){
            if (ePrimo(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean ePrimo(int number) {
       
        for(int i = 2; i < number; i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
