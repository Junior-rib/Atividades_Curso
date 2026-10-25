public class Exercicio06 {

     byte idade = 17;
    short anoConclusaoEM = 2025;
    int numeroInscricao = 48291;
    long cpf = 12345678901L;
    float notaPrimeiraFase = 74.25F;
    double mediaFinalPonderada = 82.47;
    char turno = 'M';
    boolean necessidadeEspecial = false;
    String nomeCandidato = "Luiza Fernandes";

    void inscrever(){
        System.out.println("==== FICHA DE INSCRIÇÃO VESTIBULAR ====");
        System.out.printf("%-25s %s%n", "Nome:", nomeCandidato);
        System.out.printf("%-25s %d%n", "Idade:", idade);
        System.out.printf("%-25s %d%n", "Ano de conclusão EM:", anoConclusaoEM);
        System.out.printf("%-25s %d%n", "Número de inscrição:", numeroInscricao);
        System.out.printf("%-25s %d%n", "CPF:", cpf);
        System.out.printf("%-25s %.2f%n", "Nota primeira fase:", notaPrimeiraFase);
        System.out.printf("%-25s %.2f%n", "Média final ponderada:", mediaFinalPonderada);
        System.out.printf("%-25s %c%n", "Turno:", turno);
        System.out.printf("%-25s %b%n", "Necessidade especial:", necessidadeEspecial);
    }

    public static void main(String[] args) {

       Exercicio06 exibir= new Exercicio06();
       exibir.inscrever();

    }
}