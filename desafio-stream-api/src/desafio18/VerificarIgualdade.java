package desafio18;

import java.util.Arrays;
import java.util.List;

public class VerificarIgualdade {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List <Integer> numerosDistintos= numeros.stream().distinct().toList();

        boolean haDiferentes = numerosDistintos.stream().count()>1;
        System.out.println(haDiferentes? "Os numeros da lista não sao iguais":"Os numeros da lista são iguais.");

        boolean todosIguais = numeros.stream().allMatch(n -> n.equals(numeros.get(0)));

        System.out.println(todosIguais? "Todos numeros sao iguais": "Há numeros diferentes");


    }
}
