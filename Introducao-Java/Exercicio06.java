// Calcular área de um trapézio

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int area, altura, baseMenor, baseMaior;

        System.out.print("Digite a base Maior: ");
        baseMaior = sc.nextInt();

        System.out.print("Digite a base Menor: ");
        baseMenor = sc.nextInt();

        System.out.print("Digite a altura: ");
        altura = sc.nextInt();

        area = (baseMenor + baseMaior) * altura / 2;

        System.out.println("Área do trapézio: " + area);

        sc.close();
    }
    
}
