package desafio04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /* Inicialização de variáveis e leitura da quantidade de strings */
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de palavras para teste: ");
        int quantidade = sc.nextInt();
        sc.nextLine();
        List<String> palavras = new ArrayList<>();
        String palavraAtual;
        /* for para criar uma lista com as palavras desordenadas */
        for (int i = 1; i <= quantidade; i++) {
            System.out.printf("Escreva a string de número %d: ", i);
            palavraAtual = sc.nextLine();
            palavras.add(palavraAtual);
        }
        /* for que pega todas as frases desordenadas na lista palavras e chama o método
         * ordenacao para cada uma
         */
        for (String frase : palavras) {
            String palavraOrdenada = ordenacao(frase);
            System.out.println(palavraOrdenada);
        }
    }

    /* método que vai ordenar as palavras */
    public static String ordenacao(String frase) {
        StringBuilder sb = new StringBuilder();
        /* for que pega do meio até o inicio da string, ordenando conforme especificado */
        for (int i = frase.length() / 2 - 1; i >= 0; i--){
            /* caracteres dessa região são adicionados ao StringBuilder */
            sb.append(frase.charAt(i));
        }
        /* for que pega do fim até o meio da string, ordenando conforme especificado */
        for (int i = frase.length() - 1; i>= frase.length() / 2; i--) {
            /* caracteres dessa região são adicionados ao StringBuilder */
            sb.append(frase.charAt(i));
        }
        /* utilização de StringBuilder visando melhora de desempenho do código */
        return sb.toString();
    }
}
