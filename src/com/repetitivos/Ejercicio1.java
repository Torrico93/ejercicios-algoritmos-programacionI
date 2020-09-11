package com.repetitivos;

import java.util.Scanner;

//Imprimir por pantalla una lista de 20 números consecutivos, los cuales comienzan con un número ingresado por teclado.
public class Ejercicio1 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numeroIngresado = scanner.nextInt();

        for(int i = 0 ; i <= 20 ; i++){
            System.out.print((numeroIngresado++) + " ");
        }
    }
}
