/* QUESTÃO 11 DA LISTA DE ATIVIDADES PROFESSOR RONALDO. */

import java.util.Scanner;

public class Time{
    
    String nome = "CRUZEIRO", cidade = "Belo Horizonte";
    
      void analisarTime(){
        
        System.out.println("O nome em minúsculas: " + nome.toLowerCase());
        System.out.println("Os 3 primeiros caracteres: " + nome.substring(0,3));
        System.out.println("Substituindo a letra “o” por “0”: " + nome.replace('o','0'));
        
    }
    
    public static void main (String[]args){
        
        Time cadastro = new Time();
        cadastro.analisarTime();
        
    }
}
