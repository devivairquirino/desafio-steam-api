package desafio3;

import java.util.Arrays;
import java.util.List;

public class Positivos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        String resultado= numeros.stream().allMatch(n -> n>=0) ? "Todos números são positivos!" : "A Lista contém números negativos." ;
        
        System.out.println(resultado);
    }
}
