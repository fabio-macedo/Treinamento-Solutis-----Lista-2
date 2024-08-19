package Lista_de_Exercicios_2.questao_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Lista_de_Exercicios_2.questao_12.Registros;

public class questao12 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Registros> registros = new ArrayList<>();
        Registros registrados = new Registros();

        int totalKm = 0;
        int totalLitros = 0;
        
        System.out.println("Quantos tanques?");
        int tanques = sc.nextInt();


        for (int i = 1; i <= tanques; i++) {
            System.out.println("Quantidade de km tanque " + i + ": ");
            totalKm = sc.nextInt();
            System.out.println("Quantidade de litros tanque " + i + ": ");
            totalLitros = sc.nextInt();

            registros.add(new Registros(totalKm, totalLitros));
            //consumo para cada tanque
            System.out.printf("Consumo do tanque: %.2f\n",(double) totalKm/totalLitros);
            System.out.println();
            registrados.totalKm(totalKm);
            registrados.totalLitros(totalLitros);
        }

        
        //imprimir km combinado e soma total dos litros
        System.out.println("Soma total de km: " + registrados.getKmTotal());
        System.out.println("Soma total de litros: " + registrados.getLitrosTotal());
        System.out.printf("Consumo médio: %.2f", (double) registrados.getKmTotal()/registrados.getLitrosTotal());
        
    }

    
}
