/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import EDD.*;

import javax.swing.JOptionPane;

/**
 *
 * @author Victor Martinez
 */
public class Usuario {
    private String nombre;
    private List relaciones;
    private boolean fuerte;
    
    
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.relaciones = new List();
        this.fuerte = false;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set--
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the relaciones
     */
    public List getRelaciones() {
        return relaciones;
    }

    /**
     * @param relaciones the relaciones to set
     */
    public void setRelaciones(List relaciones) {
        this.relaciones = relaciones;
    }

    /**
     * @return the fuerte
     */
    public boolean isFuerte() {
        return fuerte;
    }

    /**
     * @param fuerte the fuerte to set
     */
    public void setFuerte(boolean fuerte) {
        this.fuerte = fuerte;
    }
    
    public void relacionesFuertes (List usuarios) {
        if (this.getRelaciones() != null){
        Nodo <Conexion> k = this.getRelaciones().getFirst();
        Nodo <Usuario> node = usuarios.buscar(this.getNombre());
        while (k != null) {
            if (k.getElement() != null){
            boolean response = k.getElement().ConexionFuerte(usuarios, node);
            k.getElement().setFuerte(response);
//            System.out.println(k.getElement().getNombre());
//            System.out.println(k.getElement().getFuerte());
            k = k.getNext();
            }
            else{
                break;
            }
        }
        }
    }
    
    public static Usuario añadir_usuario(String x, List lista_usuarios){
        if (x.startsWith("@")){
            if (lista_usuarios.buscar(x) == null) {
                Usuario usuario = new Usuario(x);
                lista_usuarios.insertar_al_final(usuario);
                JOptionPane.showMessageDialog(null, "Usuario Añadido Exitosamente");
                return usuario;
            } else {
                JOptionPane.showMessageDialog(null, "Este Usuario ya existe");
                Nodo<Usuario> n = lista_usuarios.buscar(x);
                Usuario user = n.getElement();
                return user;
            }
        }else{
            JOptionPane.showMessageDialog(null, "El nombre de usuario debe empezar con un '@'");
            return null;
        }
    }
    
    public static void añadir_relaciones(Usuario usuario, String x, List lista_usuario){
        Conexion c = new Conexion(x);
        List L = usuario.getRelaciones();
        //Aquí hay que validar que exista x dentro de la lista.
        Nodo prueba = lista_usuario.buscar(x);
        if (prueba!=null){
            if (x.startsWith("@")) {
                if (!L.isEmpty()) {
                    if (L.buscar_relacion(x) == null) {
                        L.insertar_al_final(c);
                        JOptionPane.showMessageDialog(null, "Haz establecido una relacion con " + x);
                    } else {
                        JOptionPane.showMessageDialog(null, "Ya tienes una relacion con " + x);
                    }
                } else {
                    List aux = new List();
                    aux.insertar_al_final(c);
                    usuario.setRelaciones(aux);
                    JOptionPane.showMessageDialog(null, "Haz establecido una relacion con " + x);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El nombre de usuario debe empezar con un '@'");
            }        
        }else{
            JOptionPane.showMessageDialog(null, "No se encontró el usuario " + x);
        }
    }
    
    public static void eliminar_usuario(String x, List lista_usuarios){
        Nodo <Usuario> nodo_usuario = lista_usuarios.buscar(x);
        if(nodo_usuario==null){
            JOptionPane.showMessageDialog(null, "Este usuario no está registrado");
        }else{
            lista_usuarios.eliminar(nodo_usuario);
            Nodo<Usuario> nodo_u = lista_usuarios.getFirst();
            for (int i = 0; i < lista_usuarios.getSize(); i++) {
                Usuario u = nodo_u.getElement();
                List list_elim = u.getRelaciones();
                if (!list_elim.isEmpty()) {
                    Nodo <Conexion> nodo_elim = list_elim.buscar_relacion(x);
                    if (nodo_elim != null) {
                        list_elim.eliminar(nodo_elim);
                    }
                    nodo_u = nodo_u.getNext();
                }
            }
            JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente");
        }

    }
}
