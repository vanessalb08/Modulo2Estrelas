package br.com.zup.Aula2;

import java.util.Scanner;

public class Aula2_Exemplo7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = leitor.nextInt();

        if (idade >= 18){
            System.out.println("Você pode comprar cerveja");
        }
        else{
            System.out.println("Você é menor que 18 anos, portanto não pode comprar cerveja");
        }
    }
}
