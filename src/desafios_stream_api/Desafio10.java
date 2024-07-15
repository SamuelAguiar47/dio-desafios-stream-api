package desafios_stream_api;

import java.util.*;
import java.util.stream.Collectors;

// ********** Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5: **********

public class Desafio10 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numImpM3 = numeros.stream().filter(n -> n%2 != 0).filter(n -> n % 3 == 0).collect(Collectors.toList());
        List<Integer> numImpM5 = numeros.stream().filter(n -> n%2 != 0).filter(n -> n % 5 == 0).collect(Collectors.toList());
        System.out.println(numImpM3);
        System.out.println(numImpM5);
    }
    
}
