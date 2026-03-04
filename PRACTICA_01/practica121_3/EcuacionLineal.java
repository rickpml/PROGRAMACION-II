/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica121_3;

/**
 *
 * @author richa
 */
public class EcuacionLineal {
    private double a;
    private double b;
    private double c;
    
    public EcuacionLineal(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    public double getDis() {
        return (b*b)-(4*a*c);
    }
    
    public double getRaiz() {
        double d = getDis();
        if (d >= 0) {
            return (-b+Math.sqrt(d))/(2*a);
        } else {
            return 0;
        }
    }
    
    public double getRaiz1() {
        double d = getDis();
        if (d >= 0) {
            return (-b-Math.sqrt(d))/(2*a);
        } else {
            return 0;
        }
    }
}

