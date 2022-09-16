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
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner sp = new Scanner(System.in);
                               
        System.out.println("Ingresa un numero");
        int numero = sp.nextInt();
                
        while(numero!=0){
            if (numero>0){
            System.out.println(+numero + " es positivo ");
            System.out.println("Ingrese otro numero ");
            numero = sp.nextInt();
             }
        
        else if(numero<0);{            
            System.out.println(+numero + " es negativo ");
            System.out.println("Ingrese otro numero");}
            numero = sp.nextInt();
        }
    }
 }

