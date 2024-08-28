/*
    EXERCICIO 06 ->

    Desenvolver um programa que leia uma sequencia de numeros de 1 ate 26 e retorne cada letra do alfabeto
    correspondente ao numero.
    Ex: Input -> 1,2,3,4 Output -> ABCD
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex06 {
    static List<String> letrasAlfabeto = Arrays.asList(
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
            "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
            "U", "V", "W", "X", "Y", "Z"
    );
    static List<String> resposta = new ArrayList();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite uma sequencia de números entre 1 e 26 separada por virgula: ");

        String quantidadeNumeros = scanner.next();
        String[] numeros = quantidadeNumeros.split(","); // Divide a string com base na vírgula

        for (String numero : numeros) {
            int num = Integer.parseInt(numero.trim()); // Converte para número inteiro e remove espaços

            if (num >= 1 && num <= 26) {
                resposta.add(letrasAlfabeto.get(num - 1));  // Acessa a letra correspondente e imprime
            } else {
                resposta.add("?");  // Caso o número não esteja entre 1 e 26, imprime um caractere de erro
            }
        }
        System.out.println(resposta);
        scanner.close();
    }
}
