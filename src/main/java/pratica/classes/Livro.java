package pratica.classes;

public class Livro {

    private String codigo;
    private String titulo;
    private String autor;
    private int quantidadeCopiasDisponiveis;

    public Livro(String codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadeCopiasDisponiveis = Config.QUANTIDADE_COPIAS_DISPONIVEIS;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean realizarEmprestimo() {
        if (this.quantidadeCopiasDisponiveis > 0) {
            this.quantidadeCopiasDisponiveis--;
            return true;
        }
        return false;
    }

    public boolean realizarDevolucao() {
        if (this.quantidadeCopiasDisponiveis == Config.QUANTIDADE_COPIAS_DISPONIVEIS) {
            return false;
        }
        this.quantidadeCopiasDisponiveis++;
        return true;
    }





}
/*
 *
 * [ ] Criar método `realizarEmprestimo()` que:

 * [ ] Verifica se `quantidadeDeLivros > 0`
 * [ ] Subtrai 1 de `quantidadeDeLivros`
 * [ ] Criar método `realizarDevolucao()` que:

 * [ ] Adiciona 1 a `quantidadeDeLivros`
 */