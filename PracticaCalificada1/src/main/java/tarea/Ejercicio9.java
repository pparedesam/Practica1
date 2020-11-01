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
public class Ejercicio9 {

    public static void main(String[] args) {

        System.out.println("INGRESE UN NUMERO: ");
        int numero = valNumero();
        System.out.println("EL NUMERO INGRESADO " + detCapicua(numero) + " ES CAPICUA");

    }

    public static int valNumero() {

        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();

        while (numero < 100 || numero > 999) {

            System.out.println("INGRESE UN NUMERO CORRECTO!");
            System.out.println("INGRESE UN NUMERO: ");
            numero = scan.nextInt();
        }
        return numero;
    }

    public static String detCapicua(int numero) {

        int pDigito = numero / 100;
        int sDigito = numero % 10;

        if (pDigito == sDigito) {
            return "SI";
        } else {
            return "NO";
        }
    }

}
