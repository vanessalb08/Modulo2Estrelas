package br.com.zup.Aula2;

import java.util.Scanner;

public class Aula2_Exemplo4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double valorHora, qtdHoras, valorRecebido;

        System.out.println("Quantas horas você trabalha por mês?");
        qtdHoras = leitor.nextDouble();
        System.out.println("Qual o valor da sua hora trabalhada?");
        valorHora = leitor.nextDouble();
        valorRecebido = qtdHoras * valorHora;

        System.out.println("Trabalhando " + qtdHoras + " você receberá R$" + valorRecebido);
    }
}
