/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaVueloHind;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author hinda
 */
public class GestionVuelos {

    //crear una lista de vuelos
    public static ArrayList<Vuelo> vuelos = new ArrayList<>();

    //metodo para generar los pasajeros por destino sin ordenar
    public static Map<String, Integer> generaLosPasajerosPorDestino() {
        Map<String, Integer> vuelosMap = new HashMap<>();
        for (int i = 0; i < vuelos.size(); i++) {
            if (vuelosMap.containsKey(vuelos.get(i).getCiudadDestino())) {
                vuelosMap.put(vuelos.get(i).getCiudadDestino(),vuelosMap.get(vuelos.get(i).getCiudadDestino()) + vuelos.get(i).numeroPasajeros());
            } else {
                vuelosMap.put(vuelos.get(i).getCiudadDestino(), vuelos.get(i).numeroPasajeros());
            }
        }
        return vuelosMap;
    }

    /*otro método donde repetimos el método anterior pero ordenando alfabéticamente por destino*/
    public static Map<String, Integer> generaLosPasajerosPorDestinoOrdinar() {
        Map<String, Integer> vuelosMapordenada = new TreeMap<>();

        for (int i = 0; i < vuelos.size(); i++) {
            if (vuelosMapordenada.containsKey(vuelos.get(i).getCiudadDestino())) {
                vuelosMapordenada.put(vuelos.get(i).getCiudadDestino(),vuelosMapordenada.get(vuelos.get(i).getCiudadDestino()) + vuelos.get(i).numeroPasajeros());
            } else {
                vuelosMapordenada.put(vuelos.get(i).getCiudadDestino(), vuelos.get(i).numeroPasajeros());
            }
        }
        return vuelosMapordenada;
    }

    
    public static Map<String, Set<Pasajero>> porCodigoVueloSaberPasajeros() {
        Map<String, Set<Pasajero>> vuelosMapPasajeros = new HashMap<>();

        for (Vuelo v : vuelos) {
            vuelosMapPasajeros.put(v.getCodigoVuelo(), v.getPasajeros());
        }

        return vuelosMapPasajeros;
    }

    //un método estático que genere un map que contenga para cada destino el número de pasajeros que llegan a ese destino de todos los vuelos
    public static void main(String[] args) {

        //crear Vuelos
        Vuelo v1 = new Vuelo("EW2537", "Malaga", "paris", 2, 200);
        Vuelo v2 = new Vuelo("GW1537", "Sevilla", "Paris", 3, 200);
        Vuelo v3 = new Vuelo("JG2438", "Sevilla", "Frankfort", 1.5, 200);
        Vuelo v4 = new Vuelo("KL1235", "Barcalona", "Budapest", 4, 200);
        Vuelo v5 = new Vuelo("EN5539", "Madrid", "Paris", 2, 200);
        Vuelo v6 = new Vuelo("BV4437", "Berlin", "Londres", 4, 200);

        //añadir pasajeros al vuelos
        v1.añadirPasajero(
                new Pasajero("p1", "Juan", "KL23654", "soltero", 10));
        v1.añadirPasajero(
                new Pasajero("p2", "Gabriel", "LM5689", "soltero", 20));
        v1.añadirPasajero(
                new Pasajero("p3", "Lopez", "JH53214", "Soltera", 25));
        v1.añadirPasajero(
                new Pasajero("p4", "Jerez", "JH45897", "Casada", 10));
        v1.añadirPasajero(
                new Pasajero("p5", "Alex", "NM25487", "soltero", 20));
        v1.añadirPasajero(
                new Pasajero("p6", "Angel", "VG52348", "soltero", 10));

        v2.añadirPasajero(
                new Pasajero("Juan", "Juan", "KL23654", "soltero", 10));
        v2.añadirPasajero(
                new Pasajero("Gabriel", "Gabriel", "LM5689", "soltero", 20));
        v2.añadirPasajero(
                new Pasajero("Maria", "Lopez", "JH53214", "Soltera", 25));
        v2.añadirPasajero(
                new Pasajero("Anna", "Jerez", "JH45897", "Casada", 10));
        v2.añadirPasajero(
                new Pasajero("Alex", "Alex", "NM25487", "soltero", 20));
        v2.añadirPasajero(
                new Pasajero("Angel", "Angel", "VG52348", "soltero", 10));

        v3.añadirPasajero(
                new Pasajero("Juan", "Juan", "KL23654", "soltero", 10));
        v3.añadirPasajero(
                new Pasajero("Gabriel", "Gabriel", "LM5689", "soltero", 20));
        v3.añadirPasajero(
                new Pasajero("Maria", "Lopez", "JH53214", "Soltera", 25));
        v3.añadirPasajero(
                new Pasajero("Anna", "Jerez", "JH45897", "Casada", 10));
        v3.añadirPasajero(
                new Pasajero("Alex", "Alex", "NM25487", "soltero", 20));
        v3.añadirPasajero(
                new Pasajero("Angel", "Angel", "VG52348", "soltero", 10));

        v4.añadirPasajero(
                new Pasajero("Juan", "Juan", "KL23654", "soltero", 10));
        v4.añadirPasajero(
                new Pasajero("Gabriel", "Gabriel", "LM5689", "soltero", 20));
        v4.añadirPasajero(
                new Pasajero("Maria", "Lopez", "JH53214", "Soltera", 25));
        v4.añadirPasajero(
                new Pasajero("Anna", "Jerez", "JH45897", "Casada", 10));

        //añado vuelos a la lista de vuelos
        vuelos.add(v1);

        vuelos.add(v2);

        vuelos.add(v3);

        vuelos.add(v4);

        vuelos.add(v5);

        vuelos.add(v6);

        //mostrar el arrayList de Vuelos 
        System.out.println("La lista de Vuelos:\n");
        vuelos.forEach(System.out::println);
        
        //mostrar el map
        //Metodo static para convertir en map sin ordenar
        System.out.println("Map sin ordenar");
        Map<String, Integer> vuelosMap = generaLosPasajerosPorDestino();
        vuelosMap.forEach((vuelos, pasajeros) -> {
            System.out.println(vuelos + " -- pasajeros: " + pasajeros);
        });

        //otro método donde repetimos el método anterior pero ordenando alfabéticamente por destino
        System.out.println("\n map ordenada por cada destinacion numero pasajeros:");
        generaLosPasajerosPorDestinoOrdinar().forEach((vuelos, pasajeros) -> {
            System.out.println(vuelos + " -- pasajeros: " + pasajeros);
        });

        //el tercer método debe de permitir saber por código de vuelo los pasajeros que hay
        System.out.println("\n los pasajeros de cada Vuelo son: \n");

        Map<String, Set<Pasajero>> mapPasajeros = porCodigoVueloSaberPasajeros();
        mapPasajeros.forEach((codVuelo, pasajeros) -> {
            System.out.println("Vuelo: " + codVuelo + "\n");
            pasajeros.forEach(System.out::println);
        });
    }
}
