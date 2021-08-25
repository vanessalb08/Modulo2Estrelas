package br.com.zup;
/*Receber 4 notas
Fazer média delas
Mostar média na tela
 */

import java.util.Scanner;

public class Aula2_Exemplo2 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner leitor = new Scanner(System.in);
        double nota1,
                nota2,
                nota3,
                nota4,
                soma,
                media;

        //Receber variáveis
        System.out.println("Vou calcular sua média aritmética");
        System.out.println("Digite o valor da nota 1:");
        nota1 = leitor.nextDouble();
        System.out.println("Digite o valor da nota 2:");
        nota2 = leitor.nextDouble();
        System.out.println("Digite o valor da nota 3:");
        nota3 = leitor.nextDouble();
        System.out.println("Digite o valor da nota 4:");
        nota4 = leitor.nextDouble();

        //Calcular médias
        soma = nota1 + nota2 + nota3 + nota4;
        media = soma/4;
        //Exibir dados
        System.out.println("A soma de suas médias é " + soma + "e sua média é "+media);
    }
}
