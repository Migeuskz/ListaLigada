/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaLigada;

/**
 *
 * @author Mikey
 */
public class Nodo {
    private int dato;//dato almacenado
    private Nodo siguiente;//apuntador al siguiente nodo -> al referirse a la clase, hacemos referencia a la pocisión 
    
    public Nodo(int d){
        this.dato = d;
        this.siguiente = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() { //a donde se enlaza (apunta)
        return siguiente;
    }

    public void setSiguiente(Nodo otroNodo) {//enlaza 
        this.siguiente = otroNodo;
    }
    
}
