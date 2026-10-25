/* QUESTÃO 13 DA LISTA DE ATIVIDADES PROFESSOR RONALDO. */

import java.util.Scanner;

public class Curso{
    
    String nome = "ANALISE E DESENVOLVIMENTO DE SISTEMAS",  cargaHoraria = "entre 2.200 e 2.800 horas";
    
 void analisarCurso(){
        
        System.out.println("O nome em minúsculas: " + nome.toLowerCase());
        System.out.println("Os 5 primeiros caracteres: " + nome.substring(0,5));
        System.out.println("Substituindo os espaços por “-”: " + nome.replace(' ', '-'));
        
    }
    
    public static void main (String[]args){
        
        Curso cadastro = new Curso();
        cadastro.analisarCurso();
        
    }
}