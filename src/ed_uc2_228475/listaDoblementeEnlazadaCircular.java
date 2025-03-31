/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_uc2_228475;

/**
 *
 * @author santi
 */
public class listaDoblementeEnlazadaCircular {
    private Nodo inicial;
    private int contador;

    public listaDoblementeEnlazadaCircular() {
        this.inicial = null;
        this.contador = 0;
    }

    /**
     * Verifica si la lista está vacía.
     * @return true si la lista está vacía, false en caso contrario.
     */
    public boolean isEmpty() {
        return inicial == null;
    }

    /**
     * Retorna el número de elementos en la lista.
     * @return el número de elementos en la lista.
     */
    public int size() {
        return contador;
    }

    /**
     * Agrega un nuevo elemento al inicio de la lista.
     * @param dato el elemento a agregar.
     */
    public void addFirst(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (isEmpty()) {
            inicial = nuevo;
            inicial.setAnterior(inicial);
            inicial.setSiguiente(inicial);
        } else {
            nuevo.setSiguiente(inicial);
            nuevo.setAnterior(inicial.getAnterior());
            inicial.getAnterior().setSiguiente(nuevo);
            inicial.setAnterior(nuevo);
            inicial = nuevo;
        }
        contador++;
    }

    /**
     * Agrega un nuevo elemento al final de la lista.
     * @param dato el elemento a agregar.
     */
    public void addLast(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (isEmpty()) {
            inicial = nuevo;
            inicial.setAnterior(inicial);
            inicial.setSiguiente(inicial);
        } else {
            nuevo.setAnterior(inicial.getAnterior());
            nuevo.setSiguiente(inicial);
            inicial.getAnterior().setSiguiente(nuevo);
            inicial.setAnterior(nuevo);
        }
        contador++;
    }

    /**
     * Elimina el primer elemento de la lista.
     */
    public void removeFirst() {
        if (!isEmpty()) {
            if (inicial.getAnterior() == inicial) {
                inicial = null;
            } else {
                Nodo actual = inicial;
                while (actual.getAnterior() != inicial) {
                    actual = actual.getAnterior();
                }
                actual.setSiguiente(inicial.getSiguiente());
                inicial.getSiguiente().setAnterior(actual);
                inicial = inicial.getSiguiente();
            }
            contador--;
        }
    }

    /**
     * Elimina el último elemento de la lista.
     */
    public void removeLast() {
        if (!isEmpty()) {
            if (inicial.getAnterior() == inicial) {
                inicial = null;
            } else {
                Nodo actual = inicial.getAnterior();
                actual.getAnterior().setSiguiente(inicial);
                inicial.setAnterior(actual.getAnterior());
            }
            contador--;
        }
    }

    /**
     * Verifica si la lista contiene un elemento específico.
     * @param dato el elemento a buscar.
     * @return true si la lista contiene el elemento, false en caso contrario.
     */
    public boolean contains(Object dato) {
        Nodo actual = inicial;
        do {
            if (actual.getDato().equals(dato)) {
                return true;
            }
            actual = actual.getSiguiente();
        } while (actual != inicial);
        return false;
    }

    /**
     * Retorna el elemento en una posición específica de la lista.
     * @param posicion la posición del elemento a retornar.
     * @return el elemento en la posición especificada.
     */
    public Object getElement(int posicion) {
        if (posicion >= 0 && posicion < contador) {
            Nodo actual = inicial;
            for (int i = 0; i < posicion; i++) {
                actual = actual.getSiguiente();
            }
            return actual.getDato();
        } else {
            return null;
        }
    }

    /**
     * Elimina todos los elementos de la lista.
     */
    public void clear() {
        inicial = null;
        contador = 0;
    }

    /**
     * Retorna una representación en cadena de la lista.
     * @return una representación en cadena de la lista.
     */
    @Override
    public String toString() {
        StringBuilder cadena = new StringBuilder();
        Nodo actual = inicial;
        while (actual != null) {
            cadena.append(actual.getDato()).append(" ");
            actual = actual.getSiguiente();
        }
        return cadena.toString();
    }
}    