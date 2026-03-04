/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica121_4;

/**
 *
 * @author richa
 */
import java.util.Scanner;
public class Practica121_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 numeros:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }

        Estadistica est = new Estadistica(numeros);

        System.out.println("El promedio:" + est.promedio());
        System.out.println("La desviacion estandar" + est.desviacion());

        sc.close();
    }
}
