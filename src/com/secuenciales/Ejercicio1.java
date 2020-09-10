package com.secuenciales;

import java.util.Scanner;

//Leer un número por teclado e imprimirlo en pantalla con el siguiente cartel: “Número ingresado” = número.
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroIngresado;

        System.out.print("Ingrese un numero: ");
        numeroIngresado = scanner.nextByte();

        System.out.println("Numero ingresado: " + numeroIngresado);
    }
}
