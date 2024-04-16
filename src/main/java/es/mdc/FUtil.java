/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.mdc;
import java.io.File;

/**
 *
 * @author Usuario
 */
public class FUtil {
    
    public static boolean existe(String filename){
        File file = new File(filename);
        if(file.exists()){
            return true;
        }
        if(filename.isBlank()){
            
        }
        return false;
    }
}
