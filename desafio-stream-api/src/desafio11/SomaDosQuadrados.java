package desafio11;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SomaDosQuadrados {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> somaDosQuadrados= numeros.stream().map(n -> potencia(n,2)).reduce(Integer::sum);
        System.out.println(somaDosQuadrados.get());
        System.out.println(Math.pow(3,2));
        System.out.println(potencia(3,2));
    }

    private static Integer potencia(Integer base, Integer expoente) {
        Integer resultado = 1;

        if (expoente == 0)
            return resultado;

        resultado = base;

        for (int i = 1; i < expoente; i++) {
            resultado *= base;
        }

        return resultado;
    }
}