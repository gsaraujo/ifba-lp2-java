package pratica.classes;

public class Funcionario extends Pessoa {
    private String setor;

    public Funcionario(String nome, String matricula) {
        super(nome, matricula);
        this.quantidadeMaximaDeLivros = 3;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
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
