/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elecciones;

import javax.swing.JOptionPane;

/**
 *
 * @author beraxes
 */
public class Elecciones {

    sufragante inicio;
    sufragante fin;

    public Elecciones() {
        inicio = null;
        fin = null;
    }

    public void Votacion() {
        int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del sufragante"));
        String n = JOptionPane.showInputDialog("Ingrese el nombre del sufragante");
        int v = Integer.parseInt(JOptionPane.showInputDialog("Por quien va a votar  \n 1"));
        if (inicio == null) {
            inicio = new sufragante();
            inicio.registrarSufr(0, n, 0);

        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
