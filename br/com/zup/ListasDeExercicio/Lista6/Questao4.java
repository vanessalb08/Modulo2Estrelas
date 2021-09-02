package br.com.zup.ListasDeExercicio.Lista6;

import java.util.Scanner;

/*Faça um programa que peça um número inteiro e determine se
ele é ou não um número primo*/
public class Questao4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num, primo = 0, cont = 1;

        System.out.println("Informe um número para saber se ele é primo:");
        num = leitor.nextInt();

        while (cont <= num){
            if( num % cont == 0){
                primo++;
            }
            cont++;
        }
        if (primo == 2 | num == 1){
            System.out.println("O número é primo");
        }
        else{
            System.out.println("O número não é primo");
        }

    }
}
