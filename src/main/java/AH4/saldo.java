/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AH4;
import java.util.Scanner;

/**
 *
 * @author IVAN
 */
public class saldo {

    public static void main(String[] args) throws InterruptedException {
        Scanner scaneo = new Scanner(System.in);
        int dato;
        cuenta s1 = new cuenta();
        cuenta s2 = new cuenta();

        s1.sumarsaldo(500);
        s2.sumarsaldo(300);

        boolean opciones = true, opcion1 = true, opcion2 = true;

        do {
            System.out.println("_____BIENVENIDO AL MENU PRINCIPAL______");
            System.out.println("SELECCIONE LA CUENTA QUE DESEA USAR");
            System.out.println("Cuenta 1...............1");
            System.out.println("Cuenta 2...............2");
            System.out.println("salir del programa.....3");
            System.out.println("Opcion: ");
            dato = scaneo.nextInt();

            switch (dato) {

                case 1:
                    do {
                        System.out.println("HA SELECCIONADO LA CUENTA 1");
                        System.out.println("¿QUE ES LO QUE DESEA HACER?");
                        System.out.println("Ingresar Dinero...............1");
                        System.out.println("Retirar Dinero................2");
                        System.out.println("Cosultar saldo disponible.....3");
                        System.out.println("Salir.........................4");
                        System.out.println("Opcion:");
                        int primera = scaneo.nextInt();
                        switch (primera) {

                            case 1:
                                System.out.println("Ha seleccionado Ingresar dinero");
                                System.out.println("Ingrese el total de dinero que desea ingresar: ");
                                double dineromas = scaneo.nextDouble();
                                s1.sumarsaldo(dineromas);
                                break;

                            case 2:
                                System.out.println("Ha seleccionado Retirar dinero");
                                System.out.println("Ingrese el total de dinero que sea retirar");
                                double dineromenos = scaneo.nextDouble();
                                s1.restarsaldo(dineromenos);
                                break;

                            case 3:
                                s1.totalsaldo();
                                Thread.sleep(3500);
                                break;

                            case 4:
                                System.out.println("Ha decidido salir");
                                opcion1 = false;
                                break;

                            default:
                                System.out.println("La opcion ingresada no es correcta");
                        }

                    } while (opcion1 != false);
                    break;

                case 2:
                    do {
                        System.out.println("HA SELECCIONADO LA CUENTA 1");
                        System.out.println("¿QUE ES LO QUE DESEA HACER?");
                        System.out.println("Ingresar Dinero...............1");
                        System.out.println("Retirar Dinero................2");
                        System.out.println("Cosultar saldo disponible.....3");
                        System.out.println("Salir.........................4");
                        System.out.println("Opcion:");
                        int segunda = scaneo.nextInt();
                        switch (segunda) {

                            case 1:
                                System.out.println("Ha seleccionado Ingresar dinero");
                                System.out.println("Ingrese el total de dinero que desea ingresar: ");
                                double dineromas = scaneo.nextDouble();
                                s2.sumarsaldo(dineromas);
                                break;

                            case 2:
                                System.out.println("Ha seleccionado Retirar dinero");
                                System.out.println("Ingrese el total de dinero que sea retirar");
                                double dineromenos = scaneo.nextDouble();
                                s2.restarsaldo(dineromenos);
                                break;

                            case 3:

                                s2.totalsaldo();
                                Thread.sleep(3500);
                                break;

                            case 4:
                                System.out.println("Ha decidido salir");
                                opcion2 = false;
                                break;

                            default:
                                System.out.println("La opcion ingresada no es correcta");
                        }

                    } while (opcion2 != false);
                    break;
                case 3:
                    System.out.println("Ha decidido salir del programa");
                    opciones = false;
                    break;

            }

        } while (opciones != false);
    }
}
