package desafio19;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SomarDivisiveisPor3e5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 30, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3);

        Optional<Integer> somaDivisiveisPor3e5= numeros.stream().filter(n -> n%3==0 && n%5==0).reduce(Integer::sum);

        System.out.println(somaDivisiveisPor3e5.get());
    }
}
