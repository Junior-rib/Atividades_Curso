import java.util.Scanner;
public class Atividade_7 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas: ");
        int b = a.nextInt();
        System.out.println("Digite a quantidade de minutos: ");
        int c = a.nextInt();
        int d = (b * 60) + c;
        int e = d * 60;
        System.out.println("Total em minutos: " + d + " min");
        System.out.println("Total em segundos: " + e + " seg");
    }
}