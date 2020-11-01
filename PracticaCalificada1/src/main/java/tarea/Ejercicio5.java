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
public class Ejercicio5 {

    public static void main(String[] args) {

        System.out.println("INGRESE EL NUMERO DE HOMBRES: ");
        int numeroHombres = valNumero();

        System.out.println("INGRESE EL NUMERO DE MUJERES: ");
        int numeroMujeres = valNumero();

        int total = numeroHombres + numeroMujeres;

        System.out.println("EL PORCENTAJE DE HOMBRES ES: " + valPorcentaje(numeroHombres, total));
        System.out.println("EL PORCENTAJE DE MUJERES ES: " + valPorcentaje(numeroMujeres, total));
    }

    public static int valNumero() {

        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();

        while (numero < 0) {

            System.out.println("INGRESE UN NUMERO CORRECTO!");
            System.out.println("INGRESE UN NUMERO: ");
            numero = scan.nextInt();
        }
        return numero;
    }

    public static double valPorcentaje(int numero, int total) {
        return numero * 100 / total;
    }

}
