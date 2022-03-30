/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaVueloHind;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author hinda
 */
public class GestionVuelos {
    //crear una lista de vuelos

    public static Set<Vuelo> vuelos = new HashSet<>();

    public static Map<Vuelo, Integer> generaLosPasajerosPorDestino() {
        Map<Vuelo, Integer> vuelosMap = new HashMap<>();

        for (Vuelo v : vuelos) {
            vuelosMap.put(v, v.numeroPasajeros());
        }
        return vuelosMap;
    }

    /*otro método donde repetimos el método anterior pero ordenando alfabéticamente por destino*/
    public static Map<Vuelo, Integer> generaLosPasajerosPorDestinoOrdinar() {
        Map<Vuelo, Integer> vuelosMapOrdenada = new TreeMap<>();

        for (Vuelo v : vuelos) {
            vuelosMapOrdenada.put(v, v.numeroPasajeros());
        }
        return vuelosMapOrdenada;
    }

    /**/
    public static Set<Pasajero> porCodigoVueloSaberPasajeros(String numeroVuelo) {
        Map<Vuelo, Integer> vuelosMap = new HashMap<>();
        
        for (Vuelo v : vuelos) {
            vuelosMap.put(v, v.numeroPasajeros());
        }

        for (Map.Entry<Vuelo, Integer> vuelos : vuelosMap.entrySet()) {
            if (vuelos.getKey().getCodigoVuelo().equals(numeroVuelo)) {
                return vuelos.getKey().getPasajeros();
            }
        }
        return null;
    }

    //un método estático que genere un map que contenga para cada destino el número de pasajeros que llegan a ese destino de todos los vuelos
    public static void main(String[] args) {

        //crear Vuelos
        Vuelo v1 = new Vuelo("EW2537", "Malaga", "Mallorca", 2, 200);
        Vuelo v2 = new Vuelo("GW1537", "Sevilla", "Paris", 3, 200);
        Vuelo v3 = new Vuelo("JG2438", "Sevilla", "Frankfort", 1.5, 200);
        Vuelo v4 = new Vuelo("KL1235", "Barcalona", "Budapest", 4, 200);
        Vuelo v5 = new Vuelo("EN5539", "Madrid", "Rabat", 2, 200);
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

        //mostrar el map
        generaLosPasajerosPorDestino().forEach((vuelo, pasajeros) -> {
            System.out.println(vuelo.getCiudadDestino() + " -- pasajeros: " + pasajeros);
        });

        //mostrar el map ordenada
        //otro método donde repetimos el método anterior pero ordenando alfabéticamente por destino
        System.out.println("\n map ordenada por cada destinacion numero pasajeros:");
        generaLosPasajerosPorDestinoOrdinar().forEach((vuelo, pasajeros) -> {
            System.out.println(vuelo.getCiudadDestino() + " -- pasajeros: " + pasajeros);
        });

        //el tercer método debe de permitir saber por código de vuelo los pasajeros que hay
        System.out.println("\nlos pasajeros del Vuelo 'EW2537' son: \n");
        porCodigoVueloSaberPasajeros("EW2537").forEach(System.out::println);
    }
}
