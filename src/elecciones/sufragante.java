/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elecciones;

/**
 *
 * @author beraxes
 */
public class sufragante {

    private int cedula;
    private String nombre;
    private int voto;
    public sufragante enlace;

    public sufragante() {
        cedula = 0;
        nombre = "";
        voto = 0;
        enlace = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public sufragante getEnlace() {
        return enlace;
    }

    public void setEnlace(sufragante enlace) {
        this.enlace = enlace;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public void registrarSufr(int ce, String nomb, int vo) {
        setCedula(ce);
        setNombre(nomb);
        setVoto(vo);
    }

    public void mostrarSufr() {
        System.out.println("Cedula: "+getCedula());
        System.out.println("Nombre: "+getNombre());
        System.out.println("__________________________________");
    }

}
