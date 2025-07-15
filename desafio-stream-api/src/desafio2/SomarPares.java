package desafio2;

import java.util.Arrays;
import java.util.List;

public class SomarPares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer somaPar= numeros.stream().filter(n -> n%2==0).reduce(0, (a,b) -> a+b);

        System.out.println(somaPar);
    }
}
