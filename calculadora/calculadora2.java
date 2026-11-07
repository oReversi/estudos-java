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

        if (sinal.equals("+")){
            System.out.printf("%.1f%n", n1+n2);
        }

        else if (sinal.equals("-")){
           System.out.printf("%.1f%n", n1-n2);
        }

        // Divisão por zero precisa de tratamento à parte

        else if (sinal.equals("/")){
            if (n2 == 0){
                System.out.println("Não pode ser dividido por Zero");
            }else{
                System.out.printf("%.1f%n", n1/n2);
            }
        }

        else if (sinal.equals("*")){
            System.out.printf("%.1f%n", n1*n2);
        }

        else {
            System.out.println("Operação inválida");
        
            
        }

        scanner.nextLine();

        System.out.println("Deseja fazer outra conta? S/N");
        res = scanner.nextLine().trim();

          
        } while(res.equalsIgnoreCase("S"));

        System.out.println("Encerrando a calculadora. Até mais!");
        scanner.close();
    }
}