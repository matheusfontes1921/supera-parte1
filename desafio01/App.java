package desafio01;
import java.util.*;
public class App {
    public static void main(String[] args) {
        /*
         * Considerando a entrada de valores inteiros não negativos, ordene estes valores segundo
         * o seguinte critério:
         * • Primeiro os Pares
         * • Depois os Ímpares
         * Sendo que deverão ser apresentados os pares em ordem crescente e depois os ímpares
         * em ordem decrescente.
         */

        /* inicialização do scanner e leitura da quantidade de números */
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números serão fornecidos? ");
        int quantity = sc.nextInt();
        /*inicialização da lista de números e criação da variavel numero
         * para armazenamento de valor atual
         */
        List<Integer> geral = new ArrayList<>();
        int numero;
        /* for com número de interações fornecido pelo usuário */
        for (int i = 1; i <= quantity; i++) {
            System.out.println("Escreva o próximo número: ");
            numero = sc.nextInt();
            /* sempre adiciona o número fornecido pelo usuário na lista de inteiros */
            geral.add(numero);
        }
        /* imprime os pares em ordem crescente */
        geral.stream().filter(x -> x % 2 == 0).sorted().forEach(System.out::println);
        /* imprime os ímpares em ordem decrescente */
        geral.stream().filter(x -> x % 2 != 0).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
