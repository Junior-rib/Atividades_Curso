public class Exercicio10 {

    double a = 23.0;
    double b = 7.0;
    double quadradoA = a * a;
    double cuboA = a * a * a;
    double mediaAritmetica = (a + b) / 2;


    void aritimetica(){

        System.out.println("==== CALCULADORA ARITMÉTICA ====");
        System.out.println();
        System.out.println();
        System.out.println("Adição: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.printf("Divisão: %.4f%n", (a / b));
        System.out.println("Resto: " + (a % b));
        System.out.println();
        System.out.println();
        System.out.println("\n==== PRÉ vs PÓS INCREMENTO/DECREMENTO ====");

        System.out.println("Valor de a: " + a);
        System.out.println("++a: " + (++a));
        System.out.println("a depois do ++a: " + a);
        System.out.println("Valor de b: " + b);
        System.out.println("b--: " + (b--));
        System.out.println("b depois do b--: " + b);
        System.out.println();
        System.out.println();
        System.out.println(
            "No pré-incremento (++a), o valor é incrementado antes de ser usado. " +
            "No pós-decremento (b--), o valor atual é usado primeiro e só depois é decrementado."
        );
        System.out.println();
        System.out.println();
        
        System.out.println("\n==== DESAFIO EXTRA ====");
        System.out.println("Quadrado de A: " + quadradoA);
        System.out.println("Cubo de A: " + cuboA);
        System.out.println("Média aritmética: " + mediaAritmetica);
    }

    public static void main(String[] args) {

       Exercicio10 exibir = new Exercicio10();
       exibir.aritimetica();
    }
}