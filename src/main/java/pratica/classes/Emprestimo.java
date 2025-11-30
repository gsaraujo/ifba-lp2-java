package pratica.classes;

public class Emprestimo {
    private int id;
    private Livro livro;
    private Pessoa pessoa;


    public Emprestimo(int id) {
        this.id = id;//Atribuição manual no momento da criação do objeto.
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
            } else {
                usuario.devolverLivroEmprestado();
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
            } else {
                funcionario.devolverLivroEmprestado();
            }
        }
        return false;
    }

    public void trocarTipo() {
        if (this.pessoa instanceof Usuario) {
            this.pessoa = new Funcionario();
        }

        this.pessoa = new Usuario();
    }

    @Override
    public String toString() {
        return "Emprestimo{" + "id=" + id + "\nlivro=" + this.livro.toString() + "\npessoa= " + this.pessoa.toString() + "}\n";
    }
}
