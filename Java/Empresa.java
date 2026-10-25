/* QUESTÃO 14 DA LISTA DE ATIVIDADES PROFESSOR RONALDO. */

import java.util.Scanner;

public class Empresa{
    
    String nome = "Centrasa", ramo = "metalurgia e siderugia";
    
     void analisarEmpresa(){
        
        System.out.println("O nome em maiúsculas: " + nome.toUpperCase());
        System.out.println("A quantidade de caracteres: " + nome.length());
        System.out.println("O último caractere do nome: " + nome.charAt(7));
        
    }
    
    public static void main (String[]args){
        
        Empresa cadastro = new Empresa();
        cadastro.analisarEmpresa();
        
    }
}