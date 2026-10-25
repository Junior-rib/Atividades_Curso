public class Exercicio07 {

    int visualizacoes = 0;


    int curtidas = 5;
        

    int comentarios = 3;
        

    int compartilhamentos = 1;
        


    void redeSocial() {

        comentarios += 2;
        compartilhamentos += 2;
        curtidas++;


        System.out.println("==== CONTADOR DE VISUALIZAÇÕES ====");
        System.out.println();
        System.out.println();
        System.out.println("Passo 1 → visualizações: " + visualizacoes);
        System.out.println();
        System.out.println();
        visualizacoes++;
        visualizacoes++;
        visualizacoes++;
        System.out.println("Passo 2 → visualizações: " + visualizacoes);
        System.out.println();
        System.out.println();
        visualizacoes += 12;
        System.out.println("Passo 3 → visualizações: " + visualizacoes);
        System.out.println();
        System.out.println();
        visualizacoes--;
        System.out.println("Passo 4 → visualizações: " + visualizacoes);
        System.out.println();System.out.println();
        visualizacoes *= 2;
        System.out.println("Passo 5 → visualizações: " + visualizacoes);
        System.out.println();
        System.out.println();
        System.out.println("\n==== TABELA FINAL DE ENGAJAMENTO ====");
        System.out.printf("%-20s %10s%n", "Engajamento", "Quantidade");
        System.out.printf("%-20s %10d%n", "Curtidas", curtidas);
        System.out.printf("%-20s %10d%n", "Comentários", comentarios);
        System.out.printf("%-20s %10d%n", "Compartilhamentos", compartilhamentos);
    }
    public static void main(String[] args) {

        Exercicio07 exibir = new Exercicio07();
        exibir.redeSocial();
        
    }
}
