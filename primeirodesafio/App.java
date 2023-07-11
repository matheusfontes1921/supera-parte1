package primeirodesafio;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        /**
         * Considerando a entrada de valores inteiros não negativos, ordene estes valores segundo
         * o seguinte critério:
         * • Primeiro os Pares
         * • Depois os Ímpares
         * Sendo que deverão ser apresentados os pares em ordem crescente e depois os ímpares
         * em ordem decrescente.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números serão fornecidos? ");
        int quantity = sc.nextInt();
        List<Integer> geral = new ArrayList<>();
        int numero = 0;
        for (int i = 1; i <= quantity; i++) {
            System.out.println("Escreva o próximo número: ");
            numero = sc.nextInt();
            geral.add(numero);
        }
        geral.stream().filter(x -> x % 2 == 0).sorted().forEach(System.out::println);
        geral.stream().filter(x -> x % 2 != 0).sorted(Comparator.reverseOrder()).forEach(System.out::println);



    }
}
