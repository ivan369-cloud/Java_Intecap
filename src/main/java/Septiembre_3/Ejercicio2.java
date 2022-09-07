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
public class Ejercicio2 {
    
    public static void main(String[] args){
    
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double num = sp.nextInt();
        if (num == 0){
               System.out.println("El numero ingresado es neutro");

        } else if (num < 0){
               System.out.println("El numero ingresado en NEGATIVO");
            }
            else{
         System.out.println("El numero ingresado en POSITIVO");
        }
    }
}
