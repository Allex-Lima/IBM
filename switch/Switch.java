import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o DDD: ");
        int ddd = sc.nextInt();

        switch (ddd) {
            case 11:
                System.out.println("São Paulo");
            case 19:
            System.out.println("Campinas");
            break;
            case 21:
                System.out.println("Rio de Janeiro");
                break;
            case 27:
                System.out.println("Vitoria");
                break;
            case 31:
                System.out.println("Belo Horizonte");
                break;
            case 32:
                System.out.println("Juiz de Fora");
                break;
            case 61:
                System.out.println("Brasilia");
                break;
            case 71:
                System.out.println("Salvador");
                break;
            default:
                System.out.println("DDD não cadastrado");
                break;
        }

        sc.close();
    }
    
}
