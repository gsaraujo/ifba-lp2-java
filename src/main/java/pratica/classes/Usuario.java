package pratica.classes;

public class Usuario extends Pessoa{


    public Usuario(String nome, String matricula) {
        super(nome, matricula);
        this.quantidadeMaximaDeLivros = Config.QUANTIDADE_LIVROS_USUARIO;
    }

    public boolean pegarLivroEmprestado() {
        if(this.quantidadeMaximaDeLivros > 0) {
            this.quantidadeMaximaDeLivros--;
            return true;
        }
        return false;
    }

    public boolean devolverLivroEmprestado() {
        if(this.quantidadeMaximaDeLivros == Config.QUANTIDADE_LIVROS_USUARIO) {
            return false;
        }
        this.quantidadeMaximaDeLivros++;
        return true;
    }
}
