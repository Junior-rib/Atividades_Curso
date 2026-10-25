import java.util.Scanner;
public class Farmacia{
    byte a = 2;
    double peso, posologia;
    String remedio, c;
    void calcular(){
        posologia = peso * a;
        System.out.println("Quantidade de medicamento dado sua posologia é: " + posologia + " mg, sendo 2mg por quilo. \n");
    }
    void exibir(){
        System.out.println("o medicamento 'Revotril' de 'Tarja preta'. ".toUpperCase());
    }
    public static void main (String[]args){
Farmacia medicamento = new Farmacia();
    
        System.out.println("Bem vindo ao systema da sua farmacia, insira os dados solicitados.\n");System.out.println("Bem vindo ao systema da sua farmacia, insira os dados solicitados.\n");
        System.out.println("Informe o nome do paciente.\n");
        Scanner b = new Scanner (System.in);
        medicamento.c= b.nextLine();
         System.out.println("Informe o peso do paciente.\n");
        Scanner d = new Scanner (System.in);
        medicamento.peso= d.nextDouble();
        medicamento.calcular();
        medicamento.exibir();
    }
}