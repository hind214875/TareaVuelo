/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaVueloHind;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author hinda
 */

/*
Tenemos la clase Vuelo con 5 atributos: codigo de vuelo, ciudad origen, ciudad destino, duración del vuelo y lista de pasajeros.
En el main se genera una lista de vuelos,  un método estático que genere un map que contenga para cada destino el número de pasajeros que llegan
a ese destino de todos los vuelos, otro método donde repetimos el método anterior pero ordenando alfabéticamente por destino
y el tercer método debe de permitir saber por código de vuelo los pasajeros que hay
 */
public class Vuelo  {
//atributos
    private String codigoVuelo;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double duracionVuelo;
    private int maxPasajeros;
    private Set<Pasajero> pasajeros;//set para no tener dublicados
    
    //constrectores
    public Vuelo(String codigoVuelo, String ciudadOrigen, String ciudadDestino, double duracionVuelo,int maxPasajeros) {
        this.codigoVuelo = codigoVuelo;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.duracionVuelo = duracionVuelo;
        this.pasajeros = new HashSet<>();
        this.maxPasajeros=maxPasajeros;
    }

    public Vuelo() {
    }
    
    //getters y setters 
    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public double getDuracionVuelo() {
        return duracionVuelo;
    }

    public void setDuracionVuelo(double duracionVuelo) {
        this.duracionVuelo = duracionVuelo;
    }

    public int getMaxPasajeros() {
        return maxPasajeros;
    }

    public void setMaxPasajeros(int maxPasajeros) {
        this.maxPasajeros = maxPasajeros;
    }

    public Set<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Set<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }
    
   //toString
    @Override
    public String toString() {
        return "Vuelo:" + "codigoVuelo=" + codigoVuelo + ", ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino + ", duracionVuelo=" + duracionVuelo + ", maxPasajeros=" + maxPasajeros + ", pasajeros=" + pasajeros ;
    }
    
    //metodos
    //numero pasajeros
    public  int numeroPasajeros(){
        return pasajeros.size();
    }
    
    //añadir un nuevo pasajero
    public void añadirPasajero(Pasajero p){
        if(numeroPasajeros()<this.maxPasajeros){
            pasajeros.add(p);
        }   
    }
   
    //elimina un pasajero
    public void eliminarPasajero(Pasajero p){
        pasajeros.remove(p);
    }
    
    //modificar pasajero
    public void modificarPasajero(Pasajero p){
        if(pasajeros.contains(p)){
            pasajeros.remove(p);
            pasajeros.add(new Pasajero());
        }
    }
    
    //saber si un pasajero exist
    public boolean esExist(Pasajero p){
        return pasajeros.contains(p);
    }
    
    //hashcode y equals

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.codigoVuelo);
        hash = 59 * hash + Objects.hashCode(this.ciudadOrigen);
        hash = 59 * hash + Objects.hashCode(this.ciudadDestino);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.duracionVuelo) ^ (Double.doubleToLongBits(this.duracionVuelo) >>> 32));
        hash = 59 * hash + this.maxPasajeros;
        hash = 59 * hash + Objects.hashCode(this.pasajeros);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vuelo other = (Vuelo) obj;
        if (Double.doubleToLongBits(this.duracionVuelo) != Double.doubleToLongBits(other.duracionVuelo)) {
            return false;
        }
        if (this.maxPasajeros != other.maxPasajeros) {
            return false;
        }
        if (!Objects.equals(this.codigoVuelo, other.codigoVuelo)) {
            return false;
        }
        if (!Objects.equals(this.ciudadOrigen, other.ciudadOrigen)) {
            return false;
        }
        if (!Objects.equals(this.ciudadDestino, other.ciudadDestino)) {
            return false;
        }
        if (!Objects.equals(this.pasajeros, other.pasajeros)) {
            return false;
        }
        return true;
    }

  
    
}
