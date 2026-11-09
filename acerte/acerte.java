import java.util.Random;
import java.util.Scanner;

public class acerte {
    public static void main(String[] args) {
        
        // fazer um sistema de repetição, enquanto não colocar um valor válido, o
        // programa continua perguntando.
        // Scanner deve ser declarado antes do laço

        Scanner scanner = new Scanner(System.in);
        String res;

        do {
            Random random = new Random();
            System.out.println("Qual o valor máximo? ");

            // variavel limite determina o valor máximo

            int limite = scanner.nextInt();
            int numero = random.nextInt(1, limite + 1);

            System.out.println("Qual é o seu palpite? ");
            int palpite = scanner.nextInt();

            if (palpite < 1 || palpite > limite)  {

                // caso o palpite seja maior que numero limite, o programa pede um valor válido

                System.out.printf("Número inválido! Digite um valor entre 1 e %d%n", limite);
                System.out.print("Qual é o seu palpite? ");
                palpite = scanner.nextInt();

            }

            // fazer sistema caso acerte (if/else)

            if (palpite == numero) {

                System.out.println("Você acertou! ");
            } else {
                System.out.printf("Você errou... O número correto era %d%n", numero);
            }

            System.out.print("Deseja tentar novamente? S/N ");
            scanner.nextLine();
            res = scanner.nextLine().trim();

        } while (res.equalsIgnoreCase("S"));

        // fecha o scanner

        scanner.close();

    }
}
