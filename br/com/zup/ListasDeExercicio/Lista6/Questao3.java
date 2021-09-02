package br.com.zup.ListasDeExercicio.Lista6;

import java.util.Scanner;

/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer
número inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver
a tabuada*/
public class Questao3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int cont = 1, numero, multiplicacao;

        System.out.println("Digite o número que deseja ver a tabuada:");
        numero = leitor.nextInt();

        if (numero < 0 | numero > 10){
            System.out.println("Por favor, digite um valor válido");
        }
        else{
            while (cont <= 10){
                multiplicacao = numero * cont;
                System.out.printf("%d x %2d = %3d\n", numero, cont, multiplicacao);
                cont ++;
            }

        }
    }
}
