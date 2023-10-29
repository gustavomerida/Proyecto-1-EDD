/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.*;
/**
 *
 * @author Victor
 */
public class Conexion {
    private String nombre;
    private Boolean fuerte;

    public Conexion (String nombre) {
        this.nombre = nombre;
        this.fuerte = false;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fuerte
     */
    public Boolean getFuerte() {
        return fuerte;
    }

    /**
     * @param fuerte the fuerte to set
     */
    public void setFuerte(boolean fuerte) {
        this.fuerte = fuerte;
    } 
    
    public boolean ConexionFuerte (List usuarios, Nodo <Usuario> user) {
        List laux;
        laux = new List();
        Nodo <Usuario> h = usuarios.getFirst();
        while (h != null){
            laux.insertar_al_final(h.getElement());
            h = h.getNext();
        } 
        String aux;
        aux = user.getElement().getNombre();
        if (this.getNombre().equals(aux) ){
            return true;
            }   
        else {
            Nodo <Usuario> nodo = laux.buscar(this.getNombre());
            if (nodo != null){
                List <Nodo> raux = nodo.getElement().getRelaciones();
                if (raux != null) {
                    Nodo <Conexion> k = raux.getFirst();
                    laux.eliminar(nodo);
                    while (k != null){
                        if (k.getElement() != null) {
                            boolean response = k.getElement().ConexionFuerte(laux, user);
                            if (response == true){
                                return true;
                            }
                            else{
                                k = k.getNext();
                            }
                        }
                        else{
                            break;
                        }   
                    }
                    return false;
            }
            else{
                return false;
            }
            }
            else{
                return false;
            }
        }   
    }    
}
