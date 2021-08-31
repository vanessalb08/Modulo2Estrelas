package br.com.zup.Aula6;

import java.util.ArrayList;
import java.util.List;

/*Crie uma lista para todos os números lidos
  Adicione
* */
public class Exemplo1 {
    public static void main(String[] args) {
        List<Integer> todosOsNumeros = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();
        List<Integer> numerosPares = new ArrayList<>();

        todosOsNumeros.add(70);
        todosOsNumeros.add(5);
        todosOsNumeros.add(8);
        todosOsNumeros.add(91);
        todosOsNumeros.add(46);
        todosOsNumeros.add(42);
        todosOsNumeros.add(74);
        todosOsNumeros.add(3);
        todosOsNumeros.add(13);
        todosOsNumeros.add(15);
        todosOsNumeros.add(16);
        todosOsNumeros.add(134);


        //For each
        //referencia assume o valor que está no indice em cada repetição do for
        for (Integer referencia : todosOsNumeros) {
            if (referencia % 2 == 0) {
                numerosPares.add(referencia);
            } else {
                numerosImpares.add(referencia);
            }
        }

        System.out.println("Lista completa de números");
        System.out.println(todosOsNumeros);
        System.out.println("\nLista de números pares:");
        System.out.println(numerosPares);
        System.out.printf("\nExistem %d numeros pares na lista\n", numerosPares.size());
        System.out.println("\nLista de números ímpares");
        System.out.println(numerosImpares);
        System.out.printf("\nExistem %d numeros ímpares na lista\n", numerosImpares.size());
    }
}
