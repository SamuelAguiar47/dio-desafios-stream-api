package desafios_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// ********** Desafio 4 - Remova todos os valores ímpares: **********

public class Desafio4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        numeros = numeros.stream().filter(n -> n%2==0).collect(Collectors.toList());
        System.out.println(numeros);
    }
}
