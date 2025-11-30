package pratica.classes;

public class Pessoa {
    protected String nome;
    protected String matricula;
    protected int quantidadeMaximaDeLivros;


    public Pessoa() {

    }

    public Pessoa(String nome, String matricula) {
        this.matricula = matricula;
        this.nome = nome;
        this.quantidadeMaximaDeLivros = 0;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Pessoa: " + this.nome + "\nMatricula: " + this.matricula;
    }


}
