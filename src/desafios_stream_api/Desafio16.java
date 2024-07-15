package desafios_stream_api;

import java.util.*;
import java.util.stream.Collectors;

// ********** Desafio 16 - Agrupe os números em pares e ímpares: **********

public class Desafio16 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numPares = numeros.stream().filter(n -> n%2==0).collect(Collectors.toList());
        List<Integer> numImpares = numeros.stream().filter(n -> n%2!=0).collect(Collectors.toList());
        System.out.println(numPares);
        System.out.println(numImpares);
    }
    
}
