package desafio04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  A sua impressora foi infectada por um vírus e está imprimindo de forma incorreta. Depois
 *   de olhar para várias páginas impressas por um tempo, você percebe que ele está
 *   imprimindo cada linha de dentro para fora. Em outras palavras, a metade esquerda de cada
 *   linha está sendo impressa a partir do meio da página até a margem esquerda. Do mesmo
 *   modo, a metade direita de cada linha está sendo impressa à partir da margem direita e
 *   prosseguindo em direção ao centro da página.
 *
 *   Por exemplo a linha:
 *   THIS LINE IS GIBBERISH
 *   está sendo impressa como:
 *   I ENIL SIHTHSIREBBIG S
 *
 *   Da mesma forma, a linha " MANGOS " está sendo impressa incorretamente como
 *   "NAM SOG". Sua tarefa é desembaralhar (decifrar) a string a partir da forma como ela foi
 *   impressa para a sua forma original. Você pode assumir que cada linha conterá um número
 *   par de caracteres.
 */
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
