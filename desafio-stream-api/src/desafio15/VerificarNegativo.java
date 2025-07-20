package desafio15;

import java.util.Arrays;
import java.util.List;

public class VerificarNegativo {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,0);

        Boolean haNegativos= numeros.stream().anyMatch(n-> n<0);

        System.out.println(haNegativos?"Há ao menos um número negativo na lista" : "Não há numeros negativos");
    }
}