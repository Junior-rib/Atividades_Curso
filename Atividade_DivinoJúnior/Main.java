public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        a1.nome = "Atis";
        a1.idade = 30;
        a1.curso = "Desenvolvimento de Sistemas";

        Aluno a2 = new Aluno();
        a2.nome = "Alysa";
        a2.idade = 19;
        a2.curso = "Informatica";

        Aluno a3 = new Aluno();
        a3.nome = "Alessandro";
        a3.idade = 29;
        a3.curso = "Engenharia";

       
	Carro c1 = new Carro();
	c1.marca = "BMW";
	c1.modelo = "X6";
	c1.ano = 2024;
	c1.preco = 650000.00;

	Carro c2 = new Carro();
	c2.marca = "Mercedes-Benz";
	c2.modelo = "AMG GT";
	c2.ano = 2023;
	c2.preco = 900000.00;

	Carro c3 = new Carro();
	c3.marca = "Porsche";
	c3.modelo = "911 Carrera";
	c3.ano = 2025;
	c3.preco = 1200000.00;

       
	Livro l1 = new Livro();
	l1.titulo = "Corte de Espinhos e Rosas";
	l1.autor = "Sarah J. Maas";
	l1.paginas = 434;

	Livro l2 = new Livro();
	l2.titulo = "Corte de Névoa e Fúria";
	l2.autor = "Sarah J. Maas";
	l2.paginas = 656;

	Livro l3 = new Livro();
	l3.titulo = "Trono de Vidro";
	l3.autor = "Sarah J. Maas";
	l3.paginas = 392;

        System.out.println("===== ALUNOS =====");

        System.out.println("Nome: " + a1.nome);
        System.out.println("Idade: " + a1.idade);
        System.out.println("Curso: " + a1.curso);

        System.out.println();

        System.out.println("Nome: " + a2.nome);
        System.out.println("Idade: " + a2.idade);
        System.out.println("Curso: " + a2.curso);

        System.out.println();

        System.out.println("Nome: " + a3.nome);
        System.out.println("Idade: " + a3.idade);
        System.out.println("Curso: " + a3.curso);

        System.out.println("\n===== CARROS =====");

        System.out.println("Marca: " + c1.marca);
        System.out.println("Modelo: " + c1.modelo);
        System.out.println("Ano: " + c1.ano);
        System.out.println("Preco: " + c1.preco);

        System.out.println();

        System.out.println("Marca: " + c2.marca);
        System.out.println("Modelo: " + c2.modelo);
        System.out.println("Ano: " + c2.ano);
        System.out.println("Preco: " + c2.preco);

        System.out.println();

        System.out.println("Marca: " + c3.marca);
        System.out.println("Modelo: " + c3.modelo);
        System.out.println("Ano: " + c3.ano);
        System.out.println("Preco: " + c3.preco);

        System.out.println("\n===== LIVROS =====");

        System.out.println("Titulo: " + l1.titulo);
        System.out.println("Autor: " + l1.autor);
        System.out.println("Paginas: " + l1.paginas);

        System.out.println();

        System.out.println("Titulo: " + l2.titulo);
        System.out.println("Autor: " + l2.autor);
        System.out.println("Paginas: " + l2.paginas);

        System.out.println();

        System.out.println("Titulo: " + l3.titulo);
        System.out.println("Autor: " + l3.autor);
        System.out.println("Paginas: " + l3.paginas);
    }
}