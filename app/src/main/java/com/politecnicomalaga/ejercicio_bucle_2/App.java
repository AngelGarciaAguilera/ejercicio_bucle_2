/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.politecnicomalaga.ejercicio_bucle_2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int num;
        int i;
        int multiplos;
        
        Scanner miScan = new Scanner(System.in);
        
        System.out.println("ESTE PROGRAMA MUESTRA LOS 10 PRIMEROS MÚLTIPLOS DEL NÚMERO QUE INTRODUZCAS");
        System.out.println("Introduzca un número: ");
        num = miScan.nextInt();
        
        i = 0;
                
        while(i < 10){
            
            multiplos = num * i;
            System.out.println("El " + (i + 1) + "º múltiplo del número introducido es: " + multiplos);
            
            i++;
        }   
    }
}