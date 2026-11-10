
import java.util.Random;
import java.util.Scanner;

public class acerte2 {
    public static void main(String[] args) {

        // Fazer um sistema de repetição, enquanto não colocar um valor válido, o
        // Programa continua perguntando.
        // Scanner deve ser declarado antes do laço
        // Tipo da variavel declarado no inicio, não muda nada em si. Mas deixa
        // organizado

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String res;
        int limite;
        int numero;
        int palpite;

        do {

            System.out.println("Qual o valor máximo? ");

            // Variavel limite determina o valor máximo
            // Sistema que empessa de colocar números menores ou iguais a 1 no limite

            while (!scanner.hasNextInt()) {

                // confere se a próxima entrada é inteiro (true/false), sem consumir nada
                // o código recebe false "!" inverte false por true para a condição ser válida e
                // o laço ocorrer

                System.out.println("Digite um número inteiro");

                // esse scanner aqui, consome a entrada inválida

                scanner.nextLine();
            }

            limite = scanner.nextInt();
            scanner.nextLine();

            while (limite <= 1) {

                System.out.println("O número precisa ser maior do que 1");
                System.out.println("Qual o valor máximo? ");

                while (!scanner.hasNextInt()) {

                    System.out.println("Digite um número inteiro");
                    // scanner.nextLine(); consome o valor inválido
                    scanner.nextLine();

                }

                limite = scanner.nextInt();

                // nextInt() lê só o número e deixa o Enter; nextLine() consome esse Enter

                scanner.nextLine();
            }

            numero = random.nextInt(1, limite + 1);

            // Limite+1 por que se não o limite não entra no sorteio

            System.out.println("Qual é o seu palpite? ");

            while (!scanner.hasNextInt()) {

                System.out.println("Digite um número inteiro");
                scanner.nextLine();
            }

            palpite = scanner.nextInt();

            scanner.nextLine();

            while (palpite < 1 || palpite > limite) {

                // Caso o palpite seja maior que numero limite, o programa pede um valor válido

                System.out.printf("Número inválido! Digite um valor entre 1 e %d%n", limite);
                System.out.println("Qual é o seu palpite? ");

                while (!scanner.hasNextInt()) {

                    System.out.println("Digite um número inteiro");
                    scanner.nextLine();

                }

                palpite = scanner.nextInt();

                scanner.nextLine();

            }

            // Fazer sistema caso acerte (if/else)

            if (palpite == numero) {

                System.out.println("Você acertou!");
            } else {

                System.out.printf("Você errou... O número correto era %d%n", numero);
            }

            System.out.println("Deseja tentar novamente? S/N ");

            res = scanner.nextLine().trim();

        } while (res.equalsIgnoreCase("S"));

        // Fecha o scanner

        scanner.close();
    }
}