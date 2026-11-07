import java.util.Locale;
import java.util.Scanner;

//Calculadora simples de terminal.
// Lê dois números e uma operação (+ - * /) e imprime o resultado.


//java.util.Locale faz que por padrão o código use "." em vez de ","


public class calculadora2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String res;
        

        //do{
        //} while faz o código repetir enquanto a condição for verdadeira.

        do {

        System.out.print("Digite o primeiro numero: ");
        double n1 = scanner.nextDouble();
        
        scanner.nextLine();

        System.out.print("Digite a operação: ");
        String sinal = scanner.nextLine();
       

        System.out.print("Digite o segundo numero: ");
        double n2 = scanner.nextDouble();

        scanner.nextLine();

        switch (sinal) {
            case "+":
                System.out.printf(Locale.US, "%.2f%n", n1+n2);
                break;
            case "-":
                System.out.printf(Locale.US, "%.2f%n", n1-n2);
                break;
            case "*":
                System.out.printf(Locale.US, "%.2f%n", n1*n2);
                break;
             case "/":
                if (n2 == 0) {
                    System.out.println("Não pode ser dividido por Zero");
                } else {
                    System.out.printf(Locale.US, "%.2f%n", n1/n2);
                }
                break;
             default:
                System.out.println("Operação Inválida");
       
        }

        //nextLine().trim()
        //Remove os espaços em branco do início e do fim de uma String.

        System.out.println("Deseja fazer outra conta? S/N");
        res = scanner.nextLine().trim();

        //equalsignoreCase
        //Compara as Strings ignorando Maiusculas e minusculas

          
        } while(res.equalsIgnoreCase("S"));

        System.out.println("Encerrando a calculadora. Até mais!");
        scanner.close();
    }
}