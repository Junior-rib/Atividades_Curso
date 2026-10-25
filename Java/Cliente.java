/*QUESTÃO 04 DA LISTA DE ATIVIDADES PROFESSOR RONALDO.*/

import java.util.Scanner;

public class Cliente{
    
    String nome = "Aleatorio", email ="ALEATORIO.ALE@GMAIL.COM";
    
    void  analisarEmail(){
        
        System.out.println("O email em minusculo fica: " + email.toLowerCase());
        System.out.println("O email tem: " + email.length() + " Caracters.\n");
        System.out.println("As cinco primeiras letras do  email: " + email.substring(0 , 5));
        
    }
    
    public static void main (String[]args){
        
        Cliente Cadastro = new Cliente();
        Cadastro.analisarEmail();
        
    }
}