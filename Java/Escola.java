/* QUESTÃO 09 DA LISTA DE ATIVIDADES PROFESSOR RONALDO. */

import java.util.Scanner;

public class Escola{
    
    String nome = "Escola Estadual Margarida Brochado", cidade = "Belo Horizonte";
    
     void analisarEscola(){
        
        System.out.println("O nome da escola minusculo: " + nome.toLowerCase());
        System.out.println("Substituindo os espaços por _: " + nome.raplace(' ', '_'));
        System.out.println("Os 6 primeiros caracteres: " + nome.substring(0,6));
        
    }
    
    public static void main (String[]args){
        
       Escola cadastro = new Escola();
       cadastro.analisarEscola();
        
    }
}
