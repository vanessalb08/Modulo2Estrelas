package br.com.zup.ListasDeExercicio.Lista7;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int qtd, numero, cont = 1;
        double media, soma = 0;

        System.out.println("Quanto números você deseja?");
        qtd = leitor.nextInt();

        while ( cont <= qtd){
            System.out.printf("Digite o %d° número\n", cont);
            numero = leitor.nextInt();
            soma = soma + numero;
            cont++;
        }
        media = soma / qtd;
        System.out.println("A média dos números é " + media);
    }
}
