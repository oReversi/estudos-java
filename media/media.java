

import java.util.Locale;
import java.util.Scanner;

//Calcula o Aproveitamento do Aluno

public class media {
   public static void main(String[] args) {

      String res;
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);



      do {

      double media = 7;
      System.out.printf("Nota necessária para passar: %.1f%n", media);

    

     System.out.println("Qual a primeira nota? ");
     Double Nota1 = scanner.nextDouble();

     

     System.out.println("Qual a segunda nota? ");
     Double Nota2 = scanner.nextDouble();

     

     System.out.println("Qual a terceira nota? ");
     Double Nota3 = scanner.nextDouble();

     scanner.nextLine();

   
     Double divisao = (Nota1+Nota2+Nota3) /3;
     System.out.printf("%.1f%n", divisao);


     if (divisao >= media){
        System.out.println(" Aprovado");
     } else if (divisao >= 5) {

     System.out.println("Recuperação");
     } else {
        
        System.out.println("Reprovado");
     }

     System.out.println("Deseja continuar? S/N");
     res = scanner.nextLine().trim();


     } while(res.equalsIgnoreCase("S"));
     

     System.out.println("Programa encerrado");

     scanner.close();
      
    }
}