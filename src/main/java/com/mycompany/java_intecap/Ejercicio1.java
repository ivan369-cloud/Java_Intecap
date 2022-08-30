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
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner ivn= new Scanner(System.in);
        System.out.println("Ingrese Primer numero");
        
        int numero1= ivn.nextInt();
        
        System.out.println("Ingrese Segundo numero");
        int numero2= ivn.nextInt();
                                                                       
        System.out.println("Los numeros ingresados son:\n" + numero1 +" y "+ numero2); //Forma directa System.out.println("Numero ingresado: "+ivn.nextInt());
    }
}
