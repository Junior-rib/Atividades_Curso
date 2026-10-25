public class Exercicio08 {

    double valorCompra = 78.50;
    double valorPago = 100.00;

    double troco = valorPago - valorCompra;

    

    void caixa() {
        
    int trocoInteiro = (int) Math.round(troco);

    int nota200 = trocoInteiro / 200;
    trocoInteiro = trocoInteiro % 200;

    int nota100 = trocoInteiro / 100;
    trocoInteiro = trocoInteiro % 100;

    int nota50 = trocoInteiro / 50;
    trocoInteiro = trocoInteiro % 50;

    int nota20 = trocoInteiro / 20;
    trocoInteiro = trocoInteiro % 20;

    int nota10 = trocoInteiro / 10;
    trocoInteiro = trocoInteiro % 10;

    int nota5 = trocoInteiro / 5;
    trocoInteiro = trocoInteiro % 5;

    int nota2 = trocoInteiro / 2;
    trocoInteiro = trocoInteiro % 2;

    int totalNotas = nota200 + nota100 + nota50 + nota20
                   + nota10 + nota5 + nota2;

        System.out.println("===== CAIXA - TROCO EM NOTAS =====");

        System.out.printf("Compra   : R$ %.2f%n", valorCompra);
        System.out.printf("Pago     : R$ %.2f%n", valorPago);
        System.out.printf("Troco    : R$ %.2f%n", troco);

        System.out.println("-----------------------------");

        System.out.println("Qtde notas de R$ 200 = " + nota200);
        System.out.println("Qtde notas de R$ 100 = " + nota100);
        System.out.println("Qtde notas de R$  50 = " + nota50);
        System.out.println("Qtde notas de R$  20 = " + nota20);
        System.out.println("Qtde notas de R$  10 = " + nota10);
        System.out.println("Qtde notas de R$   5 = " + nota5);
        System.out.println("Qtde notas de R$   2 = " + nota2);

        System.out.println("-----------------------------");

        System.out.println("Total de notas entregues: " + totalNotas);

        if (trocoInteiro > 0) {
            System.out.println(
                    "Valor restante sem nota disponível: R$ "
                            + trocoInteiro);
        }
    }

    public static void main(String[] args) {

        Exercicio08 exibir = new Exercicio08();

        exibir.caixa();
    }
}