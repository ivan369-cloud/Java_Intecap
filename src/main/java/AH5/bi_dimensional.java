/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AH5;

import ejemplo_arrays.*;

/**
 *
 * @author IVAN
 */
public class bi_dimensional {
    
    public static void main(String[] args) {
        int num[][] = new int[8][8];
        
        int valor = 1;
        
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++){
            num[i][j] = valor;
            valor++;
           
            System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        }
    }    
}
