package br.com.zup.ListasDeExercicio.Lista5;
//Faça um programa para ler uma quantidade de números (N) digitada pelo
//usuário e mostrar a quantidade de números pares e a quantidade de números
//ímpares desses números

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int par = 0, impar = 0, resto, qtdNumeros, numero;
        int cont = 1;

        System.out.println("Digite quantos números você deseja:");
        qtdNumeros  = leitor.nextInt();

        while (cont <= qtdNumeros){
            System.out.printf("Digite o %d° número:\n", cont);
            numero = leitor.nextInt();
            resto = numero % 2;
            if (resto == 0){
                par++;
            }
            else {
                impar ++;
            }
            cont ++;
        }
        System.out.printf("Foram digitados %d números pares e %d números ímpares", par, impar);
    }
}
