/*
    EXERCICIO 03 ->

    Escrever um algoritmo que lê:
    - a porcentagem do IPI a ser acrescido no valor das peças
    - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
    - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
    O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
    Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
 */

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PROGRAMA PARA CALCULAR O IPI");

        System.out.print("Digite a porcentagem do IPI (apenas os números): ");
        double porcentagemIPI = scanner.nextDouble();

        // PEÇA 1

        System.out.print("Digite o código da peça 1: ");
        int codigoPeca1 = scanner.nextInt();

        System.out.print("Digite o valor unitário da peça 1: ");
        float valorPeca1 = scanner.nextFloat();

        System.out.print("Digite a quantidade de peças 1: ");
        int quantidadePecas1 = scanner.nextInt();

        // PEÇA 2

        System.out.print("Digite o código da peça 2: ");
        int codigoPeca2 = scanner.nextInt();

        System.out.print("Digite o valor unitário da peça 2: ");
        float valorPeca2 = scanner.nextFloat();

        System.out.print("Digite a quantidade de peças 2: ");
        int quantidadePecas2 = scanner.nextInt();

        double valorITotalSemIPI = (valorPeca1 * quantidadePecas1) + (valorPeca2 * quantidadePecas2);
        double valorTotalComIPI = valorITotalSemIPI * ((porcentagemIPI/100) + 1);

        System.out.println("----------------------------------------------");
        System.out.println("Código peça 1: " + codigoPeca1);
        System.out.println("Código peça 2: " + codigoPeca2);
        System.out.printf("Valor final sem IPI: R$%.2f\n", valorITotalSemIPI);
        System.out.printf("Valor final com IPI: R$%.2f\n", valorTotalComIPI);
        System.out.println("----------------------------------------------");

        scanner.close();
    }
}
