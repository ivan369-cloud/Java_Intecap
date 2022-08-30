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
public class Ejercicio5 {
    
        public static void main(String[] args) {                
        Scanner sc = new Scanner(System.in);
        
        double radio,longitud,area;
        double pi=3.1416;
        System.out.println("Ingrese radio: ");
        radio = sc.nextDouble();
        
        longitud = radio*2;
        area= pi*radio*radio;
        
        System.out.println("Longitud de la circunferencia es:\n"+ longitud);
        System.out.println("Area de la cicunfernecia es:\n" + area);
    }
    
}
