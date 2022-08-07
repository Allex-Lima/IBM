// Inverter o número de três digitos

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroOriginal, centena, dezena, unidade, resto, novoNumero;

        System.out.println("Digite um numero com 3 digitos: ");
        numeroOriginal = teclado.nextInt();

        centena = numeroOriginal / 100;
        resto = numeroOriginal % 100;

        dezena = resto / 10;
        unidade = resto % 10;

        novoNumero = unidade * 100 + dezena * 10 + centena;

        System.out.println("O novo numero vale " + novoNumero);

        teclado.close();
    }
}