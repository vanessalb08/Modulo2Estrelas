package br.com.zup.ListasDeExercicio.Lista7;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int cont = 1;
        int numero, maior = 0, menor = 0;

        while (cont <= 10){
            System.out.println("Digite o "+ cont + "° número");
            numero = leitor.nextInt();
            if (cont == 1){
                maior = numero;
                menor = numero;
            }
            else{
                if (maior <= numero){
                    maior = numero;
                }
                else if (menor > numero){
                    menor = numero;
                }
            }
            cont++;
        }
        System.out.printf("O maior número é %d e o menor número é %d", maior, menor);
    }
}
