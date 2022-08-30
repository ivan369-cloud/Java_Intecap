/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_intecap;

import java.util.Scanner;

/**
 *
 * @author IVAN
 */
public class Ejercicio4 {
    
        public static void main(String[] args) {                
        Scanner sc = new Scanner(System.in);
        
        double celcius, farenheit;
        
        System.out.println("Ingrese los grados celsius: ");
        
        celcius = sc.nextDouble();
        
        farenheit = (celcius *9/5) + 32;
        System.out.printf(celcius + " Grados Celcius son: " + farenheit + " Grados Farenheit");
    }
    
}
