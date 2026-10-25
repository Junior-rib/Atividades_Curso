/*QUESTÃO 01 DA LISTA DE ATIVIDADES PROFESSOR RONALDO.*/

    import java.util.Scanner;
    
public class Aluno{
    String nome, curso;
    void analisarNome(){
        System.out.println("O nome do aluno em maiusculo: " + nome.toUpperCase());
         System.out.println("A quantidade de caracteres no nome é: " + nome.length());
             System.out.println("As tres primeiras letras do nome são: " + nome.substring(0,3));
    }
    
    public static void main (String[]args){
        Aluno atributoNome = new Aluno();
        System.out.println("Bem vindo ao sistema de cadastro de Alunos.\n");
        
        System.out.println("Cadastramentro do aluno, informe o nome do aluno.\n");
        Scanner a = new Scanner(System.in);
        atributoNome.nome = a.nextLine();
        System.out.println("Informe o curso Desejado pelo aluno.\n");
        Scanner b = new Scanner(System.in);
        atributoNome.curso = b.nextLine();
        atributoNome.analisarNome();
    }
}