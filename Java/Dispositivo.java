/* QUESTÃO DESAFIO DA LISTA DE ATIVIDADES PROFESSOR RONALDO. */

import java.util.Scanner;

    public class Dispositivo{
    
    String nome = "Notebook Positivo", fabricante= "Positivo";
    
     void analisarDispositivo(){
        
        System.out.println("Numero de caracteres: " + nome.length());
        System.out.println("Tudo maiusculo: " + nome.toUpperCase());
        System.out.println("Tudo minusculo: " + nome.toLowerCase());
        System.out.println("Inicio dos caracteres: " + nome.substring(0,4) + " ou final dos caracteres: " + nome.substring(13,17));
        System.out.println("Troca de caracteres o por *: " + nome.replace('o', '*'));
        System.out.println("O caratere a ser mostrado é o 6: " + nome.charAt(6));
        
    }
    
    public static void main (String[]args){
        
        Dispositivo cadastro = new Dispositivo();
        cadastro.analisarDispositivo();
        
    }
}