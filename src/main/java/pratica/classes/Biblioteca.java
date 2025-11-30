package pratica.classes;

public class Biblioteca {
    private Livro[] livros;
    private Pessoa[] pessoas;
    private Emprestimo[] emprestimos;

    public Biblioteca() {
        this.livros = new Livro[Config.QUANTIDADE_MAXIMA_LIVROS_BIBLIOTECA];
        this.pessoas = new Pessoa[Config.QUANTIDADE_MAXIMA_PESSOAS_BIBLIOTECA];
        this.emprestimos = new Emprestimo[Config.QUANTIDADE_MAXIMA_EMPRESTIMOS_SIMULTANEOS_BIBLIOTECA];
    }

    public boolean adicionarLivro(Livro livro) {
        for(int i = 0; i < livros.length; i++) {
            if(livros[i] == null) {
                livros[i] = livro;
                return true;
            }
        }
        return false;
    }

    public boolean adicionarPessoa(Pessoa pessoa) {
        for(int i = 0; i < pessoas.length; i++) {
            if(pessoas[i] == null) {
                pessoas[i] = pessoa;
                return true;
            }
        }
        return false;
    }

    public boolean adicionarEmprestimo(Emprestimo emprestimo) {
        for(int i = 0; i < emprestimos.length; i++) {
            if(emprestimos[i] == null) {
                emprestimos[i] = emprestimo;
                return true;
            }
        }
        return false;
    }

    public void relatorioBiblioteca() {
        System.out.println("Livros: \n");
        for(int i = 0; i < livros.length; i++) {
            if(livros[i] != null) {
                System.out.println(livros[i].toString());
            }
        }
        System.out.println("Pessoas: \n");
        for(int i = 0; i < pessoas.length; i++) {
            if(pessoas[i] != null) {
                System.out.println(pessoas[i].toString());
            }
        }
        System.out.println("Emprestimos: \n");
        for(int i = 0; i < emprestimos.length; i++) {
            if(emprestimos[i] != null) {
                System.out.println(emprestimos[i].toString());
            }
        }
    }
}