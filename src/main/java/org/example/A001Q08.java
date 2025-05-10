package org.example;

/* Um programa que declare 3 inteiros (dia, mês e ano), verifique se é uma data válida ou não e imprima Data válida ou inválida.
* Lembrando que no primeiro momento nós iremos escolher os números que ficaram fixos no código.
* */

public class A001Q08 {
    public static void main(String[] args) {
        int dia = 29;
        int mes = 2;
        int ano = 2001;
        Boolean bissexto = false;
        int totalDias = 0;

        if (ano < 1 || mes < 1 || mes > 12 || dia < 1) {
            System.out.println("Data inválida.");
            return;
        }

        if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            bissexto = true;
        }

        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            totalDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            totalDias = 30;
        } else if (mes == 2) {
            if(bissexto) {
                totalDias = 29;
            } else {
                totalDias = 28;
            }
        }

        if(dia <= totalDias) {
            System.out.println("Data válida");
        } else {
            System.out.println("Data inválida");
        }

    }
}
