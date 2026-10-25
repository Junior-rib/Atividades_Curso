/*QUESTÃO 05 DA LISTA DE ATIVIDADES PROFESSOR RONALDO.*/

import java.util.Scanner;

public class Filme{
    
    String titulo = "Se beber não case", genero = "Comedia";
    
    void  analisarTitulo(){
        
        System.out.println("O titulo em letras maisculas: " + titulo.toUpperCase());
        System.out.println("Os quatros primeiros carateres: " + titulo.substring(0 , 4));
        System.out.println("Substituindo o espaço por _: " + titulo.replace(' ', '_'));
        System.out.println("A quantidade total de caracteres: " + titulo.length());
        
    }
    
    public static void main (String[]args){
        
    Filme cadastro = new Filme();
    cadastro.analisarTitulo();
    }
}