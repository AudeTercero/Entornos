/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornos;

/**
 *
 * @author asus
 */
public class Entornos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        for (int i = 0; i < 5; i++) {
            lista.anadirDelante(i);
        }
        
        lista.mostrar();
    }
    
}
