package br.com.zup;

import java.util.Scanner;

public class Aula2_Exemplo6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        double valorHora,
                qtdHoras,
                salarioBruto,
                ir,
                inss,
                sindicato,
                salarioLiquido;
        System.out.println("Quantas horas por dia você trabalha?");
        qtdHoras = leitor.nextDouble();
        System.out.println("Qual o valor da sua hora trabalhada?");
        valorHora = leitor.nextDouble();
        salarioBruto = qtdHoras * valorHora;
        ir = salarioBruto * 0.11;
        inss = salarioBruto * 0.08;
        sindicato = salarioBruto * 0.05;
        salarioLiquido = salarioBruto - ir - inss - sindicato;

        System.out.println("Seu salário líquido pe R$" + salarioLiquido);
    }
}
