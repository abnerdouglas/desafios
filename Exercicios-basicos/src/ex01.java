/*
    EXERCICIO 01 ->

    Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
    mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
    (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
*/

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PROGRAMA PARA TRANSFORMAR OS ANOS, MESES E DIAS DA IDADE DE UMA PESSOA EM DIAS");

        System.out.print("Digite a sua idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite a quantidade de meses além dos anos completos: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a quantidade de dias além dos anos e meses completos: ");
        int dias = scanner.nextInt();

        int totalDeDias = (anos * 365) + (meses * 30) + dias;
        System.out.print("Sua idade convertida em dias é igual a: " + totalDeDias + " dias");

        scanner.close();
    }
}