package desafio8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SomarDigitosMath {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> digitosNum = new ArrayList<>();
        numeros.stream().forEach(n -> {
            // algorithm para separa digitos, % seleciona o ultimo digito
            while (n > 0) {
                digitosNum.add(n % 10);
                n /= 10;
            }
        });

        Optional<Integer> somaDigitos = digitosNum.stream().reduce((n1, n2) -> n1 + n2);

        System.out.println(somaDigitos.get());

        // List<String[]> resultado = numeros.stream().map(n -> n.toString().split("")).toList();

        Optional<Integer> somaDigitos2= numeros.stream().

        // flat map junta os varios arrays que serão criados pelo split
        flatMap(
            n-> Arrays.stream(n.toString().split(""))
            ).
        
            // map coverte os digitos de string para int
        map(Integer::parseInt).reduce(Integer::sum);

        // resultado.forEach(arr-> System.out.println(Arrays.toString(arr)));

        System.out.println(somaDigitos2.get());
    }

}