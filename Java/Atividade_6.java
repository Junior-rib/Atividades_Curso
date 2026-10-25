import java.util.Scanner;
public class Atividade_6 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Digite a quantidade de anos: ");
        int b = a.nextInt();
        int c = b * 365;
        System.out.println(b + " ano(s) equivalem a aproximadamente " + c + " dias.");
    }
}