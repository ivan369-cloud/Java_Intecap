/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AH3;

import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author IVAN
 */
public class Ejercicio5 {
 public static void main(String[] args){
    
    Scanner sp = new Scanner(System.in);
        
        int n;
        int suma = 0;
        
        do {
            System.out.println("Teclea numeros: ");
            n =sp.nextInt();
            suma += n;           
                       
         }while (n!=0);
        System.out.println("La suma de todos los numeros es: ");
        System.out.println(suma);
     }
}
