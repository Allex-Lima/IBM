import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double PI = 3.14, volume, raio, altura;

        System.out.print("Digite o raio: ");
        raio = sc.nextDouble();

        System.out.print("Digite a altura: ");
        altura = sc.nextDouble();

        volume = (PI * raio * raio * altura);

        System.out.println("Volume de um cilidro: " + volume);

        sc.close();
    }
    
}
