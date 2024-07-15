package desafios_stream_api;

import java.util.*;

// ********** Desafio 8 - Somar os dígitos de todos os números da lista: **********

public class Desafio8 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numSomados = new ArrayList<>();
        numeros.stream().forEach(n -> {
           String nString = n.toString();
           char[] nCArray = nString.toCharArray();
           int s = 0;
           for(char c : nCArray) {
            s += Integer.parseInt(String.valueOf(c));
           }
           n = s;
           numSomados.add(n);
        });
        numeros = numSomados;
        System.out.println(numeros);
    }
    
}
