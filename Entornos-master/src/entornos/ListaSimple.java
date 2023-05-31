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
public class ListaSimple<E> {

    Nodo cabeza = null;
    int tamano = 0;

    public ListaSimple() {
        this.cabeza = null;
        this.tamano = 0;
    }

//    public void anadirDetras(E e) {
//
//        lista.addLast(e);
//
//    }
    public void anadirDelante(E e) {
        Nodo nuevaCabeza = new Nodo(e);;
        if (tamano == 0) {
            cabeza = nuevaCabeza;
        } else {
            nuevaCabeza.siguiente = cabeza;
            cabeza = nuevaCabeza;
        }
        tamano++;
    }
//
//    public void insertar(int indice, E e) {
//
//        lista.add(e);
//
//    }
//
//    public void borrarDelante() {
//
//        lista.removeFirst();
//    }
//
//    public void borrarDetras() {
//
//        lista.removeLast();
//    }
//
//    public void borrarEn(int indice) {
//
//        lista.remove(i);
//    }

    public void mostrar() {
        Nodo iterador = cabeza;
        for (int i = 0; i < this.tamano; i++) {
            System.out.println(iterador.valor);
            iterador = iterador.siguiente;
        }
    }
}
