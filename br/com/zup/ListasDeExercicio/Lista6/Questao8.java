package br.com.zup.ListasDeExercicio.Lista6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Faça um Programa que leia uma lista de 5 números inteiros e mostre-os*/
public class Questao8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> lNumeros = new ArrayList<>();

        int cont = 1;
        int numero;

        while(cont <=5){
            System.out.println("Informe o " + cont + "° número:");
            numero = leitor.nextInt();
            lNumeros.add(numero);
            cont++;
        }

        System.out.println(lNumeros);
    }
}
