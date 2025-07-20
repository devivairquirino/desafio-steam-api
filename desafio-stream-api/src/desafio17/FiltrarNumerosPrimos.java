package desafio17;

import java.util.Arrays;
import java.util.List;

public class FiltrarNumerosPrimos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos= numeros.stream().filter(FiltrarNumerosPrimos::ehPrimo).toList();

        System.out.println(numerosPrimos);
    }

    private static Boolean ehPrimo(Integer numero) {
        if (numero == 2)
            return true;

        if (numero == null || numero < 2)
            return false;

        if (numero % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0)
                return false;
        }

        return true;
    }
}
