package desafio9;

import java.util.Arrays;
import java.util.List;

public class VerificarDistintos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // distinct tira os elementos repetidos do List
        List<Integer> numerosDisttintos = numeros.stream().distinct().toList();

        // se as lista forem iguais, significa que não há numeros repetidos
        String resultado = numeros.equals(numerosDisttintos) ? "Não há numeros repetidos" : "Há numeros repetidos";

        System.out.println(resultado);

    }
}
