package br.com.zup;

import java.util.Scanner;

public class Lista2_Questao2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double produto1, produto2, produto3;

        //Recebendo valores do usuário
        System.out.println("Qual o valor do produto 1? ");
        produto1 = leitor.nextDouble();
        System.out.println("Qual o valor do produto 2? ");
        produto2 = leitor.nextDouble();
        System.out.println("Qual o valor do produto 3? ");
        produto3 = leitor.nextDouble();

        //Condições de verificação de menor preço
        if (produto1 < produto2 & produto1< produto3){
            System.out.println("O produto 1 é o mais barato");
        }
        else if (produto2 < produto1 & produto2 < produto3){
            System.out.println("O produto 2 é o mais barato.");
        }
        else{
            System.out.println("O produto 3 é o mais barato");
        }
    }
}
