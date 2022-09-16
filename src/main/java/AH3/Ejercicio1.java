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
public class Ejercicio1 {
    public static void main(String[] args){
    
    Scanner sp = new Scanner(System.in);
        
        int cuadrado;
                
        System.out.println("Ingresa un numero");
        int numero = sp.nextInt();
                
        while(numero>=-0){
            cuadrado= numero * numero;
            System.out.println("El cuadrado de: "+numero+ " es "+ cuadrado);
            System.out.println("Ingrese otro numero");
            numero = sp.nextInt();
        }
    }
}
