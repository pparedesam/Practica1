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
public class Ejercicio4 {

    public static void main(String[] args) {

        System.out.println("INGRESE UN NUMERO: ");
        int numero = valNumero();

        System.out.println("LA SUMA ES: " + valSuma(numero / 1000, numero % 1000 / 100, numero % 100 / 10, numero % 10));
        System.out.println("EL PRODUCTO ES: " + valProducto(numero / 1000, numero % 1000 / 100, numero % 100 / 10, numero % 10));

    }

    public static int valNumero() {

        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();

        while (numero < 1000 || numero > 9999) {

            System.out.println("INGRESE UN NUMERO CORRECTO!");
            System.out.println("INGRESE UN NUMERO: ");
            numero = scan.nextInt();
        }
        return numero;
    }

    public static int valSuma(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static int valProducto(int a, int b, int c, int d) {
        return a * b * c * d;
    }

}
