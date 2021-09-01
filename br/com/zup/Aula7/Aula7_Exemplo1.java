package br.com.zup.Aula7;

import java.util.HashMap;
import java.util.Map;

public class Aula7_Exemplo1 {
    public static void main(String[] args) {
        Map <String, String> contatos = new HashMap<String, String>();

        contatos.put("0239720183", "André");
        contatos.put("0193091022", "João");
        contatos.put("3187436418", "Marcio");
        contatos.put("6152612526", "Evelyn");

        for (String ref : contatos.keySet()){
            System.out.println("Chave: " + ref + " Valor: "+contatos.get(ref));
        }

        System.out.println(contatos.get("3187436418"));
    }
}
