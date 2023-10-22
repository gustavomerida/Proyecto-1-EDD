/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 * Clase Lista
 * @author Gustavo Mérida 
 * Version 1
 */
public class List {
    private Nodo first; 
    private Nodo last; 
    private int size; 

    /**
     * Constructor de la clase.
     */
    public List(){ 
            this.first = null; 
            this.last = null; 
            this.size = 0; 
    }
    
    /**
     * @return the first
     */
    public Nodo getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(Nodo first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public Nodo getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(Nodo last) {
        this.last = last;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     * Verifica si la lista está vacía.
     * @return true si la lista está vacía, false de lo contrario.
     */
    public boolean isEmpty(){
    return getFirst() == null; 
    }
    /**
     * Vacía la lista, eliminando todos los elementos.
     */
    public void empty(){            
        this.setFirst(null);            
        this.setLast(null);            
        this.setSize(0);
    }
    /**
     * Obtiene el primer nodo de la lista.
     * @return El primer nodo de la lista.
     */
    public Nodo first(){
        return this.getFirst();
    }
    /**
     * Obtiene el último nodo de la lista.
     * @return El último nodo de la lista.
     */
    public Nodo last(){
        return this.getLast();
    }
    /**
     * Inserta un elemento en la posición especificada.
     * @param x El elemento a insertar.
     * @param pValor El nodo después del cual se insertará el elemento.
     */
    
    public void insert(T x, Nodo pValor){
        Nodo newNodo = new Nodo(x);
        if (this.first()==this.last()){
            newNodo.setNext(first);
            this.first = newNodo;
            size++;
        }else{
            if(pValor!=this.last){
                newNodo.setNext(pValor.getNext());
                pValor.setNext(newNodo);
                size++;
            }
        }
    }
     /**
     * Agrega un elemento al final de la lista.
     * @param x El elemento a agregar.
     */
    public void insertar_al_final(T x){
        Nodo newNodo = new Nodo(x);
        if(this.isEmpty()){            
            first = last = newNodo;        }
        else{            
            last.setNext(newNodo);            
            last = newNodo;        
        }        
        size++;    
    }
    
    /**
     * Lee el nombre de usuario.
     * @param pValor apuntador a Nodo de tipo Ususario.
     * @return x El String nombre del usuario.
     */
    public String read(Nodo <Usuario> pValor){
        String x = pValor.getElement().getNombre();
        return x;
    }
    
    /**
     * Imprime los elementos de la lista de usuarios.
     */
    public void travel() {
        Nodo<Usuario> pAux;
        pAux = this.first();
        while (pAux != this.last()) {
            System.out.println(pAux.getElement().getNombre());
            pAux.getElement().getRelaciones().travelr();
            pAux = pAux.getNext();
            }
    }

    /**
     * Imprime la lista de relaciones de un usuario.
     */
    public void travelr() {
        Nodo<T> pAux;
        pAux = this.first();
        for (int i = 0; i < this.getSize(); i++) {
            System.out.println(pAux.getElement());
            pAux = pAux.getNext();
            }
        }
}
