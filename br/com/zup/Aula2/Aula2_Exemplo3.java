package br.com.zup.Aula2;

import java.util.Scanner;

public class Aula2_Exemplo3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double metros, centimetros;

        System.out.println("Informe os metros ");
        metros = leitor.nextDouble();
        centimetros = metros * 100;
        System.out.println(metros + " metros equivalem a " + centimetros+ " centímetros");
    }
}
