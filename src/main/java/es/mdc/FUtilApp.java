/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.mdc;

import static es.mdc.FUtil.existe;

/**
 *
 * @author Usuario
 */
public class FUtilApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String archivo1 = "Documentos";
    String archivo2 = "Imágenes";
    String archivo3 = "Vídeos";
    String cadenaVacia = "";
    boolean respuesta1 = existe(archivo1);
    boolean respuesta2 = existe(archivo2);
    boolean respuesta3 = existe(archivo3);
    boolean respuesta4 = existe(cadenaVacia);
    
        System.out.printf("Documentos: %b%n Imágenes: %b%n Vídeos: %b%n", respuesta1, respuesta2, respuesta3);
    }
}