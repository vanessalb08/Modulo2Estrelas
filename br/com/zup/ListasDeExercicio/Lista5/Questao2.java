package br.com.zup.ListasDeExercicio.Lista5;

import java.util.Scanner;

//Faça um programa para ler uma quantidade de números (N) digitada pelo
//usuário e mostrar a quantidade de números ímpares desses números.
public class Questao2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero, qtdNumeros, soma = 0, impar = 0, resto;
        int cont = 1;

        System.out.println("Digite a quantidade de números que você deseja:");
        qtdNumeros = leitor.nextInt();

        while (cont <= qtdNumeros){
            System.out.println("Informe o " + cont + " número");
            numero = leitor.nextInt();
            resto = numero % 2;
            if (resto != 0){
                impar ++;
            }
            cont ++;
        }
        System.out.printf("Foram digitados %d números ímpares", impar);
    }
}
