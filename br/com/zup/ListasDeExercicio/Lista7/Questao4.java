package br.com.zup.ListasDeExercicio.Lista7;
//Faça um programa que leia n números inteiros positivos e calcule a soma desses
//números

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int qtdNumeros, soma = 0, cont = 1, numero;

        System.out.println("Por favor, quantos números deseja: ");
        qtdNumeros = leitor.nextInt();
        if (qtdNumeros >= 0) {
            while (cont <= qtdNumeros) {
                System.out.println("Digite o " + cont + "° número");
                numero = leitor.nextInt();
                soma += numero;
                cont++;
            }
        }
        else{
            System.out.println("Valor inválido!");
        }

        System.out.println("A soma dos números é "+soma);
    }

}

