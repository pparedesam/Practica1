/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import static tarea.Ejercicio12.sumNumero;
import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class Ejercicio13 {

    public static void main(String[] args) {

        double numero = obtPromedio(0, 1);
        System.out.println("EL PROMEDIO ES: " + numero);

    }

    private static double obtPromedio(int suma, int contador) {

        System.out.println("INGRESE LA EDAD DEL ALUMNO " + contador + ": ");
        Scanner scan = new Scanner(System.in);
        int nvaEdad = scan.nextInt();
        suma = suma + nvaEdad;
        while (contador >= 3) {

            return suma / 3.0;
        }
        contador++;
        return obtPromedio(suma, contador);
    }
}
