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
        listaEnlazadaSimple lista = new listaEnlazadaSimple();

        lista.addFirst("Pastel");
        lista.addFirst("Tarta");

        lista.addLast("Pay");
        lista.addLast("Cheesecake");

        System.out.println("Lista antes de eliminar elementos:");
        System.out.println(lista.toString());

        lista.removeFirst();

        System.out.println("Lista después de eliminar el primer elemento:");
        System.out.println(lista.toString());

        lista.removeLast();

        System.out.println("Lista después de eliminar el último elemento:");
        System.out.println(lista.toString());

        System.out.println("¿La lista contiene 'Tarta'? " + lista.contains("Tarta"));

        System.out.println("Elemento en la posición 1: " + lista.getElement(0));

        lista.clear();

        System.out.println("Lista después de eliminar todos los elementos:");
        System.out.println(lista.toString());
    }
}
