/* QUESTÃO 10 DA LISTA DE ATIVIDADES PROFESSOR RONALDO. */

import java.util.Scanner;

public class Musica{
    
    String titulo = "Toxicity", cantor = "System of a Down";
    
    void analisarMusica(){
        
        System.out.println("O  título em maiúsculas: " + titulo.toUpperCase());
        System.out.println("A quantidade de caracteres: " + titulo.length());
        System.out.println("O  segundo caractere: " + titulo.charAt(1));
        
    }
    
    public static void main (String[]args){
        
        Musica cadastro = new Musica();
        cadastro.analisarMusica();
        
    }
}
