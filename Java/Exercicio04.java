public class Exercicio04 {
        String nomePaciente = "Ana Clara Rocha";
        int idade = 22;
        double peso = 72.5;
        double altura = 1.78;
        double imc = peso / ( altura * altura );
        int imcInteiro = (int) peso / (int) (altura * altura);


        void imcCalculo(){

            System.out.println(" ===============FICHA IMC===============");
            System.out.println();
            System.out.println();
            System.out.println("Nome: " + nomePaciente);
            System.out.println("Idade: " + idade);
            System.out.printf("peso: %.1f kg%n", peso);
            System.out.printf("Altura: %.2f m%n", altura);
            System.out.printf("IMC: %.1f%n", imc);
            System.out.println();
            System.out.println();
            
            if (imc < 18.5) {
            System.out.println("Classificação OMS: Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Classificação OMS: Peso normal");
        } else if (imc <= 29.9) {
            System.out.println("Classificação OMS: Sobrepeso");
        } else if (imc <= 34.9) {
            System.out.println("Classificação OMS: Obesidade grau I");
        } else if (imc <= 39.9) {
            System.out.println("Classificação OMS: Obesidade grau II");
        } else {
            System.out.println("Classificação OMS: Obesidade grau III (mórbida)");
        }

        System.out.println();
        System.out.println("IMC usando double: " + imc);
        System.out.println("IMC usando int (divisão inteira): " + imcInteiro);
        System.out.println("Diferença: o double mantém as casas decimais, enquanto o int descarta a parte decimal.");
    }


    public static void main(String[] args) {

        Exercicio04 exibir = new Exercicio04();
        exibir.imcCalculo();
    }
}
