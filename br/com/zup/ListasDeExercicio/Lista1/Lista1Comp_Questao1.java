package br.com.zup.ListasDeExercicio.Lista1;

import java.util.Scanner;

public class Lista1Comp_Questao1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o peso dos peixes?");
        float peso = leitor.nextFloat();
        float excesso = peso - 50;
        float multa = excesso * 4;

        System.out.println("Você excedeu " + excesso + "kg e irá pagar multa no valor de R$" + multa);


    }
}
