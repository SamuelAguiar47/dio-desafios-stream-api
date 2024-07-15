package desafios_stream_api;

import java.util.*;

// ********** Desafio 11 - Encontre a soma dos quadrados de todos os números da lista: **********

public class Desafio11 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println("---------------------");
        numeros.stream().forEach(n1 -> {
            numeros.stream().forEach(n2 -> {
                System.out.println(n1 + "² + " + n2 + "² = " + (Math.pow(n1, 2) + Math.pow(n2,2)));
            });
            System.out.println("---------------------");
        });
    }
    
}
