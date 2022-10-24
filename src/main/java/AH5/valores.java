/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AH5;

import java.util.Scanner;

/**
 *
 * @author IVAN
 */
public class valores {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        int ejercicio[][] = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.println("Dato para: [" + i + "][" + j + "]: ");
                ejercicio[i][j] = dato.nextInt();
            }
        }
        System.out.println("La matriz resultante de los datos ingresados es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(ejercicio[i][j] + " ");
            }
            System.out.println();
        }
    }
}
