package br.com.zup.ListasDeExercicio.Lista6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Faça um Programa que leia 20 números e armazene-os numa lista. Armazene
os números pares na lista PAR e os números ÍMPARES na lista ímpar. Imprima as
três listas*/
public class Questao11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> par = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();
        List<Integer> allNumbers = new ArrayList<>();

        int cont = 1;
        int numero;
        int total = 20;
        int resto;

        while (cont <= total){
            System.out.println("Por favor, digite o "+cont+"° número:");
            numero = leitor.nextInt();
            allNumbers.add(numero);

            resto = numero % 2;

            if (resto == 0){
                par.add(numero);
            }
            else{
                impar.add(numero);
            }

            cont++;
        }
        System.out.println("Os números pares são: " + par);
        System.out.println("Os números ímpares são: " + impar);
        System.out.println("A lista de números completa é:" + allNumbers);

    }
}
