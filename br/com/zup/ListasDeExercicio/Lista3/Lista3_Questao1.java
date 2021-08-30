package br.com.zup.ListasDeExercicio.Lista3;

import java.util.Scanner;

public class Lista3_Questao1 {
    public static void main(String[] args) {
        Scanner objLeitor = new Scanner (System.in);

        double inss, fgts, salBruto, salLiquido, ir, valorHora, qtdHoras, descontos;

        inss = 0.1;
        fgts = 0.11;

        System.out.println("Vamos calcular sua folha d pagamento.");
        System.out.println("Quantas horas por dia você trabalha:");
        qtdHoras = objLeitor.nextDouble();
        System.out.println("Qual o valor da sua hora trabalhada?");
        valorHora = objLeitor.nextDouble();

        salBruto = qtdHoras * valorHora;
        //Consertar printf do salário bruto
        System.out.printf("%-35s(%.0f * %.0f) ", "\tSalário Bruto: ", qtdHoras ,valorHora);
        System.out.printf(":R$%10.2f%n" ,salBruto);

        if (salBruto <= 900){
            ir = 0;
            System.out.printf("%-35s :R$%8.2f%n", "\t(-) IR (Isento)", ir * salBruto);
        }
        else if (salBruto > 900 & salBruto <=1500){
            ir = 0.05;
            System.out.printf("%-35s :R$%8.2f%n", "\t(-) IR (%5)", ir * salBruto);
        }
        else if (salBruto > 1500 & salBruto <= 2500){
            ir = 0.1;
            System.out.printf("%-35s :R$%8.2f%n", "\t(-) IR (10%)", ir * salBruto);
        }
        else{
            ir = 0.2;
            System.out.printf("%-35s :R$%8.2f%n", "\t(-) IR (20%)", ir * salBruto);
        }

        System.out.printf("%-35s :R$%8.2f%n", "\t(-) INSS (10%)", inss * salBruto);
        System.out.printf("%-35s :R$%8.2f%n", "\tFGTS (11%)", fgts * salBruto );

        descontos = (ir * salBruto) + (inss * salBruto);
        System.out.printf("%-35s :R$%8.2f%n", "\tTotal de descontos (11%)", descontos);

        salLiquido = salBruto - (salBruto * inss) - (salBruto * ir);
        System.out.printf("%-35s :R$%8.2f%n", "\tSalário Líquido (11%)", salLiquido);

    }
}
