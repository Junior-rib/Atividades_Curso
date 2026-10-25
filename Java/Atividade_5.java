import java.util.Scanner;
public class Atividade_5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        String b = a.nextLine();
        if (b.length() > 2) {
            char c = b.charAt(2);
            System.out.println("A letra na posição 3 é: " + c);
        } else {
            System.out.println("O nome é muito curto para ter uma posição 3!");
        }
    }
}