package Lista_de_Exercicios_2;

public class questao11 {
    public static void main(String[] args) {
        String palavra1 = "teste";
        String palavra2 = "teste";

        
        ordemAlfabetica(palavra1, palavra2);
    }

    private static void ordemAlfabetica(String palavra1, String palavra2) {
        int comparador = palavra1.compareTo(palavra2);
        if (comparador < 0) {
            System.out.println(palavra1 + "\n" + palavra2);
        } else if(comparador > 0){
            System.out.println(palavra2 + "\n" + palavra1);
        } else {
            System.out.println("É a mesma palavra: " + palavra1);
        }
        
        maiorPalavra(palavra1, palavra2, comparador);
    }

    private static void maiorPalavra(String palavra1, String palavra2, int comparador) {
        if (comparador == 0) {
            System.out.println("As palavras são iguais, logo possuem o mesmo tamnho: " + palavra1.length() + " caracteres");
            return;
        }
        
        if(palavra1.length() == palavra2.length()){
            System.out.println("As palavras tem o mesmo tamanho!" + palavra1.length() + "caracteres");
        }
        else if(palavra1.length() > palavra2.length()){
            System.out.println(palavra1 + " é maior");
        }      
        else {
            System.out.println(palavra2 + " é maior");
        }
    }

}