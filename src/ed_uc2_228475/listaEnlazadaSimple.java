/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_uc2_228475;

/**
 *
 * @author santi
 */
public class listaEnlazadaSimple {

    private nodo inicial;

    private int contador;

    public listaEnlazadaSimple() {
        inicial = null;
        contador = 0;
    }

    public boolean isEmpty() {
        return inicial == null;
    }

    public int size() {
        return contador;
    }

    public void addFirst(Object dato) {
        nodo nuevo = new nodo(dato);
        nuevo.setSiguiente(inicial);
        inicial = nuevo;
        contador++;
    }

    public void addLast(Object dato) {
        if (isEmpty()) {
            addFirst(dato);
        } else {
            nodo actual = inicial;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            nodo nuevo = new nodo(dato);
            actual.setSiguiente(nuevo);
            contador++;
        }
    }

    public Object removeFirst() {
        if (isEmpty()) {
            return null;
        } else {
            Object dato = inicial.getDato();
            inicial = inicial.getSiguiente();
            contador--;
            return dato;
        }
    }

    public Object removeLast() {
        if (isEmpty()) {
            return null;
        } else if (inicial.getSiguiente() == null) {
            return removeFirst();
        } else {
            nodo actual = inicial;
            while (actual.getSiguiente().getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            Object dato = actual.getSiguiente().getDato();
            actual.setSiguiente(null);
            contador--;
            return dato;
        }
    }

    public boolean contains(Object dato) {
        nodo actual = inicial;
        while (actual != null) {
            if (actual.getDato().equals(dato)) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public Object getElement(int indice) {
        if (indice < 0 || indice >= contador) {
            return null;
        }
        nodo actual = inicial;
        for (int i = 0; i < indice; i++) {
            actual = actual.getSiguiente();
        }
        return actual.getDato();
    }

    public void clear() {
        inicial = null;
        contador = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        nodo actual = inicial;
        while (actual != null) {
            sb.append(actual.getDato()).append(" ");
            actual = actual.getSiguiente();
        }
        return sb.toString();
    }
}

