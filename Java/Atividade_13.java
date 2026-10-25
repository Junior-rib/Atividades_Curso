import java.util.Scanner;
public class Atividade_13 {
    public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    System.out.println("Qual é o seu nome: (Max 12 letras)");
    String b = a.nextLine();
    if (b.length() <= 12) {
        System.out.println(b + " cadastro confirmado.");
    }
    else {
        System.out.println("Cadastro não efetuado.");
    }
    }}