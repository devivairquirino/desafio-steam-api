package desafio7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SegundoMaior {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maior = numeros.stream().max(Comparator.naturalOrder());
        Optional<Integer> segundoMaior= numeros.stream().filter(n -> n!=maior.get()).max(Comparator.naturalOrder());

        System.out.println(segundoMaior.get());

        // segundo maior com sorted
        
        System.out.println("____________________");

        // primeiro ordeno a lista em ordem decrescente

        List<Integer> numerosOrdemDecrescente= numeros.stream().sorted(Comparator.reverseOrder()).toList();

        // agora pego o valor do index 1, que é o segundo maior.
        System.out.println(numerosOrdemDecrescente.get(1));
    }
}
