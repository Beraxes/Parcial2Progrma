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
            } else if (temp.getVoto() == 2) {
                c2++;
                temp = temp.getEnlace();
            } else if (temp.getVoto() == 3) {
                c3++;
                temp = temp.getEnlace();
            } else if (temp.getVoto() == 4) {
                blanco++;
                temp = temp.getEnlace();
            } else {
                temp = temp.getEnlace();
            }
        }       
        if (c1 > c2 && c1 > c3) {
            JOptionPane.showMessageDialog(null, "El ganador de estas elecciones es Mauro con: " + c1 + " Votos");
        } else if (c2 > c1 && c2 > c3) {
            JOptionPane.showMessageDialog(null, "El ganador de estas elecciones es Rodrigo con: " + c2 + " Votos");
        } else if (c3 > c1 && c3 > c2) {
            JOptionPane.showMessageDialog(null, "El ganador de estas elecciones es Feliciano con: " + c3 + " Votos");
        } else if (c1 == c2 && c1 == c3) {
            JOptionPane.showMessageDialog(null, "Hubo empate en estas elecciones: " + c1 + " Votos");
        }else{
            JOptionPane.showMessageDialog(null, "Gano el Voto en blanco con: " + blanco + " Votos");
        }
        JOptionPane.showMessageDialog(null, "Resultado de votaciones: \n Mauro: " + c1 + "\n Rodrigo: " + c2 + "\n Feliciano: " + c3 + "\n blanco: " + blanco);
    }

    public void listarPorCandidatos() {
        sufragante temp1 = inicio, temp2 = inicio, temp3 = inicio;
        System.out.println("Votaron por Mauro: ");
        while (temp1 != null) {
            if (temp1.getVoto() == 1) {
                temp1.mostrarSufr();
                temp1 = temp1.getEnlace();
            } else {
                temp1 = temp1.getEnlace();
            }
        }
        System.out.println("____________________________________");
        System.out.println("Votaron por Rodrigo: ");
        while (temp2 != null) {
            if (temp2.getVoto() == 2) {
                temp2.mostrarSufr();
                temp2 = temp2.getEnlace();
            } else {
                temp2 = temp2.getEnlace();
            }
        }
        System.out.println("____________________________________");
        System.out.println("Votaron por Feliciano: ");
        while (temp3 != null) {
            if (temp3.getVoto() == 3) {
                temp3.mostrarSufr();
                temp3 = temp3.getEnlace();
            } else {
                temp3 = temp3.getEnlace();
            }
        }

    }

    public static void main(String[] args) {
        int opcion;
        Elecciones objetoElecciones = new Elecciones();
        opcion = Integer.parseInt(JOptionPane.showInputDialog("1 Registrar Votacion \n 2 Contar Votos \n 3 Listar Votantes por Candidatos \n 4 Salir "));
        do {
            if (opcion == 1) {
                objetoElecciones.Votacion();

            } else if (opcion == 2) {
                objetoElecciones.contarVotos();
            } else if (opcion == 3) {
                objetoElecciones.listarPorCandidatos();
            } else {
                System.exit(0);
            }
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1 Registrar Votacion \n 2 Contar Votos \n 3 Listar Votantes por Candidatos \n 4 Salir "));
        } while ((opcion >= 1) && (opcion <= 4));
    }

}
