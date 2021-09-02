package br.com.zup.ListasDeExercicio.Lista6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Faça um Programa que leia uma lista de 5 números inteiros, mostre a soma,
a multiplicação e os números*/
public class Questao12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numerosList = new ArrayList<>();

        int cont = 1;
        int total = 5;
        int numero;
        int soma = 0;
        int multiplicacao = 1;

        while (cont <= total){
            System.out.println("Digite o " + cont + "° número:");
            numero = leitor.nextInt();
            numerosList.add(numero);
            soma += numero;
            multiplicacao *= numero;
            cont++;
        }

        System.out.println("Os números digitados foram " + numerosList);
        System.out.println("A soma desses números é " + soma);
        System.out.println("A multiplicação desses números é " + multiplicacao);
    }
}
