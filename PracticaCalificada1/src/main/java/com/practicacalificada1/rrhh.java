/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practicacalificada1;

import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class rrhh {

    public static void main(String[] args) {
        final int pagoHora = 25;

        System.out.print("---------SISTEMA DE PAGO DE PLANILLA---------");
        System.out.print("\n");
        System.out.print("INGRESE NUMERO DE HORAS TRABAJADAS: ");
        double horas = valHora();
        System.out.print("\n");
        System.out.print("INGRESE EL MES: ");
        int mes = valMes();
        System.out.print("\n");
        String mesString = obtMes(mes);
        double sueldoBruto = obtSueldoBruto(pagoHora, horas);
        double descuento = obtDescuento(mes, sueldoBruto);
        double bono = obtBono(mes, sueldoBruto);
        double sueldoneto = obtSueldoNeto(sueldoBruto, descuento, bono);

        System.out.print("BOLETA DE PAGO PARA EL MES DE: " + mesString);
        System.out.print("\n");
        System.out.print("EL SUELDO BRUTO ES: " + sueldoBruto);
        System.out.print("\n");
        System.out.print("EL DESCUENTO: " + descuento);
        System.out.print("\n");
        System.out.print("EL BONO ES: " + bono);
        System.out.print("\n");
        System.out.print("EL SUELDO NETO POR PAGAR ES: " + sueldoneto);
    }

    public static double valHora() {

        Scanner scan = new Scanner(System.in);
        double ingreso = scan.nextDouble();

        while (ingreso > 48 || ingreso < 0) {

            System.out.println("INGRESAR UNA HORA CORRECTA!");
            System.out.print("\n");
            System.out.print("INGRESE NUMERO DE HORAS TRABAJADAS: ");
            ingreso = scan.nextDouble();
        }
        return ingreso;
    }

    public static int valMes() {

        Scanner scan = new Scanner(System.in);
        int ingreso = scan.nextInt();

        while (ingreso > 12 || ingreso < 1) {

            System.out.println("INGRESAR UN MES CORRECTO!");
            System.out.print("\n");
            System.out.print("INGRESE EL MES: ");
            ingreso = scan.nextInt();
        }
        return ingreso;
    }

    public static double obtSueldoBruto(double pagoHora, double hora) {

        return hora * pagoHora;
    }

    public static double obtDescuento(int mes, double sueldoBruto) {

        switch (mes) {
            case 1:
            case 4:
            case 7:
            case 11:
            case 12:
                return sueldoBruto * 0.02;
            default:
                return 0;
        }

    }

    public static String obtMes(int mes) {

        switch (mes) {

            case 1:
                return "ENERO";
            case 2:
                return "FEBRERO";
            case 3:
                return "MARZO";
            case 4:
                return "ABRIL";
            case 5:
                return "MAYO";
            case 6:
                return "JUNIO";
            case 7:
                return "JULIO";
            case 8:
                return "AGOSTO";
            case 9:
                return "SETIEMBRE";
            case 10:
                return "OCTUBRE";
            case 11:
                return "NOVIEMBRE";
            case 12:
                return "DICIEMBRE";
            default:
                return "ERROR12";
        }
    }

    public static double obtBono(int mes, double sueldoBruto) {

        if (mes == 7 || mes == 12) {
            return sueldoBruto * 0.5;
        }
        return 0;
    }

    public static double obtSueldoNeto(double sueldoBruto, double descuento, double bono) {

        return sueldoBruto + bono - descuento;
    }
}
