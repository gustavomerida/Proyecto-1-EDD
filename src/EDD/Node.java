/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 * 
 * @author Gustavo Mérida
 * Version 2
 */
public class Nodo <T> {
    protected T tInfo;
    protected Nodo <T> pNext;
    
    //Constructor
    public Nodo(T elem){
        this.tInfo=elem;
        this.pNext=null;
        
    } 
}
