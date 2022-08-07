// Calcular a área

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lado, area;

        System.out.println("Digite o lado da area: ");
        lado = teclado.nextInt();

        area = (lado * lado);

        System.out.println("Area: " + area);

        teclado.close();
    }
}
