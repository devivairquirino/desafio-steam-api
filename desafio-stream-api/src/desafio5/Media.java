package desafio5;

import java.util.Arrays;
import java.util.List;

public class Media {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer somaMaiorQue5= numeros.stream().filter(n -> n>5).reduce(0, ((n1,n2) -> n1+n2));

        Double media = (double) (somaMaiorQue5/2);

        System.out.println(somaMaiorQue5);

        System.out.println(media);

    }
}
