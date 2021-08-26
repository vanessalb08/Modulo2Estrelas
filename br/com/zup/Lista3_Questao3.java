package br.com.zup;

import java.util.Scanner;

public class Lista3_Questao3 {
    public static void main(String[] args) {
        Scanner objLeitor = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Por favor, digite a primeira nota: ");
        nota1 = objLeitor.nextDouble();
        System.out.println("Por favor, digite a segunda nota: ");
        nota2 = objLeitor.nextDouble();

        media = (nota1 + nota2) / 2;

        if (nota1 >= 0 & nota1 <=10 & nota2 >= 0 & nota2 <= 10){
            if (media >= 7 & media <10){
                System.out.println("Aprovado!");
            }
            else if (media == 10){
                System.out.println("Aprovado com distinção!");
            }
            else{
                System.out.println("Reprovado!");
            }
        }
        else{
            System.out.println("Valores inválidos!");
        }
    }
}
