package br.com.zup.ListasDeExercicio.Lista6;

import java.util.Scanner;

/*Faça um programa que leia 5 números e informe o maior número*/
public class Questao5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero, maior = 0;
        int total = 5, cont = 1;

        while (cont <= total){
            System.out.println("Digite o "+cont+ "° número");
            numero = leitor.nextInt();

            if (cont == 1){
                maior = numero;
            }
            else if (numero > maior){
                maior = numero;
            }
            cont ++;
        }
        System.out.println("O maior número é "+maior);
    }
}
