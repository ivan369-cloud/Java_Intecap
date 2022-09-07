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
public class Ejercicio5 {
    
    public static void main(String[] args){
                
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el dia");
        int dia = sc.nextInt(); 
        
        System.out.println("Ingrese el mes");
        int mes = sc.nextInt(); 
        
        System.out.println("Ingrese el año");
        int año = sc.nextInt();            
            
        if (año>=1950 && año<=2030){
            if (mes>=1 && mes<=12)
                if(mes == 2){
                    if (dia>=1 && dia<=28) {
                        System.out.println("Fecha ingresa es: " + dia + "/" + mes + "/" + año);
                    }else {
                   System.out.println("Dia no valido"); 
               }
                }else {                                
                    if (dia>=1 && dia<=30) {
                    System.out.println("Fecha ingresa es: " + dia + "/" + mes + "/" + año);
               }else {
                   System.out.println("Dia no valido"); 
               }
            }
            else {
                System.out.println("Mes no valido"); 
            }
        }
        else {
            System.out.println("Año no valido"); 
        }
    }  
}
