public class Exercicio05 {

    String nome = "João Pedro Silva";
    String cargo = "Assistente Administrativo";
    int horasMes = 176;
    double valorHora = 32.50;
    double valeRefeicao = 450.00;

    double salarioBruto = horasMes * valorHora;
    double inss = salarioBruto * 0.08;
    double irrf = salarioBruto * 0.12;
    double salarioLiquido = salarioBruto - inss - irrf + valeRefeicao;

    void holerite(){

        System.out.println("========== HOLERITE SIMPLIFICADO ===========");
        System.out.printf("Funcionário : %s%n", nome);
        System.out.printf("Cargo       : %s%n", cargo);
        System.out.printf("Horas/mês   : %dh  @ R$ %.2f/h%n", horasMes, valorHora);
        System.out.println("---------------------------------");
        System.out.printf("Salário Bruto   : R$ %7.2f%n", salarioBruto);
        System.out.printf("(-) INSS 8%%     : R$ %7.2f%n", inss);
        System.out.printf("(-) IRRF 12%%    : R$ %7.2f%n", irrf);
        System.out.printf("(+) Refeição    : R$ %7.2f%n", valeRefeicao);
        System.out.println("---------------------------------");
        System.out.printf("SALÁRIO LÍQUIDO : R$ %7.2f%n", salarioLiquido);
        System.out.println("Data: 16/09/2026");

    }

    public static void main(String[] args) {
        
        Exercicio05 exibir = new Exercicio05();
        exibir.holerite();
        


    }
}
