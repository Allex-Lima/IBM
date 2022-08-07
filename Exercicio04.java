// Calcular a área do triângulo

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int base, altura, area;

        System.out.println("Digite a base: ");
        base = teclado.nextInt();

        System.out.println("Digite a altura: ");
        altura = teclado.nextInt();

        area = (base * altura) / 2;

        System.out.println("Area do Triangulo: " + area);

        teclado.close();
    }
    
}
