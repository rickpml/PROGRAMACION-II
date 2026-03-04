/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica121_1;

/**
 *
 * @author richa
 */
public class Cronometro { 
    private int inicia;
    private int finaliza;

    public Cronometro() {
        inicia = (int) System.currentTimeMillis();
    }

    public void inicia() {
        inicia = (int) System.currentTimeMillis();
    }
    public void detener() {
        finaliza = (int) System.currentTimeMillis();
    }
    public int getInicia() {
        return inicia;
    }
    public int getFinaliza() {
        return finaliza;
    }

    public int lapsoDeTiempo() {
        return finaliza - inicia;
    }
}
