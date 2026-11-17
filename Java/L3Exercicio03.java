import java.util.Scanner;

public class L3Exercicio03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int pinCorreto = 2468;
        int maxTentativas = 3;
        int tentativas = 0;
        int pinDigitado;

        do {
            System.out.print("Digite seu PIN (4 digitos): ");
            pinDigitado = teclado.nextInt();

            tentativas++;

            if (pinDigitado != pinCorreto && tentativas < maxTentativas) {
                System.out.printf(
                    "PIN incorreto! Restam %d tentativa(s).%n",
                    maxTentativas - tentativas
                );
            }

        } while (pinDigitado != pinCorreto && tentativas < maxTentativas);

        System.out.println("\n===== BANCO META - CAIXA ELETRONICO =====");

        if (pinDigitado == pinCorreto) {
            System.out.println("ACESSO LIBERADO! Bem-vindo(a).");
            System.out.printf("Tentativas utilizadas: %d%n", tentativas);
        } else {
            System.out.println("CARTAO BLOQUEADO! Procure sua agencia.");
        }

        teclado.close();
    }
}