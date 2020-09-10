package com.secuenciales;

import java.util.Scanner;

//Leer la base y la altura de un rectángulo, calcular el perı́metro y la superficie.
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indiqueme la base de su Rectangulo: ");
        float baseIngresada = scanner.nextFloat();
        System.out.print("Indiqueme la altura de su Rectangulo: ");
        float alturaIngresada = scanner.nextFloat();

        System.out.println("El perimetro del Rectangulo es: " + (2 * (alturaIngresada + baseIngresada)));
        System.out.println("La superficie del Rectangulo es: " + (baseIngresada * alturaIngresada));
    }
}
