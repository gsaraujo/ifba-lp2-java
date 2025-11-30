package pratica;

import pratica.classes.*;

public class App {
    public static void main(String[] args) {
        Livro livro = new Livro("1", "Harry Potter", "JK");
        Livro livro2 = new Livro("2", "Harry Potter 2", "JK");

        Usuario usuario1 = new Usuario("Gustavo","1234");
        Usuario usuario2 = new Usuario("Barto","5678");

        Emprestimo emprestimo = new Emprestimo(1);

        emprestimo.realizarEmprestimo(livro,usuario1);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(livro);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarPessoa(usuario1);

        biblioteca.adicionarEmprestimo(emprestimo);

        biblioteca.relatorioBiblioteca();


    }
}
