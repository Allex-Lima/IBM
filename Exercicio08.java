// Calcular volume de um cubo

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lado, volume;

        System.out.print("Digite o lado: ");
        lado = sc.nextInt();

        volume = lado * lado * lado;

        System.out.println("Volume do cubo: " + volume);

        sc.close();
    }
    
}
