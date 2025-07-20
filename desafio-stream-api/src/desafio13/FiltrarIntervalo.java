package desafio13;

import java.util.Arrays;
import java.util.List;

public class FiltrarIntervalo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // variaveis para intervalo
        int minimo= 5;
        int maximo= 10;


        List <Integer> intervaloFiltrado= numeros.stream().filter(n -> n >= minimo && n <= maximo).toList();


        System.out.println(intervaloFiltrado);
    }
}
