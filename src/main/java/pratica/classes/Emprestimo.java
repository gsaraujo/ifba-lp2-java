package pratica.classes;

public class Emprestimo {
    private int id;
    private Livro livro;
    private Pessoa gustavo = new Usuario();


    public Emprestimo(int id) {
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean realizarEmprestimo(Livro livro, Usuario usuario) {
        if(usuario.pegarLivroEmprestado()) {
            if(livro.realizarEmprestimo()) {
                this.livro = livro;
                this.pessoa = usuario;
                return true;
            }
        }
        return false;
    }
    public boolean realizarEmprestimo(Livro livro, Funcionario funcionario) {
        if(funcionario.pegarLivroEmprestado()) {
            if(livro.realizarEmprestimo()) {
                this.livro = livro;
                this.pessoa = funcionario;
                return true;
            }
        }
        return false;
    }

    public void trocarTipo() {
        if (this.gustavo instanceof Usuario) {
            this.gustavo = new Funcionario();
        }

        this.gustavo = new Usuario();
    }
}
