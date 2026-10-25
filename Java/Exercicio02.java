import java.util.Scanner;
public class Exercicio02 {
    String disciplina = "Programação Orientada a Objetos";
        int ano = 2026;
        double cargaHoraria = 160.00;
        
    void exibir(){
        System.out.print(disciplina);
        System.out.print("Disciplina" + disciplina);
        System.out.println();
        System.out.println();
        System.out.println(cargaHoraria);
        System.out.println(ano);
        System.out.println();
        System.out.println();
    }
    public static void main(String[] args) {
        

        Exercicio02 exibe = new Exercicio02();
        exibe.exibir();
    }
}
