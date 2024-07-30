/*
    EXERCICIO 02 - >

    Informar um saldo e imprimir o saldo com reajuste de 15%
*/

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PROGRAMA PARA CALCULAR O REAJUSTE DE 15% EM UM SALDO");

        System.out.print("Digite um saldo qualquer: ");
        double valor = scanner.nextDouble();

        valor += 0.15 * valor;
        System.out.printf("Novo saldo: %.2f\n", valor);

        scanner.close();
    }
}
