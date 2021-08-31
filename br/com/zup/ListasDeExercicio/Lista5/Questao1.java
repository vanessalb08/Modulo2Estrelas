package br.com.zup.ListasDeExercicio.Lista5;
//Faça um programa para ler uma quantidade de números (N) digitada pelo
//usuário e mostrar a quantidade de números pares desses números.

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double qtdNumeros, soma = 0, par = 0, numero;
        int cont = 0;

        System.out.println("Quantos números deseja informar?");
        qtdNumeros = leitor.nextDouble();

        while ( cont < qtdNumeros){
            System.out.println("Digite o " + (cont + 1) + "° número:");
            numero = leitor.nextDouble();
            double resto = numero % 2;
            if (resto == 0){
                par ++;
            }
            cont ++;
        }
        System.out.printf("Foram digitados %.0f números pares", par);

    }
}
