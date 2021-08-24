package br.com.zup;

public class Aula1Exemplo2 {
    public static void main(String[] args) {
        //Armazenar valores na memória
        int numero1 = 20;
        int numero2 = 20;

        //Criando a operação de soma
        int soma = numero1 + numero2;

        //Criando a operação subtração
        int resultadoSubtracao = numero1 - numero2;

        //Criando multiplicação e divisão
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 / numero2;

        //Exibindo a operação para o usuário
        System.out.println(soma);

        //Exibindo o resultado da subtração
        System.out.println("O resultado da soma é " + soma + " e o da subtração é " + resultadoSubtracao);
        System.out.println("O resultado da multiplicação é " + multiplicacao + " e o da divisão é " + divisao);
    }
}
