import java.util.Locale;
import java.util.Scanner;

public class imc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Double alt;
        Double pes;
        Double resultado;
        String res;
        Boolean validaAlt;
        Boolean validaPes;

        do {

            do {

                // recebe true no inicio

                validaAlt = true;

                System.out.println("Digite sua altura em metros Ex: 1.72");

                while (!scanner.hasNextDouble()) {

                    System.out.println("Digite apenas números. Ex: 1.72");

                    scanner.nextLine();
                }

                alt = scanner.nextDouble();
                scanner.nextLine();

                // caso o usuário digite em centimetro o if tranforma em Metros

                if (alt > 3) {

                    alt = alt / 100;
                }

                if (alt < 0.5 || alt > 2.8) {

                    validaAlt = false;

                    System.out.println("Altura inválida! Digite entre 0.5 e 2.8 metros (ou em cm, ex: 172).");
                }

                // !validaAlt inverte o false para true, o que faz o bloco repetir
                // ! só funciona com Boleano, ou seja, só pode ser usado se algo retorna true ou false

            } while (!validaAlt);

            do {

                validaPes = true;

                System.out.println("Digite seu peso em KG");

                while (!scanner.hasNextDouble()) {

                    System.out.println("Digite um valor válido");

                    scanner.nextLine();
                }

                pes = scanner.nextDouble();
                scanner.nextLine();

                if (pes < 2 || pes > 600) {

                    validaPes = false;

                    System.out.println("Peso inválido. Digite entre 2 e 600 kg ");
                }

            } while (!validaPes);

            // Quando quiser que o print exiba mais de uma variavel, se usa o printf, dentro
            // do "()" as duas ou mais frases vão juntas, aonde vc quer que o valor seja  exibido
            // vc coloca %.2f para double, o numero antes do f exibe a quantidades de casa após a virgula
            // %d para numeros inteiros,%n aonde quer quebrar a linha, depois fecha as aspas, e coloque as variaveis em ordem
            // exemplo eu quero que a altura apareça primeiro, ent eu coloco alt primeiro, depois separo por uma "," e coloco a próxima, sempre em ordem

            System.out.printf(Locale.US, "Sua altura é %.2f e o seu peso é %.2f%n", alt, pes);

            resultado = pes / (alt * alt);

            //Locale.US faz com que a "," seja substituida por "."

            System.out.printf(Locale.US, "Seu imc é: %.1f%n", resultado);

            // && if só roda se as duas condições forem verdadeiras (basicamente um Se isso e aquilo faça)
            // Não é necessário verificar o limite inferior nos else if,pois as condições anteriores já foram descartadas.
            // Exemplo: se chegou em (imc < 30), sabemos que o IMC já é >= 25.

            if (resultado < 18.5) {

                System.out.println("Abaixo do Peso");

            } else if (resultado < 25) {

                System.out.println("Você está no peso ideal");

            } else if (resultado < 30) {

                System.out.println("Você está acima do peso");

            } else if (resultado < 35) {

                System.out.println("Você está com obesidade grau I");

            } else if (resultado < 40) {

                System.out.println("Você está com obesidade grau II");

            } else {

                System.out.println("Você está com obesidade grau III");
            }

            System.out.println("Quer calcular de novo? S/N ");

            res = scanner.nextLine().trim();

        } while (res.equalsIgnoreCase("S"));

        System.out.print("Programa Encerrado");

        scanner.close();
    }

}
