/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Gustavo
 */
public class Nodo <T>{
    private Nodo <T> next;
    private Nodo <T> prev;
    private T element;
    
    public Nodo(T element) {
        this.next = null;
        this.prev = null;
        this.element = element;
    }    

    /**
     * @return the next
     */
    public Nodo<T> getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Nodo next) {
        this.next = next;
    }
    /**
     * @return the next
     */
    public Nodo<T> getPrev() {
        return prev;
    }

    /**
     * @param prev the next to set
     */
    public void setPrev(Nodo prev) {
        this.prev = prev;
    }


    /**
     * @return the element
     */
    public T getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(T element) {
        this.element = element;
    }   
}
