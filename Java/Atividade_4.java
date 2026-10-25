import java.util.Scanner;
public class Atividade_4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Digite o valor do raio da esfera: ");
        double b = a.nextDouble();
        double c = (4.0 / 3.0) * 3.14 * (b*b*b);
        System.out.println("O volume da esfera com raio "+ b +" é:" + c);
    }
}