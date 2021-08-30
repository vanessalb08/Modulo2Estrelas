package br.com.zup.Aula4;

import java.util.Scanner;
//Resolução lista 4 questão 4
public class Aula4_Exemplo1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double qtdNumeros, soma = 0, media = 0;
        int cont = 0;

        System.out.println("Por favor, digite a quantidade de números:");
        qtdNumeros = leitor.nextDouble();

        while (cont < qtdNumeros){
            System.out.println("Digite o " + (cont + 1) +" número");
            double valorLido = leitor.nextDouble();
            //Toda vez q executar i looping, nós vamos somar o valor lido a variável soma
            soma = soma + valorLido;
            cont ++;
        }

        media = soma / qtdNumeros;
        System.out.println("A média artmética dos numeros é " + media);

    }
}
