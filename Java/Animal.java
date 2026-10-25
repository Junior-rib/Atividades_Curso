/* QUESTÃO 12 DA LISTA DE ATIVIDADES PROFESSOR RONALDO. */

import java.util.Scanner;

public class Animal{
    
    String nome = "Lukete", especie = "cachorro";
    
     void analisarAnimal(){
        
        System.out.println("O nome em maiúsculas: " + nome.toUpperCase());
        System.out.println("O primeiro caractere: " + nome.charAt(0));
        System.out.println("A a quantidade de caracteres: " + nome.length());
        
    }
    
    public static void main (String[]args){
        
        Animal cadastro = new Animal();
        cadastro.analisarAnimal();
        
    }
}
