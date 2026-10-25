/*QUESTÃO 02 DA LISTA DE ATIVIDADES PROFESSOR RONALDO.*/

import java.util.Scanner;

public class Livro{
    String titulo = "Corte De Espinhos E Rosas", autor = "Sarah J.Maas" ;
    void processarTitulo(){
        System.out.println("o titulo em minusculo é: " + titulo.toLowerCase());
        System.out.println("Substituindo o espaço por hífens: " + titulo.replace(' ', '-'));
        System.out.println("A primeira letra do Titulo: " + titulo.charAt(0));
    }
    public static void main (String[]args){
        Livro  Titulo = new Livro();
        Titulo.processarTitulo();
    }
}