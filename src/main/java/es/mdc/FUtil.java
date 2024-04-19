/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.mdc;
import java.io.File;

/**
 *
 * @author Antonio
 */
public class FUtil {
    
    /**
     * Método que verifica si el archivo que se introduce existe o no.
     * @param filename El archivo a introducir.
     * @return Verdadero si existe, falso si no existe.
     * @throw Excepción si el archivo está en blanco.
     */
    public static boolean existe(String filename){
        File file = new File(filename);
        if(file.exists()){
            return true;
        }
        if(filename.isBlank()){
            throw new IllegalArgumentException("La cadena no puede estar en blanco.");
        }
        System.out.println("(Mensaje para modificar y editar en GitHub)");
        return false;
    }
}
