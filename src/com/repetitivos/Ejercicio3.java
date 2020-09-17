package com.repetitivos;

import java.util.Scanner;

//Leer una serie de números reales, terminando la serie con un cero. Imprimir los datos a medida que se los ingresa
//junto con la suma parcial de los mismos.
public class Ejercicio3 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        int numeroIngresado;
        int sumaParcial = 0;

        System.out.print("Ingrese un numero: ");
        numeroIngresado = scanner.nextInt();

        while (numeroIngresado != 0) {
            System.out.print("Usted ingreso el: " + numeroIngresado);
            sumaParcial = sumaParcial + numeroIngresado;

            System.out.println("\ny su suma parcial por el momento es: " + sumaParcial);

            System.out.println("------------------------------------*------------------------------------");

            System.out.print("Ingrese 0 para salir de la suma parcial o ingrese otro numero para seguir: ");
            numeroIngresado = scanner.nextInt();
        }
        System.out.println("------------------------------------*------------------------------------");
        System.out.println("Salio de la suma parcial, su suma quedo en: " + sumaParcial + "\nSaludos");
    }
}
