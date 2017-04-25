/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg7.pkg7;

import java.util.ArrayList;

/**
 *
 * @author inesprieto16
 */
public class Practica77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaTemperaturas lt=new ListaTemperaturas();
        try{
           
        lt.inserta("Ourense", 30.0);
        lt.inserta("Vigo", 24.0);
        lt.inserta("A Coruña", 26.0);
        lt.inserta("Lugo", 20.0);
        lt.inserta("Ourense", 40.0);
        lt.inserta("Lugo", 30.0);
        ArrayList<String> ciudades;
            ciudades=lt.getCiudades();
            System.out.println(lt.get("Ourense"));
            for(int i=0;i<ciudades.size();i++){
                System.out.println(ciudades.get(i));
            }
            
            
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
}
