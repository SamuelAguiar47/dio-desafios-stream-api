package desafios_stream_api;

import java.util.*;

// ********** Desafio 7 - Encontrar o segundo número maior da lista: **********

public class Desafio7 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(numeros.stream().sorted(Comparator.reverseOrder()).distinct().limit(2).skip(1).findFirst());
    }
    
}
