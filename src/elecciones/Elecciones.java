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
        int v = Integer.parseInt(JOptionPane.showInputDialog("Por quien va a votar  \n 1 Mauro \n 2 Rodrigo \n 3 Feliciano \n 4 voto en blanco \n Cualquier otro numero cuenta como voto nulo"));
        if (inicio == null) {
            inicio = new sufragante();
            inicio.registrarSufr(c, n, v);
            fin = inicio;
        } else if (inicio != null) {
            sufragante temporal;
            boolean existente = false;
            sufragante tmp = inicio;
            if (inicio != null) {
                while ((tmp != null) && (existente == false)) {
                    if (tmp.getCedula() == c) {
                        existente = true;
                    } else {
                        tmp = tmp.getEnlace();
                    }
                }
                if (existente == true) {
                    JOptionPane.showMessageDialog(null, "Ya esta persona ejercio su voto");

                } else {
                    temporal = new sufragante();
                    temporal.registrarSufr(c, n, v);
                    fin.setEnlace(temporal);
                    fin = temporal;
                }

            }

        }

    }

    public void contarVotos() {
        sufragante temp = inicio;
        int c1 = 0, c2 = 0, c3 = 0, blanco = 0;
        while (temp != null) {
            if (temp.getVoto() == 1) {
                c1++;
                temp = temp.getEnlace();
            }
            if (temp.getVoto() == 2) {
                c2++;
                temp = temp.getEnlace();
            }
            if (temp.getVoto() == 3) {
                c3++;
                temp = temp.getEnlace();
            }
            if (temp.getVoto() == 4) {
                blanco++;
                temp = temp.getEnlace();
            } else {
                temp = temp.getEnlace();
            }
        }
        JOptionPane.showMessageDialog(null, "Resultado de votaciones: \n Mauro: " + c1 + "\n Rodrigo: " + c2 + "\n Feliciano: " + c3 + "\n blanco: " + blanco);
    }

    public void listarPorCandidatos() {
        sufragante temp = inicio;
        while (temp != null) {

        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
