import java.util.Locale;
import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double fah;
        double cel;
        boolean validaFah;
        String res;

        do {

            do {

                validaFah = true;

                System.out.println("Digite a temperatura em fahrenheit");

                while (!scanner.hasNextDouble()) {

                    System.out.println("Digite um valor válido. EX: 100");

                    scanner.nextLine();
                }

                fah = scanner.nextDouble();
                scanner.nextLine();

                if (fah < -459.67) {

                    validaFah = false;

                    System.out.println("Esse valor está abaixo do Zero Absoluto. Digite um valor igual ou acima de -459.67");
                }

            } while (!validaFah);

            cel = (fah - 32) * 5 / 9;
            System.out.printf(Locale.US, "A temperatura em celsius é: %.2f%n", cel);

            System.out.println("Quer calcular de novo? S/N ");

            res = scanner.nextLine().trim();

        } while (res.equalsIgnoreCase("S"));

        scanner.close();
    }

}