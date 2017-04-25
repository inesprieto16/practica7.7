/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg7.pkg7;

/**
 *
 * @author inesprieto16
 */
public class Par<T,S> {
    private T t;
    private S s;
    
    public Par(T t,S s){
        this.t=t;
        this.s=s;
    }
    public T getT(){
        return t;
    }
    public S getS(){
        return s;
    }
    public void setT(T t){
        this.t=t;
    }
    public void setS(S s){
        this.s =s;
    }
    @Override
    public String toString(){
        return String.format("%s : %s ºC",getT(),getS());
    }
}
