package com.secuenciales;

import java.util.Scanner;
/*
2) Leer dos números por teclado e imprimir
La suma de ambos
La resta (el primero menos el segundo)
La multiplicación
La división
*/
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int primerNumero = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int segundoNumero = scanner.nextInt();

        float divicion = primerNumero/segundoNumero;

        System.out.println("La suma de los numeros es: " + (primerNumero + segundoNumero));
        System.out.println("La resta de los numeros es: " + (primerNumero - segundoNumero));
        System.out.println("La multiplicacion de los numeros es: " + (primerNumero * segundoNumero));
        System.out.println("La divicion de los numeros es: " + divicion);
    }
}
