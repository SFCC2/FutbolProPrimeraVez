/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundialfutbol;

/**
 *
 * @author Sulay2016
 */
public class Nodo2 {
    
    
    
 
    /* Declaraciones de variables */
    private int valor;
 
    private Nodo2 padre;
    private Nodo2 hojaIzquierda;
    private Nodo2 hojaDerecha;
 
    /* Constructor */
    public Nodo2(int valor) {
        this.valor = valor;
    }
 
    /* Setters y Getters */
    public void setValor(int valor) {
        this.valor = valor;
    }
 
    public int getValor() {
        return valor;
    }
 
    public Nodo2 getPadre() {
        return padre;
    }
 
    public void setPadre(Nodo2 padre) {
        this.padre = padre;
    }
 
    public Nodo2 getHojaIzquierda() {
        return hojaIzquierda;
    }
 
    public void setHojaIzquierda(Nodo2 hojaIzquierda) {
        this.hojaIzquierda = hojaIzquierda;
    }
 
    public Nodo2 getHojaDerecha() {
        return hojaDerecha;
    }
 
    public void setHojaDerecha(Nodo2 hojaDerecha) {
        this.hojaDerecha = hojaDerecha;
    }
 

    
  
    
}
