package desafios_stream_api;

import java.util.*;

// ********** Desafio 3 - Verifique se todos os números da lista são positivos: **********

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        System.out.println(numeros.stream().allMatch(n -> n>0));
    }
}
