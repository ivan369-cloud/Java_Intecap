/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AH4;

/**
 *
 * @author IVAN
 */
public class cuenta {

    double saldocuenta;
    
    public void sumarsaldo(double sumar){
        saldocuenta += sumar;
    }
    
    public void restarsaldo (double restar){
        
        saldocuenta -=restar;
    }
    
    public void totalsaldo(){
        System.out.println("El saldo actual de la cuenta es: " + saldocuenta);
        
    }
}
