package br.com.zup.Desafio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DesafioModulo2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String,String> funcionarios = new HashMap<String,String>();

        //Criando as variáveis necessárias
        String nome;
        String email;
        String telefone;
        String cpf;
        int opcao;
        boolean executarPrograma = true;

        System.out.println("==========Seja bem vinde!==========");

        while (executarPrograma == true){

            //Menu de opções para o usuário
            System.out.println("Digite a opção desejada:");
            System.out.println("\t1 - Adicionar funcionários");
            System.out.println("\t2 - Exibir lista de funcionários");
            System.out.println("\t3 - Encerrar programa");

            //Ler a opção do usuário
            opcao = leitor.nextInt();
            leitor.nextLine();

            //Adicionando funcionário
            if (opcao == 1){
                System.out.println("Digite o nome completo do funcionário:");
                nome = leitor.nextLine();
                System.out.println("Digite o telefone do funcionário:");
                telefone = leitor.nextLine();
                System.out.println("Digite o e-mail do funcionário:");
                email = leitor.nextLine();
                System.out.println("Digite o CPF do funcionário:");
                cpf = leitor.nextLine();

                //Adicionando os dados a hashMap
                funcionarios.put(cpf,"Nome: " + nome + "/ Telefone: "+ telefone + "/ E-mail: "+ email +"\n");
                System.out.println("\n____________________________________");
                System.out.println("Funcionário cadastrado com sucesso!");
                System.out.println("____________________________________\n");
            }
            else if (opcao == 2){
                System.out.println("--------Funcionários cadastrados:--------");
                System.out.println(funcionarios);
            }
            else if (opcao == 3){
                executarPrograma = false;
            }
            else{
                System.out.println("Por favor, digite uma opção válida");
            }
        }

    }
}