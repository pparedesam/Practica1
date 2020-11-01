/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;


import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        System.out.println("INGRESE NOTA: ");
        double nota = valNumero();

        System.out.println("LA CATEGORIA DEL ALUMNO ES: " + detCategoria(nota));

    }

    public static double valNumero() {

        Scanner scan = new Scanner(System.in);
        double numero = scan.nextDouble();

        while (numero < 0 || numero > 20) {

            System.out.println("INGRESE UN NUMERO CORRECTO!");
            System.out.println("INGRESE UN NUMERO: ");
            numero = scan.nextDouble();
        }
        return numero;
    }

    public static String detCategoria(double nota) {
        String categoria = null;
        if (nota >= 17.0) {
            categoria = "A";
        } else {
            if (nota > 14.0 && nota <= 17.0) {
                categoria = "B";
            } else if (nota > 12 && nota <= 14) {
                categoria = "C";
            } else {
                categoria = "D";
            }
        }
        return categoria;

    }

}
