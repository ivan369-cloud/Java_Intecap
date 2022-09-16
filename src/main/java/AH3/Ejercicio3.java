/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AH3;

import java.util.Scanner;

/**
 *
 * @author IVAN
 */
public class Ejercicio3 {
     public static void main(String[] args) {
         
    Scanner sp = new Scanner (System.in);
    int numero;
    
    System.out.println("Introduce el número: ");
    numero = sp.nextInt(); 

    while(numero!=0){
        
    if (numero % 2 == 0){
    System.out.println("El número, " +numero + " es par.");
    }
        else {
        
        System.out.println("El número " +numero + " es impar.");
        }
    
        System.out.println("Ingrese otro numero");
        numero = sp.nextInt();
    } 
  }
}

