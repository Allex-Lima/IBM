import java.util.Scanner;

public class EmpregadoTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Empregado e1, e2;
		
		String nome1, nome2;
		double salario1, salario2;
		
		System.out.print("Digite o nome do funcionario: ");
		nome1 = sc.nextLine();
		System.out.print("Digite o salario R$ : ");
		salario1 = Double.parseDouble(sc.nextLine());
		
		System.out.print("digite o nome do funcionario: ");
		nome2 = sc.nextLine();
		System.out.print("Digite o salario R$ : ");
		salario2 = Double.parseDouble(sc.nextLine());
		
		e1 = new Empregado(nome1, salario1);
		e2 = new Empregado(nome2, salario2);
		
		//antes do reajuste
		System.out.println("\n----- informacoes originais -----");
		System.out.println(e1.exibir());
		System.out.println(e2.exibir());
		
		// depois do reajuste
		e1.aumentarSalario(5.0);
		e2.aumentarSalario(10);
		
		System.out.println("\n----- Depois do reajuste -----");
		System.out.println(e1.exibir());
		System.out.println(e2.exibir());
		
		sc.close();
	}

}
