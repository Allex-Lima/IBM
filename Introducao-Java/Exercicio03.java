// Calcular a área do retângulo

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int base, altura, area;

        System.out.println("Digite a base: ");
        base = teclado.nextInt();

        System.out.println("Digite a altura: ");
        altura = teclado.nextInt();

        area = base * altura;

        System.out.println("Area de um retangulo: " + area);


        teclado.close();
    }
    
}
