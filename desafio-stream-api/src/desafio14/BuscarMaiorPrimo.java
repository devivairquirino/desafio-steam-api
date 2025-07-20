package desafio14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class BuscarMaiorPrimo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> numerosPrimos = numeros.stream().filter(n -> ehPrimo(n)).max(Comparator.naturalOrder());

        System.out.println("O maior número primo da lista: "+numerosPrimos.get());
    }

    private static boolean ehPrimo(Integer numero) {
        if (numero == null || numero < 2)
            return false;

        if (numero == 2)
            return true;

        if (numero % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
