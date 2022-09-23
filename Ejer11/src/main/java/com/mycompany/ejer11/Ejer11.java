
package com.mycompany.ejer11;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejer11 {

    public static void main(String[] args) {
        
        //11. Programa que solicita ingresar un número favorito por teclado y luego el computador
        //debe mostrar el mensaje “Tu número favorito es ”;
        
        System.out.println("Ingresa tu numero favorito");
        Scanner sc = new Scanner (System.in);
        String X;
        String Y;
        X = JOptionPane.showInputDialog("¿ Cual es tu numero favorito ?" );
        Y = " Tu número favorito es : " + X ;
        JOptionPane.showInternalMessageDialog(null, Y);
    }
}
