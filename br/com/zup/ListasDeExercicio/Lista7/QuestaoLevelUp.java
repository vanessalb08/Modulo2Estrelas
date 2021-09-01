package br.com.zup.ListasDeExercicio.Lista7;
/*Faça um programa que:
    some os números ímpares contidos em um intervalo definido pelo usuário.
    O usuário define o valor inicial do intervalo e o valor final deste intervalo
    programa deve somar todos os números ímpares contidos neste intervalo.
>>Caso o usuário digite um intervalo inválido (começando por um valor
maior que o valor final) deve ser escrito uma mensagem de erro na tela, “Intervalo
de valores inválido” e o programa termina.*/
import java.util.Scanner;

public class QuestaoLevelUp {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int soma = 0, nImpares, inicio, vfinal;


        System.out.println("Digite o valor inicial do intervalo:");
        inicio = leitor.nextInt();
        System.out.println("Digite o valor final do intervalo:");
        vfinal = leitor.nextInt();

        if (inicio > vfinal){
            System.out.println("Intervalo de valores inválido");
        }
        else{
            int cont = inicio;
            while (cont <= vfinal){
                int resto = cont % 2;
                if (resto != 0){
                    soma += cont;
                }
                cont++;
            }

            System.out.println("A soma dos números ímpares é " + soma);
        }

    }
}
