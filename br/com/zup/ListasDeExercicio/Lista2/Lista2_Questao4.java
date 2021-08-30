package br.com.zup.ListasDeExercicio.Lista2;

import java.util.Scanner;

public class Lista2_Questao4 {
    public static void main(String[] args) {
        Scanner objLeitor = new Scanner(System.in);

        double salario, aumentoPercentual, novoSalario;

        System.out.println("Por favor, informe seu salário:");
        salario = objLeitor.nextDouble();

       if (salario > 0){
           if (salario <= 280){
               aumentoPercentual = salario * 0.2;
               novoSalario = salario + aumentoPercentual;
               System.out.println("O seu salário era R$" + salario + " e terá um reajuste de 20%, totalizado R$" + aumentoPercentual);
               System.out.println("Seu novo salário será R$" + novoSalario);
           }
           else if (salario > 280 & salario <= 700){
               aumentoPercentual = salario * 0.15;
               novoSalario = salario + aumentoPercentual;
               System.out.println("O seu salário era R$" + salario + " e terá um reajuste de 15%, totalizado R$" + aumentoPercentual);
               System.out.println("Seu novo salário será R$" + novoSalario);
           }
           else if (salario > 700 & salario <= 1500){
               aumentoPercentual = salario * 0.1;
               novoSalario = salario + aumentoPercentual;
               System.out.println("O seu salário era R$" + salario + " e terá um reajuste de 10%, totalizado R$" + aumentoPercentual);
               System.out.println("Seu novo salário será R$" + novoSalario);
           }
           else{
               aumentoPercentual = salario * 0.05;
               novoSalario = salario + aumentoPercentual;
               System.out.println("O seu salário era R$" + salario + " e terá um reajuste de 5%, totalizado R$" + aumentoPercentual);
               System.out.println("Seu novo salário será R$" + novoSalario);
           }
       }
       else{
           System.out.println("Por favor, digite um valor válido!");
       }
       }
}
