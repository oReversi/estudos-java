
import java.util.Scanner;

public class Count {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i;
        int f;
        int c;
        String r;
        boolean validaR;

        do {

            System.out.println("Digite o inicio ");

            while (!scanner.hasNextInt()) {

                System.out.println("Digite um Número inteiro ");

                scanner.nextLine();
            }

            i = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o fim ");

            while (!scanner.hasNextInt()) {

                System.out.println("Digite um Número inteiro");

                scanner.nextLine();
            }

            f = scanner.nextInt();
            scanner.nextLine();

            if (i <= f) {

                c = i;

                while (c <= f) {
                    System.out.printf("%d ... %n", c);

                    c = c + 1;
                }

            } else if (i > f) {

                c = i;

                while (c >= f) {
                    System.out.printf("%d ... %n", c);

                    c = c - 1;
                }
            }

            System.out.println("Deseja contar novamente? S/N");
            r = scanner.nextLine().trim();

            validaR = true;

            do {

                if (!r.equalsIgnoreCase("S") && !r.equalsIgnoreCase("N")) {

                    validaR = false;

                    System.out.println("Digite apenas S ou N!");

                    r = scanner.nextLine().trim();
                    
                }else {

                    validaR = true;
                }

            } while (!validaR);


        } while (r.equalsIgnoreCase("S"));



        scanner.close();

    }
}
