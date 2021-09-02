package br.com.zup.ListasDeExercicio.Lista6;

import java.util.Scanner;

/*Faça um programa que pergunte o preço de três produtos e informe qual
produto você deve comprar, sabendo que a decisão é sempre pelo mais barato*/
public class Questao1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double produto, produto3, menor = 0;
        int cont = 1, comprar = 1;

        while (cont <= 3){
            System.out.println("Por favor, digite o valor do " + cont + "° produto:");
            produto = leitor.nextDouble();

            if (cont == 1){
                menor = produto;
            }
            else if(produto < menor){
                menor = produto;
                comprar = cont;
            }
            cont ++;
        }
        System.out.println("O produto mais barato é o " + comprar + "° produto, que custa R$ "+ menor);

    }
}
