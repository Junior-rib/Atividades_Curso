import java.util.Scanner;
public class Atividade_12 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        String b = a.nextLine();
        int c = b.length();
        System.out.println("O nome digitado possui " + c + " caracteres.");
    }
}