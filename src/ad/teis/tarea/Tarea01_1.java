/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ad.teis.tarea;

import ad.teis.model.Persona;
import ad.teis.persistencia.DataIOPersistencia;
import ad.teis.persistencia.IPersistencia;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author mfernandez
 */
public class Tarea01_1 {

    public static final Path PERSONAS_ORIGEN_PATH = Paths.get("src", "docs", "origen.dat");
    private static final Path PERSONAS_ORIGEN_COPIA_PATH = Paths.get("src", "docs", "borrados", "origen.dat.bk");
    private static final Path PERSONAS_DESTINO_PATH = Paths.get("src", "docs",
            "destino.dat.");

    private static ArrayList<Persona> filtrarPersonas(ArrayList<Persona> personas) {
        //implementa método
    }

    private static void cribarBorrados() {
        ArrayList<Persona> personas = new ArrayList<>();

        IPersistencia diop = new DataIOPersistencia();

        personas = diop.leerTodo(PERSONAS_ORIGEN_PATH.toString());

        //Completa el método
        filtrarPersonas(personas);
    

    
        ...
            


}

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {

        ArrayList<Persona> personasRecuperadas = new ArrayList<>();
        IPersistencia daop = new DataIOPersistencia();
        if (Files.exists(PERSONAS_ORIGEN_PATH)) {

            cribarBorrados();
            personasRecuperadas = daop.leerTodo(PERSONAS_DESTINO_PATH.toString());
            int contador = 1;
            for (Persona p : personasRecuperadas) {
                System.out.println("Persona recuperada " + contador + ": " + p);
                contador++;
            }

        } else {
            System.out.println("No existe el fichero en la ruta: " + PERSONAS_ORIGEN_PATH);
        }

    }
}
