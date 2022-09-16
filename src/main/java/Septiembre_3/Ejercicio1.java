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
public class Ejercicio1 {
    public static void main(String[] args){
    
    Scanner sp = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("Ingrese primer numero");
        num1 = sp.nextInt();
        System.out.println("Ingrese segundo numero");
        num2 = sp.nextInt();
        
       if (num1 == num2){
           System.out.println("Los numero ingresado son iguales");
           
    } else if (num1 != num2){
           System.out.println("Los numeros ingresados NO son iguales");
        }
    
    }
}
