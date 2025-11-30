package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Aula005 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Digite a idade do aluno: ");
        int idade = sc.nextInt();
        System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos");
        
        nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
        JOptionPane.showMessageDialog(null, "Olá, " + nome + "! Seja bem-vindo.");

    }

}
