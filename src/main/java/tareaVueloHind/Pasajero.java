/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaVueloHind;

/**
 *
 * @author hinda
 */
public class Pasajero {
    //atributos
    private String nombre;
    private String apellidos;
    private String numPasaporte;
    private String estadoCivil;
    private int equipaje;
    
    //constrectores
    public Pasajero(String nombre, String apellidos, String numPasaporte, String estadoCivil, int equipaje) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numPasaporte = numPasaporte;
        this.estadoCivil = estadoCivil;
        this.equipaje = equipaje;
    }

    public Pasajero() {
    }
    
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumPasaporte() {
        return numPasaporte;
    }

    public void setNumPasaporte(String numPasaporte) {
        this.numPasaporte = numPasaporte;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getEquipaje() {
        return equipaje;
    }

    public void setEquipaje(int equipaje) {
        this.equipaje = equipaje;
    }
    
    //toString
    @Override
    public String toString() {
        return "Pasajero:" + "nombre=" + nombre + ", apellidos=" + apellidos + ", numPasaporte=" + numPasaporte + ", estadoCivil=" + estadoCivil + ", equipaje=" + equipaje+"\n";
    }
    
    
}
