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

        //Solicitando dados ao usuário
        System.out.println("==========Seja bem vinde!==========");
        System.out.println("Digite o nome completo do funcionário:");
        nome = leitor.nextLine();
        System.out.println("Digite o telefone do funcionário:");
        telefone = leitor.nextLine();
        System.out.println("Digite o e-mail do funcionário:");
        email = leitor.nextLine();
        System.out.println("Digite o CPF do funcionário:");
        cpf = leitor.nextLine();
        System.out.println("Funcionário cadastrado com sucesso!");

        //Adicionando os dados a hashMap
        funcionarios.put(cpf, "Nome: " + nome + "/ Telefone: "+ telefone + "/ E-mail: "+ email);

        System.out.println(funcionarios);
    }
}