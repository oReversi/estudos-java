import java.util.Locale;
import java.util.Scanner;

//java.util.Locale faz que por padrão o código use "." em vez de ","

//Calculadora simples de terminal.
// Lê dois números e uma operação (+ - * /) e imprime o resultado.

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o primeiro numero: ");
        double n1 = scanner.nextDouble();
        
        scanner.nextLine();

        System.out.print("Digite a operação: ");
        String sinal = scanner.nextLine();
       

        System.out.print("Digite o segundo numero: ");
        double n2 = scanner.nextDouble();

        if (sinal.equals("+")){
            System.out.printf("%.1f", n1+n2);
        }

        else if (sinal.equals("-")){
           System.out.printf("%.1f", n1-n2);
        }

        // Divisão por zero precisa de tratamento à parte

        else if (sinal.equals("/")){
            if (n2 == 0){
                System.out.print("Não pode ser dividido por Zero");
            }else{
                System.out.printf("%.1f", n1/n2);
            }
        }

        else if (sinal.equals("*")){
            System.out.printf("%.1f", n1*n2);
        }

        else {
            System.out.print("Operação inválida");
        }
 
    }
}
