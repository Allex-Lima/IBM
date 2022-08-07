/*
 * Sabendo que o valor de 100kw corresponde a 1/7 do valor do salário mínimo,
 * faça um algoritmo que receba o valor do salário mínimo e a quantidade de kw
 * gasta por uma residência e calcule:
 * 
 * a) O valor em reais de cada kw.
 * b) O valor em reais a ser pago.
 * c) O novo valor a ser pago por essa residência com um desconto de 10%.
 */

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double salarioM, valor1kw, qtdkw, valorTotal, valordesconto;

        System.out.print("Entre com o salario minimo: ");
        salarioM = sc.nextDouble();

        System.out.print("Entre com quantidade kw: ");
        qtdkw = sc.nextDouble();

        valor1kw = (salarioM / 7.0) / 100.0;
        valorTotal = valor1kw * qtdkw;
        valordesconto = valorTotal - ((valorTotal * 10.0) / 100.0);

        System.out.printf("\n\nO valor em reais de cada kw....................R$ %.2f: ", valor1kw);
        System.out.printf("\nO valor a ser pago.............................R$ %.2f: ", valorTotal);
        System.out.printf("\nO novo valor com um desconto de 10 por cento...R$ %.2f: ", valordesconto);

        sc.close();
    }
    
}
