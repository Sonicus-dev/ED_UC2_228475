/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed_uc2_228475;

/**
 *
 * @author santi
 */
public class ED_UC2_228475 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        listaEnlazadaSimple ListaEnlazadaSimple = new listaEnlazadaSimple();

        ListaEnlazadaSimple.addFirst("Pastel");
        lista.addFirst("Tarta");

        ListaEnlazadaSimple.addLast("Pay");
        ListaEnlazadaSimple.addLast("Cheesecake");

        System.out.println("Lista antes de eliminar elementos:");
        System.out.println(ListaEnlazadaSimple.toString());

        ListaEnlazadaSimple.removeFirst();

        System.out.println("Lista después de eliminar el primer elemento:");
        System.out.println(ListaEnlazadaSimple.toString());

        ListaEnlazadaSimple.removeLast();

        System.out.println("Lista después de eliminar el último elemento:");
        System.out.println(ListaEnlazadaSimple.toString());

        System.out.println("¿La lista contiene 'Tarta'? " + ListaEnlazadaSimple.contains("Tarta"));

        System.out.println("Elemento en la posición 1: " + ListaEnlazadaSimple.getElement(0));

        ListaEnlazadaSimple.clear();

        System.out.println("Lista después de eliminar todos los elementos:");
        System.out.println(ListaEnlazadaSimple.toString());
    }
}
