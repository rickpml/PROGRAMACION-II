/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica121_3;

/**
 *
 * @author richa
 */
import java.util.Scanner;
public class Practica121_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese a,b,c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        EcuacionLineal ecuacion = new EcuacionLineal(a, b, c);

        double dis = ecuacion.getDis();
        if (dis > 0) {
            System.out.println("La ecuacion tiene dos raices "
                    + ecuacion.getRaiz()+"y"
                    + ecuacion.getRaiz1());
        }
        else if (dis == 0) {
            System.out.println("La ecuacion tiene una raiz "
                    + ecuacion.getRaiz());
        }
        else {
            System.out.println("La ecuacion no tiene raices reales");
        }
        sc.close();
    }
}
