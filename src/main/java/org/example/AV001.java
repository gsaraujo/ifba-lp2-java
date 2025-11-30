package org.example;

public class AV001 {
    public static void main(String[] args) {
        //Q008
        String carName = "Volvo";
        int maxSpeed = 120;
        int nitroSpeed = 30;
        String name = "Perfect Student";
        //System.out.print("My name is: " + name);
        //System.out.print("My car is a: " + carName);
        //System.out.print("It can reach the speed of: ");
        //System.out.print(maxSpeed + nitroSpeed);

        //Questão 10:
        //Nome do arquivo Main.class


        int primeiro = 0;
        int segundo = 1;
        System.out.print("Série");
        for (int i = 1; i <=10; i++) {
            System.out.println(primeiro + "");
            int proximo = primeiro + segundo;
            /* Depois de imprimir o número, precisamos ajustar
             o primeiro e quem é o segundo */
            primeiro = segundo;
            segundo = proximo;
        }


    }

}
