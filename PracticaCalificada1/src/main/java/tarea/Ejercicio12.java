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
public class Ejercicio12 {

    public static void main(String[] args) {

        int numero = sumNumero(0);
        System.out.println("LA SUMA ES: " + numero);

    }

    public static int sumNumero(int numero) {
        System.out.println("INGRESE UN NUMERO: ");
        Scanner scan = new Scanner(System.in);
        int nvoNumero = scan.nextInt();

        while (nvoNumero > 100) {

            return numero;
        }
        return sumNumero(nvoNumero + numero);

    }


}
