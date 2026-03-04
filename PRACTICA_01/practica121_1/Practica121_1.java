/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica121_1;

/**
 *
 * @author richa
 */
import java.util.Random;
public class Practica121_1 {

    public static void main(String[] args) {
        final int TAMANO = 100000;
        int[] numeros = new int[TAMANO];
        Random rand = new Random();

        for (int i= 0; i < TAMANO; i++) {
            numeros[i] = rand.nextInt();
        }

        Cronometro crono = new Cronometro();
        crono.inicia();               
        selectionSort(numeros);
        crono.detener();               

        System.out.println("Tiempo de ordenacion para "
                + TAMANO + " elementos: " + crono.lapsoDeTiempo() + " ms");
    }

    public static void selectionSort(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n -1; i++) {
            int indiceMin = i;
            for (int j = i + 1; j <n; j++) {
                if (arreglo[j] < arreglo[indiceMin]) {
                    indiceMin = j;
                }
            }
            
            int temp = arreglo[indiceMin];
            arreglo[indiceMin] = arreglo[i];
            arreglo[i] = temp;
        }
    }
}
