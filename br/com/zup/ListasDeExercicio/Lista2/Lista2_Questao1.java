package br.com.zup.ListasDeExercicio.Lista2;

import java.util.Scanner;

public class Lista2_Questao1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = leitor.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = leitor.nextDouble();

        if (num1 == num2){
            System.out.println("Os números são iguais.");
        }
        else if (num1 > num2){
            System.out.println("O primeiro número é o maior");
        }
        else{
            System.out.println("O segundo numero é o maior");
        }
    }
}
