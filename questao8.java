package Lista_de_Exercicios_2;
import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite uma palavra:");
        String nome = sc.nextLine();
       
        verificaPalindromo(nome);
    }

    private static void verificaPalindromo(String nome) {
       int inicio = 0;
       int fim = nome.length() -1;
       boolean ePalindromo =  true;

       while (inicio < fim) {
            if(nome.charAt(inicio) != nome.charAt(fim)){
                ePalindromo = false;
                break;
            }
            inicio++;
            fim--;
       }

       if (ePalindromo) {
        System.out.println("A palavra " + nome + " é um palíndromo!");
       }else{
        System.out.println("A palavra" + nome + " não é um palíndromo");
       }
        
    }
}
