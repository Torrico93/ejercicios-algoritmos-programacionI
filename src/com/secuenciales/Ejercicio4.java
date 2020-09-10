package com.secuenciales;

import java.util.Scanner;

//Dado el radio R de una esfera, calcular e imprimir su superficie y su volumen.
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio de la esfera: ");
        float radioEsfera = scanner.nextFloat();

        System.out.println("Su superficie es :" + 4 * Math.PI * (Math.pow(radioEsfera,2)) + " metros cuadrados" );
        System.out.println("Su volumen es :" + ((4* Math.PI * (Math.pow(radioEsfera,3)))/3) + " metros cubicos");


    }
}