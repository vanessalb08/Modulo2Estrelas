package br.com.zup.ListasDeExercicio.Lista6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Faça um Programa que leia 4 notas, mostre as notas e a média na tela*/
public class Questao10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Double> notasList = new ArrayList<>();

        double media = 0;
        double nota;
        int total = 4;
        int cont = 1;
        double soma = 0;

        while (cont <= total){
            System.out.println("Por favor, digite a "+ cont +"ª nota:");
            nota = leitor.nextDouble();
            notasList.add(nota);
            soma+= nota;
            cont++;
        }
        media = soma / total;
        System.out.println("As notas inseridas foram "+notasList);
        System.out.println("A média delas é "+media);
    }
}
