/* QUESTÃO 07 DA LISTA DE ATIVIDADES PROFESSOR RONALDO. */

import java.util.Scanner;

public class Veiculo{
    
    String modelo = "Gallardo LP560-4", marca = "Lamborghini";
    
     void processarModelo(){
        
        System.out.println("O modelo em minusculo: " + modelo.toLowerCase());
        System.out.println("Os 4 primeiro caracteres: " + modelo.substring(0,4));
        System.out.println("Substituindo espaço por -:" + modelo.replace(' ', '-'));
        
    }
    
    public static void main (String[]args){
        
        Veiculo cadastro = new Veiculo();
        cadastro.processarModelo();
    }
}