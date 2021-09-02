package br.com.zup.ListasDeExercicio.Lista6;

import java.util.List;
import java.util.Scanner;

/*programa que leia a variável peso (peso de peixes) e
calcule o excesso. Gravar na variável excesso a quantidade de quilos além do
limite e na variável multa o valor da multa que João deverá pagar. Imprima os
dados do programa com as mensagens adequadas.*/
public class Questao13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double pesoMax = 50;
        double multa = 4;
        double valorMulta;
        double pesoInserido;
        double excesso;

        System.out.println("Qual o peso dos peixes?");
        pesoInserido = leitor.nextDouble();
        excesso = pesoInserido - pesoMax;

        if (excesso > 0){
            valorMulta = excesso * multa;
            System.out.printf("Você excedeu %.2fkg e precisará pagar R$ %.2f de multa", excesso, valorMulta);
        }
        else{
            System.out.println("Você não excedeu o peso, não precisa pagar nenhuma multa");
        }


    }
}
