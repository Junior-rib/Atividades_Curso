/* QUESTÃO 08 DA LISTA DE ATIVIDADES PROFESSOR RONALDO. */

import java.util.Scanner;

public class Professor{
    String nome = "Ronaldo", disciplina = "Estrutura de dados e Algoritimo";
     void analisarProfessor(){
        
        System.out.println("O nome em maisculo: " + nome.toUpperCase());
        System.out.println("O primeiro caracter: " + nome.charAt(0));
        System.out.println("O nome possui: " + nome.length()+" caracteres.");
        
    }
    
    public static void main (String[]args){
        
        Professor cadastro = new Professor();
        cadastro.analisarProfessor();
    }
}
