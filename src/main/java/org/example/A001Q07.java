package org.example;

/* Um programa que exiba a ficha de uma pessoa e verifique na variável booleana professor se a pessoa é professora e imprima a ficha com a indicação que é professor e caso não seja imprima de outra forma.
* Lembrando que no primeiro momento nós iremos escolher os números que ficaram fixos no código.
*  */

public class A001Q07 {
    public static void main(String[] args) {
        String nome = "Pessoa Exemplar";
        int idade = 36;
        Boolean professor = true;
        String instituicao = "IFBA";

        if(professor) {
            System.out.println("___________________________");
            System.out.println("Professor");
            System.out.println("___________________________");
            System.out.println("Ficha do professor: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Instituicao: " + instituicao);
            System.out.println("___________________________");
        } else {
            System.out.println("___________________________");
            System.out.println("Servidor");
            System.out.println("___________________________");
            System.out.println("Ficha do servidor: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Instituicao: " + instituicao);
            System.out.println("___________________________");
        }

    }
}
