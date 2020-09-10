package com.secuenciales;

import java.util.Scanner;

//Escribir un programa que lea el nombre de una persona y luego lo salude.
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombreIngresado = scanner.nextLine();

        System.out.println("Hola " + nombreIngresado + "!");
    }
}