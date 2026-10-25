import java.util.Scanner;
public class Atividade_9 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Digite a temperatura em °C: ");
        double b = a.nextDouble();
        double c = (b * 1.8) + 32;
        System.out.println(b+"°C equivalem a "+c+"°F");
    }
}