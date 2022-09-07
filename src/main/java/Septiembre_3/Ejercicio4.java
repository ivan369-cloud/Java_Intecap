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
public class Ejercicio4 {
    
    public static void main(String[] args){
    
        int num,num1,num3;
        
        Scanner sp = new Scanner(System.in);
        
        System.out.println("Ingrese Primer numero");
        num = sp.nextInt(); 
        
        System.out.println("Ingrese Segundo numero");
        num1 = sp.nextInt();
        
        System.out.println("Ingrese Tercer numero");
        num3 = sp.nextInt();
             
        System.out.println("Los numeros ordenados de mayor a menor son:");
        
        if (num>=num1 && num1>=num3){                  
            System.out.println(" "+num +" " +num1+ " " +num3+ "");                   
        }
        else {
            System.out.println(num1+ +num +num3); 
        }
    }  
   
 }
