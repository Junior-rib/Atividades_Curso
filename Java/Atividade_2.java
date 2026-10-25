import java.util.Scanner;
public class Atividade_2 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Qual o raio do circulo: ");
        double num = x.nextDouble();
        double a = 2*3.14*num;
        double b = 3.14*(num * num);
        System.out.println("O perimetro da area do circulo é: " + b);
        System.out.println("A circunferência circulo é: " + a);
    }
}
