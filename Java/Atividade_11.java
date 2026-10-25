import java.util.Scanner;
public class Atividade_11 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Digite o ano atual: ");
        int b = a.nextInt();
        System.out.println("Digite a sua idade: ");
        int c = a.nextInt();
        int d = b - c;
        System.out.println("Você nasceu aproximadamente no ano de: " + d);
    }
}