package br.com.zup.ListasDeExercicio.Lista6;

import java.util.ArrayList;
import java.util.List;

/*Faça um programa que imprima na tela apenas os números ímpares entre 1 e
  50*/
public class Questao6 {
    public static void main(String[] args) {
        List<Integer> impar = new ArrayList<>();
        int resto, cont = 1;

        while (cont <= 50){
            resto = cont % 2;
            if(resto != 0){
                impar.add(cont);
            }
            cont ++;
        }
        System.out.println(impar);
    }
}
