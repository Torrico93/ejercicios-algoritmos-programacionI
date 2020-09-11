package com.selectivas;

import java.util.Scanner;

//Leer un número real y decir si es mayor, menor o igual a cero.
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        float numeroReal = scanner.nextFloat();

        if(numeroReal > 0){
            System.out.println("\nEl numero " + numeroReal + " es mayor que 0");
        }
        else if (numeroReal < 0){
            System.out.println("\nEl numero " + numeroReal + " es menor que 0");
        }
        else {
            System.out.println("El numero ingresado es 0, asi que son inguales!");
        }
    }
}

