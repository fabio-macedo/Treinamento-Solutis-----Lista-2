package Lista_de_Exercicios_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um texto qualquer:");
        String texto = sc.nextLine();
        
        contagem(texto);
    }
        
 private static void contagem(String texto) {

    String vogais = "aeiouAEIOUáàâãÁÀÃÂéêÉÊíÍóôõÓÔÕúÚ";
    String especiais = "'!@#$%¨&*()-_=+§/.,?°:;><|\"¬¢£ª{}[]º´`\\";
    int countVogais = 0;
    int countConsoantes = 0;
    int countEspacos = 0;
    int countCaracEspeciais = 0;
    int countDigitos = 0;

        for (char x : texto.toCharArray()) {
            if (Character.isLetter(x)) {
                if(vogais.indexOf(x) != -1){
                    countVogais++;
                }else{
                    countConsoantes++;
                }
            }
            if (x == ' ') {
                countEspacos++;
            }else if(Character.isDigit(x)){
                countDigitos++;
            }else if (especiais.indexOf(x) != -1) {
                countCaracEspeciais++;
            }
           
        }
        
        System.out.println(
            "Vogais: " + countVogais + 
            "\nConsoantes: " + countConsoantes + 
            "\nEspaços em Branco: " + countEspacos +
            "\nCaracteres Especiais: " + countCaracEspeciais +
            "\nNúmeros: " + countDigitos);
    
    }
}
