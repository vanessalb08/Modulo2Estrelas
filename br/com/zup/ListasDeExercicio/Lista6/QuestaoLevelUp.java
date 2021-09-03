package br.com.zup.ListasDeExercicio.Lista6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Crie um programa para gerenciar uma lista de alunos, cada aluno tem nome,
telefone e email. No final do programa deve ser exibido a lista de alunos
cadastrados.
    Entrega Mínima: O sistema permite, via terminal, inserir pelo menos 1 aluno em
    uma lista e retornar o mesmo na tela.
    Entrega Média: O sistema permite adicionar mais de um aluno e apresenta um
    menu para decidir se deverá adicionar mais alunos ou encerrar o programa.
    Entrega Máxima: O Sistema permite excluir um aluno usando como parâmetro o
    email e não permite inserir um aluno com o email repetido*/
public class QuestaoLevelUp {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String,String> cadastroAlunos = new HashMap<String,String>();

        String email, nome, telefone;
        String resposta;
        String excluir;

        System.out.println("Digite o email do aluno:");
        email = leitor.nextLine();
        System.out.println("Digite o nome do aluno:");
        nome = leitor.nextLine();
        System.out.println("Digite o telefone do aluno:");
        telefone = leitor.nextLine();
        cadastroAlunos.put(email,(" " + nome +" / " + telefone));

        System.out.println("Deseja adicionar mais algum aluno?\n A - Adicionar\nS - Sair do programa");
        resposta = leitor.nextLine();

        //colocar condição para os menus
        // trocar o while por if e colocar as 3 opções disponíveis
        //deixar em loop caso a pessoa digite o valor inválido
        while (resposta.equals("A") | resposta.equals("a")){
            System.out.println("Digite o email do aluno:");
            email = leitor.nextLine();
            System.out.println("Digite o nome do aluno:");
            nome = leitor.nextLine();
            System.out.println("Digite o telefone do aluno:");
            telefone = leitor.nextLine();
            cadastroAlunos.put(email,(" " + nome +" / " + telefone));

            System.out.println("O que deseja fazer agora?\n A- Adicionar\nE - Excluir\n S - Sair do programa");
            resposta = leitor.nextLine();
        }
        if (resposta.equals("e") | resposta.equals("E")){
            System.out.println("Digite o email do aluno que deseja excluir:");
            excluir = leitor.nextLine();
            cadastroAlunos.remove(excluir);
        }

        for (String chaveAluno : cadastroAlunos.keySet()){
            System.out.println("Email: "+ chaveAluno + ". Nome / telefone:" +cadastroAlunos.get(chaveAluno));
        }

    }
}
