/* QUESTÃO 06 DA LISTA DE ATIVIDADES PROFESSOR RONALDO. */

import java.util.Scanner;

public class Produto{
    String nome = "Farinha de mandioca", fabricante = "zumbi";
    
    void analisarProduto(){
        
        System.out.println("O nome em letras maiúsculas: " + nome.toUpperCase());
        System.out.println("O ultimo carater: " + nome.charAt(18));
        System.out.println("A quantidade de carateres: " + nome.length());
        
    }
    
    public static void main (String[]args){
        
        Produto cadastro = new Produto();
        cadastro.analisarProduto();
        
    }
}