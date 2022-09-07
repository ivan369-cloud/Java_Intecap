/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Septiembre_3;

import java.util.Scanner;

/**
 *
 * @author IVAN
 */
public class Ejercicio3 {
     public static void main(String[] args){
    
        int num, num1;
        
        Scanner sp = new Scanner(System.in);
        
        System.out.println("Ingrese Primer numero");
        num = sp.nextInt(); 
        
        System.out.println("Ingrese Segundo numero");
        num1 = sp.nextInt();
             
        System.out.println("Los numeros ingresados de mayor a menor son:");
        
        if (num >num1){                  
            System.out.println(num+ " y " +num1);                   
        }
        else {
            System.out.println(num1+ " y " +num); 
        }
    }
    
    
}
