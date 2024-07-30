/*
    EXERCICIO 05 ->

    Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
    antecessor e seu sucessor.
 */

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PROGRAMA PARA IMPRIMIR O ANTECESSOR E SUCESSOR DE UM NÚMERO INTEIRO");
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        int numAntecessor = num - 1;
        int numSucessor = num + 1;

        System.out.printf("Antecessor: %d\n", numAntecessor);
        System.out.printf("Sucessor: %d\n", numSucessor);
    }
}
