package org.example;

/* Um programa para calcular a área e o perímetro de um retângulo informando a base e a altura do mesmo.
* Lembrando que no primeiro momento nós iremos escolher os números que ficaram fixos no código.
*  */

public class A001Q06 {
    public static void main(String[] args) {
        int base = 13;
        int altura = 7;

        int area = base * altura;
        int perimetro = 2 * (base + altura);
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
