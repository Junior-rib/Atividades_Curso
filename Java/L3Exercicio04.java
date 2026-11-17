import java.util.Scanner;

public class L3Exercicio04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcao;
        int totalConversoes = 0;

        do {
            System.out.println("====== CONVERSOR DE TEMPERATURA ======");
            System.out.println("1 - Celsius -> Fahrenheit");
            System.out.println("2 - Fahrenheit -> Celsius");
            System.out.println("3 - Celsius -> Kelvin");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = teclado.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite a temperatura em Celsius: ");
                    double celsius = teclado.nextDouble();

                    double fahrenheit = celsius * 9.0 / 5 + 32;

                    System.out.printf("%.1f C = %.1f F%n",
                            celsius, fahrenheit);

                    totalConversoes++;
                    break;

                case 2:
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    double f = teclado.nextDouble();

                    double c = (f - 32) * 5.0 / 9;

                    System.out.printf("%.1f F = %.1f C%n", f, c);

                    totalConversoes++;
                    break;

                case 3:
                    System.out.print("Digite a temperatura em Celsius: ");
                    double tempC = teclado.nextDouble();

                    double kelvin = tempC + 273.15;

                    System.out.printf("%.1f C = %.1f K%n",
                            tempC, kelvin);

                    totalConversoes++;
                    break;

                case 0:
                    System.out.println("Encerrando o conversor...");
                    break;

                default:
                    System.out.println(
                            "Opcao invalida! Escolha 0, 1, 2 ou 3.");
                    break;
            }

        } while (opcao != 0);

        System.out.println("Total de conversoes realizadas: "
                + totalConversoes);

        teclado.close();
    }
}