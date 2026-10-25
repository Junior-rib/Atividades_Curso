import java.util.Scanner;
public class Atividade_3 {
    public static void main (String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = a.nextLine();
        int b = name.length();
        System.out.println("O nome " + name + " possui " + b + " caracteres.");
    }
    
}