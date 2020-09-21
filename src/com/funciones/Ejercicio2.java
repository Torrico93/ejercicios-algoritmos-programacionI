package com.funciones;

import java.util.Scanner;

//Hacer una función que indique si un número es primo o no.
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a evaluar: ");
        int numeroIngresado = scanner.nextInt();
        verificarNumero(numeroIngresado);
    }

    public static void verificarNumero(int numeroIngresado) {
        int contador = 0;
        for (int i = 1; i <= numeroIngresado; i++) {
            if (numeroIngresado % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println("es primo");
        } else {
            System.out.println("no es primo");
        }
    }
}

