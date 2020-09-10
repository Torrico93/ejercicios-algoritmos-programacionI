package com.secuenciales;

import java.util.Scanner;

//Leer dos números A y B e intercambiar el valor de sus variables.
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //variable de intercambio
        int variableIntercambio;

        System.out.print("Ingrese el valor de la variable numeroA: ");
        int numeroA = scanner.nextInt();
        System.out.print("Ingrese el valor de la variable numeroB: ");
        int numeroB = scanner.nextInt();

        System.out.print("Los numeros ingresados son => \n\t*Variable numeroA = " + numeroA + "\n\t*Variable numeroB =" + numeroB);

        //Intercambio del valor de las variables:
        variableIntercambio = numeroA;
        numeroA = numeroB;
        numeroB = variableIntercambio;

        System.out.println("\nEl valor de las variables intercambiadas ahora es: \n\t*Variable numeroA = " + numeroA + "\n\t*Variable numeroB = " + numeroB);



    }
}
