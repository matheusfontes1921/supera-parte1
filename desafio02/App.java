package desafio02;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor
 * monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor
 * pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas
 * possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas
 * necessárias.
 * */

public class App {
    public static void main(String[] args) {
                /* Leitura do valor passado pelo usuário */
                Scanner sc = new Scanner(System.in);
                System.out.print("Valor: ");
                double valor = sc.nextDouble();

                /* inicialização das listas com valores de notas e moedas */
                List<Integer> notas = new ArrayList<>(Arrays.asList(100,50,20,10,5,2));
                List<Double> moedas = new ArrayList<>() {{
                    add(1.00);
                    add(0.50);
                    add(0.25);
                    add(0.10);
                    add(0.05);
                    add(0.01);

                }};

                /* for-each de notas que pega cada valor de nota dentro do arraylist específico,
                 * pega a quantidade máxima do valor maior e subtrai a quantia do valor inicial
                 */
                System.out.println("NOTAS:");
                for (int nota : notas) {
                    int quantidadeNotas = (int) (valor / nota);
                    if (quantidadeNotas != 0) {
                        System.out.printf("%d notas de R$%d%n", quantidadeNotas, nota);
                    }
                    valor -= quantidadeNotas * nota;
                }

                /* for-each de moedas que possui a mesma ideia do acima */
                System.out.println("MOEDAS:");
                for (double moeda : moedas) {
                    int quantidadeMoedas = (int) (valor / moeda);
                    if (quantidadeMoedas != 0) {
                        System.out.printf("%d moeda(s) de R$%.2f%n", quantidadeMoedas, moeda);
                    }
                    valor -= quantidadeMoedas * moeda;
                }
            }
        }

