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
public class Ejercicio4 {
    
   public static void main(String[] args) {
         
    Scanner sp = new Scanner(System.in);
    
    int n = (int)(Math.random() *10);
       
    System.out.println("Adivina el numero");
    int numero = sp.nextInt(); 

        while(n<=10){
            if (numero==n){
                
            System.out.println("El numero es correcto");
            break;
            
            }else { 
                
                System.out.println("Has fallado... intenta de nuevo");
                numero = sp.nextInt();} 
    } 
  }
}
