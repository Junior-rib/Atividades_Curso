/*QUESTÃO 03 DA LISTA DE ATIVIDADES PROFESSOR RONALDO.*/

import java.util.Scanner;

public class Funcionario{
    String nome = "Ronaldo" , setor = "Professor";
    
    void  verificarNome(){
        
        System.out.println("O nome possui " + nome.length() + " caracteres.\n");
        System.out.println("As cinco primeiras letras do nome é: " + nome.substring(0, 5));
        System.out.println("Substituindo o 'a' por *: " + nome.replace('a' , '*'));
        
    }
    public static void main (String[]args){
        Funcionario Cadastro = new Funcionario();
        Cadastro.verificarNome();
    }
}