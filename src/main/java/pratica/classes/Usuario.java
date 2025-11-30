package pratica.classes;

public class Usuario extends Pessoa{


    public Usuario(String nome, String matricula) {
        super(nome, matricula);
        this.quantidadeMaximaDeLivros = 2;
    }

    public boolean pegarLivroEmprestado() {

        if(this.quantidadeMaximaDeLivros > 0) {
            this.quantidadeMaximaDeLivros--;
            return true;
        }
        return false;
    }

    public boolean devolverLivroEmprestado() {
        this.quantidadeMaximaDeLivros++;
        return true;
    }
}
