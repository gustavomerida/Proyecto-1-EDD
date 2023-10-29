/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author ricardomazziotta
 */

import EDD.Nodo;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import EDD.*;

public class Archivo {
    
         /**
     * Selecciona el archivo con el cual se va a trabajar.
     * @return la informacion del archivo en modo string
     * @param 
     */
    public static String choose_archivo() {
        String archivo = "";
        Scanner entrada = null;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooser);
        try {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();                                        
            File f = new File(ruta);
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                archivo += entrada.nextLine() + "\n";
            }
            return archivo;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("No se ha seleccionado ningún fichero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
        return null;
    }
    
//    public static void read_archivo(File f) {
//        try (BufferedReader br = new BufferedReader(new FileReader(f))){
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//            if(!line.isEmpty()){
//                if (line.contains("@") ){
//                    if (!line.contains(",")){
//                    String nombre = line;
//                    Usuario user = new Usuario(nombre);
//                    Nodo nodo = new Nodo(user);
//                    }
//                }else{
//                    //
//                }
//        } 
//    }catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    
         /**
     * Al pasarle el archivo en string, crea 2 strings uno con los usuarios y el otro con las relaciones
     * @param archivo Es el archivo con el que se va a trabajar casteado en string.
     * @return Retorna un array que contiene la lista de relaciones y la lista de usuarios, ambas en string 
     */
    public static String[] cargar_archivo(String archivo){
        String[] usuarios_relaciones = archivo.split("relaciones");
        return usuarios_relaciones;
        
    }
    
         /**
     * Agrega un elemento al final de la lista.
     * @param usuarios El string con todos los usuarios del archivo.
     * @param lista_usuarios La lista que va a poseer los Usuarios, estos tranformados en tipo Usuario
     */
    public static void cargar_usuarios(String usuarios, List lista_usuarios){
        String[] arreglo_usuarios = usuarios.split("\n");
        for (String user : arreglo_usuarios) {
            if (user.startsWith("@")){
                Usuario usuario = new Usuario(user);
                lista_usuarios.insertar_al_final(usuario);
            }
        }
    }
    
    
    /**
     * Agrega las relaciones de los usuarios.
     * @param relaciones El string con todas las relaciones.
     * @param lista_usuarios Lista que contiene los usuarios ya registrados
     */
    public static void cargar_relaciones(String relaciones, List <Nodo> lista_usuarios){
        String[] arreglo_relaciones = relaciones.split("\n");
        for (String arreglo_relacion : arreglo_relaciones) {
            String [] relacion = arreglo_relacion.split(", ");
            Nodo<Usuario> pAux = lista_usuarios.getFirst();
            for (int i = 0; i < lista_usuarios.getSize(); i++) {
                if (pAux.getElement().getNombre().equals(relacion[0])) {
                    if (pAux.getElement().getRelaciones() == null) {
                        List aux = new List();
                        Conexion n;
                        n = new Conexion(relacion[1]);
                        aux.insertar_al_final(n);
                        pAux.getElement().setRelaciones(aux);
                        break;
                    }
                    else{
                    Conexion n;
                    n = new Conexion(relacion[1]);
                    pAux.getElement().getRelaciones().insertar_al_final(n);
                    break;
                    }
                }else{
                    pAux = pAux.getNext();
                }   
            }
        }
    }
    
    /**
     * Tranforma la lista Usuarios en un string que posee los usuarios registrados.
     * @param lista_usuarios Es la lista que contiene a todos los usuarios registrados.
     * @return Retorna un string con todos los nombres de los usuarios registrados
     */
    public static String escribir_usuarios(List lista_usuarios){
        String usuarios = "";
        Nodo <Usuario> x = lista_usuarios.getFirst();
        for (int i = 0; i < lista_usuarios.getSize(); i++) { 
            if (x.getElement() != null){
            String user = x.getElement().getNombre();
            usuarios += user + "\n";
            x = x.getNext();
            }else{
                x.getNext();
            }
        }
        return usuarios;
    }
    
    
//    public static String escribir_relaciones(List lista_usuarios){
//        String relaciones = "";
//        Nodo <Usuario> x = lista_usuarios.getFirst();
//        for (int i = 0; i < lista_usuarios.getSize(); i++) { 
//            String user = x.getElement().getNombre();
//            List lista_relaciones = x.getElement().getRelaciones();
//            if (lista_relaciones != null) {
//            Nodo <Conexion> y = lista_relaciones.getFirst();
//            for (int j = 0; j < lista_relaciones.getSize(); j++) {
//                if (y != null) {
//                    String relacion = y.getElement().getNombre();
//                    relaciones += user + ", " + relacion + "\n";
//                    y = y.getNext();
//                }else{
//                   break; 
//                }
//            }
//            x = x.getNext();
//            } 
//        }
//        return relaciones;
//    }
        
    /**
     * Tranforma las listas relaciones en un string que posee las relaciones registradas
     * @param lista_usuarios Es la lista que contiene a todos los usuarios registrados.
     * @return Retorna un string con todas las relaciones registrados.
     */
        public static String escribir_relaciones(List lista_usuarios){
        String relaciones = "";
        Nodo <Usuario> x = lista_usuarios.getFirst();
        for (int i = 0; i < lista_usuarios.getSize(); i++) {
            if (x.getElement() != null){
                if (x.getElement().getNombre()!= null){
                    String user = x.getElement().getNombre();
                    List lista_relaciones = x.getElement().getRelaciones();
                    if (lista_relaciones != null) {
                        Nodo <Conexion> y = lista_relaciones.getFirst();
                        for (int j = 0; j < lista_relaciones.getSize(); j++) {
                            String relacion = y.getElement().getNombre();
                            relaciones += user + ", " + relacion + "\n";
                            y = y.getNext();
                        }
                    }
                    x = x.getNext();
                }
            }
            } 
        return relaciones;
    }
    
    
    /**
     * Crea un archivo de texto con los usuarios y relaciones registradas. El archivo se llama archivo.txt 
     * @param x Es el string que posee el string de los usuarios unido con el string de las relaciones 
     */
    public static void escribir_archivo(String x){
//        String x = "Usuarios \n" + usuarios + "Relaciones \n" + relaciones;
        FileWriter fichero = null;
        if (!x.isEmpty()){        
            try
            {
                fichero = new FileWriter("archivo.txt");
                PrintWriter pw = new PrintWriter(fichero);
                pw.print(x);
                pw.close();
                JOptionPane.showMessageDialog(null, "Guardado Exitosamente como 'archivo.txt' en Proyeto_1_EDD");

            } catch (IOException e) {
            } finally {
                try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero)
                    fichero.close();
                } catch (IOException e2) {
                    JOptionPane.showMessageDialog(null, "Error");
                }
            }
        }
    }
    
}
