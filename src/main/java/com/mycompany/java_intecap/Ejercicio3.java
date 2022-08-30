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
public class Ejercicio3 {
    
    public static void main(String[] args) {
        //Scanner ivn= new Scanner(System.in);
        Scanner ivn;
        ivn = new Scanner(System.in);
        System.out.println("Ingrese un numero");
               
        int numero = ivn.nextInt();
        int resultado;
        resultado=numero;
                
        System.out.println("Doble del numero:\n" +resultado*2);
                                                                       
        System.out.println("Triple del numero:\n" + numero*3); //Forma directa System.out.println("Numero ingresado: "+ivn.nextInt());
    }
}
