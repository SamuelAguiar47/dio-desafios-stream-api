package desafios_stream_api;

import java.util.*;
import java.util.stream.Collectors;

// ********** Desafio 13 - Filtrar os números que estão dentro de um intervalo: **********

public class Desafio13 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int menorValor = 5;
        int maiorValor = 10;
        System.out.println(numeros.stream().filter(n -> (n >= menorValor && n<= maiorValor)).collect(Collectors.toList()));
    }
    
}
