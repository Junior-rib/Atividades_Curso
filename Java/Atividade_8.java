import java.util.Scanner;
public class Atividade_8 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String b = a.nextLine();
        String c = b.toLowerCase();
        System.out.println("Frase original: " + b);
        System.out.println("Frase em minúsculas: " + c);
    }
}