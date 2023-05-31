/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos;

/**
 *
 * @author DAM1B-22
 */
public class Nodo <E>{
    E valor;
    Nodo siguiente;
    
    public Nodo(E valor){
        this.valor = valor;
        siguiente = null;
    }
}
