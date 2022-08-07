// Calcular a área de losango

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int area, diagonal01, diagonal02;

        System.out.print("Digite a diagonal 1: ");
        diagonal01 = teclado.nextInt();

        System.out.print("Digite a diagonal 2: ");
        diagonal02 = teclado.nextInt();

        area = (diagonal01 * diagonal02);

        System.out.println("Area de um losango: " + area);

        teclado.close();
    }
    
}
