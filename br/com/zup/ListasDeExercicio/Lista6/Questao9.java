package br.com.zup.ListasDeExercicio.Lista6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Faça um Programa que leia uma lista de 10 números e mostre-os na ordem
inversa*/
public class Questao9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> inverso = new ArrayList<>();

        //Variáveis

        int contLista = 1;
        int total = 10;
        int numero;
       // int contInverso = 0;// tem que ser de 0 a 9 pq listas começama  contar da posição 0
       int totalInverso = 0;

        while (contLista <= total) {
            System.out.println("Por favor, digite um número: ");
            numero = leitor.nextInt();
            inverso.add(numero);
            contLista++;
        }
        for (int contInverso = 9; contInverso >= totalInverso; contInverso--) {
            System.out.print(inverso.get(contInverso)+" ");
        }

    }
}
