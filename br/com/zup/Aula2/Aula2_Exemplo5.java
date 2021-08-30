package br.com.zup.Aula2;

import java.util.Scanner;

public class Aula2_Exemplo5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        double celsius, fahrenheit;

        System.out.println("Digite a temperatura em Fahrenheit:");
        fahrenheit = leitor.nextDouble();
        celsius = (fahrenheit - 32) / 1.8;

        System.out.println(fahrenheit + "°F equivale a "+ celsius + "°C.");
    }
}
