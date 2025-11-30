package org.example;

public class Estudante {

    String nome;
    String cpf;
    String matricula;

    public Estudante(String nome, String cpf, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public String leNome() {
        return this.nome;
    }
    public String leCpf() {
        return this.cpf;
    }
    public String leMatricula() {
        return this.matricula;
    }

    public void guardaNome(String nome) {
        this.nome = nome;
    }
    public void guardaCpf(String cpf) {
        this.cpf = cpf;
    }
    public void guardaMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", CPF: " + this.cpf + ", Matricula: " + this.matricula;
    }
}
