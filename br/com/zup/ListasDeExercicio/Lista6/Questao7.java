package br.com.zup.ListasDeExercicio.Lista6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba dois números inteiros e gere os números
inteiros que estão no intervalo compreendido por eles*/
public class Questao7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int cont;
        int numeroInicial;
        int numeroFinal;

        System.out.println("Por favor, informe o valor incial:");
        numeroInicial = leitor.nextInt();
        System.out.println("Por favor, infome o valor final:");
        numeroFinal = leitor.nextInt();

        cont = numeroInicial;
        if(numeroFinal > numeroInicial){
            while (cont <= numeroFinal){
                numeros.add(cont);
                numeroInicial++;
                cont++;
            }
            System.out.println(numeros);
        }
        else{
            while (cont >= numeroFinal){
                numeros.add(cont);
                numeroInicial--;
                cont--;
            }
            System.out.println(numeros);
        }
    }
}
