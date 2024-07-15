package desafios_stream_api;

import java.util.*;
import java.util.stream.Collectors;

// ********** Desafio 14 - Encontre o maior número primo da lista: **********

public class Desafio14 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(numeros.stream().filter(n -> {
            Double numAtual = (double) n;
            int divs = 0;
            for(int cont = 1; cont<=numAtual; cont++) {
                if (numAtual%cont==0) {
                    divs += 1;
                }
            }
            if (divs == 2) {
                return true;
            } else {
                return false;
            }
        }
        ).collect(Collectors.toList()).stream().max(Comparator.naturalOrder()));
    }
    
}
