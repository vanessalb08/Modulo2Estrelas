package br.com.zup.ListasDeExercicio.Lista4;

//Escreva, usando while, um programa para calcular a média de N números.
// O valor de N é dado pelo usuário

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double soma = 0, media = 0;
        int cont = 0, numero, qtdNumeros;

        System.out.println("Informe quantos números você deseja: ");
        qtdNumeros = leitor.nextInt();

        while( cont < qtdNumeros){
            System.out.println("Digite o " + (cont + 1) + "° número: ");
            numero = leitor.nextInt();
            soma = soma + numero;
            cont ++;
        }

        media = soma / qtdNumeros;
        System.out.println("A média dos " + qtdNumeros + " números é " + media);
    }
}
