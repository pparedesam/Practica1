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
public class Ejercicio8 {

    public static void main(String[] args) {

        System.out.println("INGRESE UN NUMERO: ");
        valNumero();

    }

    public static void valNumero() {

        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int numeroOrig = numero;
        int cantidad = 0;

        while (numero != 0) {
            numero = numero / 10;
            cantidad++;

        }
        if (cantidad != 3) {
            System.out.println("EL NUMERO NO ES DE 3 CIFRAS!");
        } else {
            if (numeroOrig >= 0) {
                System.out.println("EL NUMERO ES POSITIVO");
            } else if (numeroOrig < 0) {
                System.out.println("EL NUMERO ES NEGATIVO");
            }

        }
    }
}
