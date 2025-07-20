package desafio12;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Produtos {

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> produtoNumeros= numeros.stream().reduce((n1,n2)-> n1*n2);

        System.out.println(produtoNumeros.get());
    }
}