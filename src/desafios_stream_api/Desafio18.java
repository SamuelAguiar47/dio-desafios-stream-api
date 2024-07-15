package desafios_stream_api;

import java.util.*;
import java.util.stream.Collectors;

// ********** Desafio 18 - Verifique se todos os números da lista são iguais: **********

public class Desafio18 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //List<Integer> numeros2 = Arrays.asList(1, 1, 1, 1, 1);
        String resp = numeros.stream().distinct().collect(Collectors.toList()).size() == 1 ? "Todos os valores da lista são iguais" : "Há valores diferentes na lista";
        System.out.println(resp);
        
    }
    
}
