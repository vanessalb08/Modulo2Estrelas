package br.com.zup.Desafios;

import java.util.Scanner;

/*receba um conjunto de N números e mostre:
    a. O menor valor
    b. O maior valor
    c. A soma dos valores.*/
public class Desafio2_Lista5 {
    public static void main(String[] args) {

        Scanner leitor  =new Scanner(System.in);

        int maior = 0, menor = 0, soma, numero1, numero;
        String opcao;

        System.out.println("Por favor, digite um número:");
        numero1 = leitor.nextInt();
        System.out.println("Deseja inserir outro número? [S/N]");
        opcao = leitor.next();
        maior = numero1;
        menor = numero1;
        soma = numero1;
        while (opcao.equals("S") | opcao.equals("s")){
            System.out.println("Digite mais um número");
            numero = leitor.nextInt();
            soma = soma + numero;

            if (numero >= maior){
                maior = numero;
            }
            else if(numero <= menor){
                menor = numero;
            }

            System.out.println("Deseja inserir outro número:");
            opcao = leitor.next();
        }

        System.out.printf("O maior número inserido é %d e o menor número é %d\n", maior, menor);
        System.out.println("A soma dos números é " + soma);
    }
}
