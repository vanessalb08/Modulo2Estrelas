package br.com.zup.ListasDeExercicio.Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Lista3_Questao2 {
    public static void main(String[] args) {

        Scanner objLeitor = new Scanner(System.in);

        double nLitros, valor = 0;
        double valorDesconto = 0;
        double valorTotal = 0;
        String tipoCombustivel, tipo = null;

        System.out.println("Quantos litros você deseja abastecer?");
        nLitros = objLeitor.nextDouble();
        System.out.println("Qual o tipo do combustível? \n\tA - Álcool\n\tG- Gasolina");
        tipoCombustivel = objLeitor.next();

        if (tipoCombustivel.equals("A") | tipoCombustivel.equals("a")) {
            tipo = "Álcool";
            valor = nLitros * 1.9;
            if (nLitros <= 20 & nLitros >0) {
                valorDesconto = valor * 0.03;
                }
            else {
                valorDesconto = valor * 0.05;
                }
            }
        else if (tipoCombustivel.equals("G") | tipoCombustivel.equals("g")) {
            tipo = "Gasolina";
            valor = nLitros * 2.5;
            if (nLitros <= 20  & nLitros >0) {
                valorDesconto = valor * 0.04;
                } 
            else {
                valorDesconto = valor * 0.06;
                }
            }
        else {
            System.out.println("Por favor, digite uma opção válida!");
            }
        valorTotal = valor - valorDesconto;
        System.out.print("Você abasteceu " + nLitros + "L de " + tipo +" e irá pagar um total de R$ ");
        System.out.printf("%.2f", valorTotal);
    }
}
