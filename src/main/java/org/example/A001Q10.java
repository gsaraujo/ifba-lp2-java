package org.example;

public class A001Q10 {
    public static void main(String[] args) {
        double salario = 3268.98;
        double desconto = 0;
        double taxa = 0;

        if(salario > 1903.98 && salario <= 2826.65) {
            desconto = salario * 0.075;//7.5%
            taxa = 7.5;
        } else if(salario > 2826.65 && salario <= 3751.05) {
            desconto = salario * 0.15;//15%
            taxa = 15;
        } else if (salario > 3751.05 && salario <= 4664.68) {
            desconto = salario * 0.225;//22.5%
            taxa = 22.5;
        } else if (salario > 4664.68) {
            desconto = salario * 0.275;//27.5%
            taxa = 27.5;
        }
        System.out.println("----------------------");
        System.out.println("Seu salário foi de R$" + salario);
        System.out.println("Seu taxa do imposto de renda foi: " + taxa);
        System.out.println("Seu desconto foi de R$" + desconto);
        System.out.println("Total recebido no mês: R$" + (salario - desconto));
        System.out.println("----------------------");
    }
}
