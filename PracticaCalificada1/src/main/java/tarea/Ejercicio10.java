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
public class Ejercicio10 {

    public static void main(String[] args) {

        System.out.println("INGRESE UN NUMERO: ");
        int numero = valNumero();
        System.out.println("EL DIA SELECCIONADO ES: " + obtDia(numero));

    }

    public static int valNumero() {

        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();

        while (numero < 1|| numero > 8) {

            System.out.println("ERROR! INGRESE UN NUMERO CORRECTO!");
            System.out.println("INGRESE UN NUMERO: ");
            numero = scan.nextInt();
        }
        return numero;
    }

    public static String obtDia(int numero) {

        switch (numero) {

            case 1:
                return "LUNES";
            case 2:
                return "MARTES";
            case 3:
                return "MIERCOLES";
            case 4:
                return "JUEVES";
            case 5:
                return "VIERNES";
            case 6:
                return "SABADO";
            case 7:
                return "DOMINGO";

            default:
                return "NO SE PUEDE DETERMINAR, ERROR DE NUMERO";
        }
    }
}
