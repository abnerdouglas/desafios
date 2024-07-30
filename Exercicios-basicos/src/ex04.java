/*
    EXERCICIO 04 ->

    Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
    calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
    (1SM=R$788,00)
 */

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PROGRAMA PARA CALCULAR A QUANTIDADE DE SALÁRIOS MÍNIMOS QUE O USUÁRIO GANHA COM BASE EM SEU SALÁRIO");

        System.out.print("Digite o valor do salário mínimo em (apenas números): ");
        float salarioMinimo = scanner.nextFloat();

        System.out.print("Digite o valor de seu salário em (apenas números): ");
        float salarioUsuario = scanner.nextFloat();

        float diferencaSalario = (salarioUsuario/salarioMinimo);

        System.out.println("----------------------------------------------------------------");
        System.out.printf("1 Salário Mínimo = R$%.2f\n", salarioMinimo);
        System.out.printf("1 Salário do Usuário = R$%.2f\n", salarioUsuario);
        System.out.printf("1 Salário do Usuário = %.2f Salários Mínimos.\n", diferencaSalario);
        System.out.println("----------------------------------------------------------------");

        scanner.close();
    }
}
