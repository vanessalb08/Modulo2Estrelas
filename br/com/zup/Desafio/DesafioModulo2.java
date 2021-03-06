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
        String excluir;
        int opcao;
        boolean executarPrograma = true;

        System.out.println("==========Seja bem vinde!==========");

        while (executarPrograma == true){

            //Menu de opções para o usuário
            System.out.println("Digite a opção desejada:");
            System.out.println("\t1 - Adicionar funcionários");
            System.out.println("\t2 - Exibir lista de funcionários");
            System.out.println("\t3 - Excluir funcionário");
            System.out.println("\t4 - Encerrar programa");

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

                //Verificando se o CPF já está cadastrado
                //Se a lista não estiver vazia, faz a verificação
                if ( funcionarios.size() > 0){
                    for ( String verificacaoCPF : funcionarios.keySet()){
                        if (verificacaoCPF.equals(cpf)){
                            System.out.println("Já existe um funcionário cadastrado com esse CPF");
                        }
                        //Caso não esteja
                        else{
                            //Adicionando os dados a hashMap
                            funcionarios.put(cpf,"Nome: " + nome + "/ Telefone: "+ telefone + "/ E-mail: "+ email +"\n");
                            System.out.println("\n____________________________________");
                            System.out.println("Funcionário cadastrado com sucesso!");
                            System.out.println("____________________________________\n");
                        }
                    }
                }
                //Caso a lista esteja vazia, adiciona diretamente
                else{
                    funcionarios.put(cpf,"Nome: " + nome + "/ Telefone: "+ telefone + "/ E-mail: "+ email +"\n");
                    System.out.println("\n____________________________________");
                    System.out.println("Funcionário cadastrado com sucesso!");
                    System.out.println("____________________________________\n");
                }

            }
            //Mostrar lista de funcionários
            else if (opcao == 2){
                //Mostrar mensagem caso a lista esteja vazia
                if (funcionarios.size() == 0){
                    System.out.println("Não há funcionários cadastrados, por favor cadastre.");
                }
                else{
                    System.out.println("--------Funcionários cadastrados:--------");
                    System.out.println(funcionarios);
                }
            }
            //Excluir funcionário
            else if (opcao == 3){
                //Verificar se a lista está vazia
                if (funcionarios.size() == 0){
                    System.out.println("Não há funcionários cadastrados, por favor cadastre.");
                }
                //Caso não esteja, excluir
                else{
                    System.out.println("Digite o CPF do funcionario que deseja excluir:");
                    excluir = leitor.nextLine();
                    for ( String verificacaoCPF : funcionarios.keySet()){
                        //Verificar se o cpf informado está cadastrado
                        if (verificacaoCPF.equals(excluir)){
                            funcionarios.remove(excluir);
                            System.out.println("Funcionário com CPF " + excluir + " excluído com sucesso");
                        }
                        //Caso CPF não esteja cadastrado
                        else{
                            System.out.println("Não existe funcionário cadastrado com esse CPF");
                        }
                    }

                }
            }
            //Sair do programa
            else if (opcao == 4){
                executarPrograma = false;
                System.out.println("Até mais!");
            }
            //Caso o usuário digite uma opção que não está no menu
            else{
                System.out.println("Por favor, digite uma opção válida");
            }
        }

    }
}