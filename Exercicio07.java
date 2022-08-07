// Calcular volume de um paralelepipedo

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int volume, base, altura, profundidade;
        
        System.out.print("Digite a base: ");
        base = sc.nextInt();

        System.out.print("Digite a altura: ");
        altura = sc.nextInt();

        System.out.print("Digite a profundidade: ");
        profundidade = sc.nextInt();

        volume = (base * altura * profundidade);

        System.out.println("Volume de um paralelepipedo: " + volume);

        sc.close();
    }
    
}
