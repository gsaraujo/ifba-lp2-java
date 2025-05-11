package org.example;

/* Um programa que identifica a prioridade de 1 a 100 e:
* 1-10 - imprime “Baixa”
* 11-50 - imprime “Média”
* 51-90 - imprime “Alta”
* 91-100 - imprime “Crítica”
* Qualquer outro valor deve imprimir “Inválido”
* */

public class A001Q09 {
    public static void main(String[] args) {
        int prioridade = 4;

        if(prioridade >= 1 && prioridade <= 10){
            System.out.println("Prioridade: "+prioridade + " é baixa");
        } else if(prioridade > 10 && prioridade <= 50){
            System.out.println("Prioridade: "+prioridade + " é média");
        } else if(prioridade > 50 && prioridade <= 90){
            System.out.println("Prioridade: "+prioridade + " é alta");
        } else if (prioridade > 90 && prioridade <= 100) {
            System.out.println("Prioridade: "+prioridade + " é crítica");
        } else {
            System.out.println("Prioridade inválida");
        }
    }

}
