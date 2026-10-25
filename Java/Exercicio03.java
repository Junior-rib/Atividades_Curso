public class Exercicio03 {
    double celsius = 28.5;
    double fahrenheit = (celsius * 9 / 5) + 32;
    double kelvin = celsius + 273.15;
    void temperatura(){

            System.out.printf("Celsius: %.2f ºC%n", celsius);
            System.out.printf("Fahrenheit: %.2f ºF%n", fahrenheit);
            System.out.printf("Kelvin %.2f ºK%n", kelvin);

            System.out.println();
            System.out.println();
            System.out.println("Observação:");
            System.out.println("0°C = água congela, 100°C = água ferve, 36,5°C = corpo humano.");
            System.out.println();
            System.out.println();
    }
    public static void main(String[] args) {
        
         System.out.println("==== CONVERSOR DE TEMPERATURA ====");
        Exercicio03 exibir = new Exercicio03();
        exibir.temperatura();

    }
}
