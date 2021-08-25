package br.com.zup;

import java.util.Scanner;

public class Aula2_Exemplo1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome de usuário:");
        String nome = leitor.nextLine();
        System.out.println("Por favor, digite sua idade: ");
        int idade = leitor.nextInt();
    }
}
