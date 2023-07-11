package terceirodesafio;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Set;

public class App {
    public static <Map> void main(String[] args) {
        /*
         * Dado um array de inteiros e um valor alvo, determine o número de pares entre os elementos
         * do array em que a sua diferença seja igual ao valor alvo.
         */
        /* Leitura de variáveis e construção dos valores do array */
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamanho do array: ");
        int tamanho = sc.nextInt();
        System.out.print("Valor alvo: ");
        int alvo = sc.nextInt();
        int[] array = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Digite o valor %d do array: ", i+1);
            array[i] = sc.nextInt();
        }

        /* variável que controla o número de pares que satisfazem a condição */
        int qtdPares = 0;

        /* for que percorre o array buscando os pares corretos */
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = i + 1; j < tamanho; j++) {
                if (array[i] - array[j] == alvo) {
                    qtdPares++;
                }
            }
        }
        System.out.println("Número de pares: " + qtdPares);
    }
}

