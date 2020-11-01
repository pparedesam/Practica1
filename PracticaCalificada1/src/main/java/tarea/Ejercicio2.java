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
public class Ejercicio2 {

    public static void main(String[] args) {

        System.out.println("INGRESE MONTO EN SOLES: ");
        double montoSoles = valMontoSoles();

        System.out.println("SU VALOR EN DOLARES ES: " + montoSoles * 3.60);
        System.out.println("SU VALOR EN EUROS ES: " + montoSoles * 4.15);

    }

    public static double valMontoSoles() {

        Scanner scan = new Scanner(System.in);
        double monto = scan.nextDouble();

        while (monto < 0) {

            System.out.println("INGRESE UN MONTO CORRECTO!");
            System.out.println("INGRESE MONTO: ");
            monto = scan.nextDouble();
        }
        return monto;
    }

}
