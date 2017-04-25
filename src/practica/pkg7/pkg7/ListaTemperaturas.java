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
public class ListaTemperaturas {
    private ArrayList<Par<String,Double>> lista;
    public ListaTemperaturas(){
        lista=new ArrayList<>();
    }
    public void inserta(String c,Double t){
        Par<String,Double> p=new Par<>(c,t);
        boolean si=false;
            for(int i=0;i<lista.size();i++){
            if(lista.get(i).getT()== c){
                lista.set(i, p);
                si=true;
            }   
        }
            if(!si){
            lista.add(p);
            }
        
        
        
    }
    public Double get(String c)throws Exception{
        Double v=0.0;
        boolean si=false;
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getT()==c){
                v=lista.get(i).getS();
                si=true;
            }
        }
        if(!si){
            throw new Exception("No está recogida esa ciudad");
        }
        return v;
    }
    public ArrayList<String> getCiudades(){
        ArrayList<String> c=new ArrayList<>();
        for(int i=0;i<lista.size();i++){
            c.add(lista.get(i).getT());
        }
        return c;
    }
    @Override
    public String toString(){
        StringBuilder toret=new StringBuilder();
        for(int i=0;i<lista.size();i++){
            toret.append(lista.get(i)).append("\n");
        }
        return toret.toString();
    }
    
}
