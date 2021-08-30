package br.com.zup.ListasDeExercicio.Lista4;

//Faça um programa para ler 5 números e mostrar o resultado da
// soma desses números

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int cont = 0, soma = 0, numero;

        while (cont < 5){
            System.out.println("Digite um número: ");
            numero = leitor.nextInt();
            soma = soma + numero;
            cont++;
        }

        System.out.println("A soma dos números é: " + soma);
    }
}
