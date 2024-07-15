package desafios_stream_api;

import java.util.*;

// ********** Desafio 15 - Verifique se a lista contém pelo menos um número negativo: **********

public class Desafio15 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(numeros.stream().anyMatch(n -> n<0));
    }
    
}
