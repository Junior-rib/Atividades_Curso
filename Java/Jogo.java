/* QUESTÃO 15 DA LISTA DE ATIVIDADES PROFESSOR RONALDO. */

import java.util.Scanner;

public class Jogo{
    
    String nome = "SUPER MARIO WORLD", categoria = "ação e aventura";
    
     void analisarJogo(){
        
        System.out.println("O nome em minúsculas: " + nome.toLowerCase());
        System.out.println("Os 4 primeiros caracteres: " + nome.substring(0,4));
        System.out.println("Substituindo todas as letras “e” por “*“: " + nome.replace('E', '*'));
        
    }
    
    public static void main (String[]args){
        
        Jogo cadastro = new Jogo();
        cadastro.analisarJogo();
        
    }
}