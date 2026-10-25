import java.util.Scanner;
public class Atividade_10{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Digite a temperatura em °F: ");
        double b = a.nextDouble();
        double c = ((b - 32) / 9) * 5;
        System.out.println(b+"°F equivalem a "+c+"°C");
    }
}