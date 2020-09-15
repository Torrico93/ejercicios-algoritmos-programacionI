package com.repetitivos;

import java.util.Scanner;
//Leer un número N y calcular su factorial.
public class Ejercicio2 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        int resultadoFactorial = 1;
        int numeroFactorial;

        System.out.print("Calcular el factorial de: ");
         numeroFactorial = scanner.nextInt();

        while ( numeroFactorial!=0) {

            resultadoFactorial = resultadoFactorial * numeroFactorial;
            numeroFactorial--;
        }
        if (numeroFactorial == 1 || numeroFactorial ==0) {
            System.out.println(resultadoFactorial);
        }
        else {
            System.out.println(resultadoFactorial);
        }
    }
}
