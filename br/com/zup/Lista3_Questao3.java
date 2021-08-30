package br.com.zup;

import java.util.Locale;
import java.util.Scanner;

public class Lista3_Questao3 {
    public static void main(String[] args) {
        Scanner objleitor = new Scanner(System.in);

        String resposta;
        int cont = 0;

        System.out.println("Olá! Somos da polícia e estamos investigando um crime. Vamos te fazer " +
                "algumas perguntas. Digite S para Sim e N para Não:");

        //Perguntas e contadores
        System.out.println("Telefonou para a vítima?");
        resposta = objleitor.nextLine().toUpperCase(Locale.ROOT);
        if (resposta.equals("S")){
            cont +=1;
        }

        System.out.println("Esteve no local do crime?");
        resposta = objleitor.nextLine().toUpperCase(Locale.ROOT);
        if (resposta.equals("S")){
            cont +=1;
        }
        System.out.println("Mora perto da vítima?");
        resposta = objleitor.nextLine().toUpperCase(Locale.ROOT);
        if (resposta.equals("S")){
            cont +=1;
        }
        System.out.println("Devia para a vítima?");
        resposta = objleitor.nextLine().toUpperCase(Locale.ROOT);
        if (resposta.equals("S")){
            cont +=1;
        }
        System.out.println("Já trabalhou com a vítima?");
        resposta = objleitor.nextLine().toUpperCase(Locale.ROOT);
        if (resposta.equals("S")){
            cont +=1;
        }

        switch (cont){
            case 2:
                System.out.println("Você é suspeito do assassinato");
                break;
            case 3:
                System.out.println("Você é cumplice do assassinato.");
                break;
            case 4:
                System.out.println("Você é cúmplice do assassinato.");
                break;
            case 5:
                System.out.println("Você é o assassino. Você está preso!");
                break;
            default:
                System.out.println("Você é inocente, desculpe o incomodo!");
                break;
        }

        //System.out.println(cont);
    }
}
