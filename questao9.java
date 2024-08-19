package Lista_de_Exercicios_2;
import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        System.out.println("Digite o raio do círculo:");
        double raio = new Scanner(System.in).nextDouble();

        area(raio);
    }

    private static void area(double raio) {
        //Area = PI * raio²
        double area = Math.PI * raio * raio;
        System.out.printf("A área do círculo é: %.2f", area );
    }
}
