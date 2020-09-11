package com.selectivas;

import java.util.Scanner;

//Leer dos números reales e imprimir el mayor de ellos.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        float numeroA = scanner.nextFloat();

        System.out.print("Ingrese otro numero: ");
        float numeroB = scanner.nextFloat();

        if(numeroA > numeroB){
            System.out.println("\nEl numero mayor es: " + numeroA);
        }
        else if(numeroA < numeroB){
            System.out.println("\nEl numero mayor es: " + numeroB);
        }
        else {
            System.out.println("\nIngresaste dos numeros iguales !");
        }
    }
}
