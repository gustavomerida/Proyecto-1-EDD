/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.*;
import GUI.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import org.graphstream.ui.swingViewer.ViewPanel;
import org.graphstream.ui.view.Viewer;
import org.graphstream.ui.view.ViewerPipe;

/**
 *
 * @author Gustavo
 */
public class Funciones {
    
    public static void abrir_ventana(){
        Ventana_Principal v = new Ventana_Principal();
        v.setSize(1000, 600);
        v.setVisible(true);
        v.setResizable(false);
        v.setLocationRelativeTo(null);
    }
    
    
    public static void mostrar_grafo(List lista_usuarios){
        Graph graph = new SingleGraph("MiGrafo");
        Nodo<Usuario> user = lista_usuarios.getFirst();
        while (user != null) {
            user.getElement().relacionesFuertes(lista_usuarios);
            user = user.getNext();
        }
        
        if (lista_usuarios.isEmpty()){
            JOptionPane.showMessageDialog(null, "El grafo está vacío. Carga un archivo o agrega un usuario.");
        }else{
            Node node;
            Nodo <Usuario> pAux = lista_usuarios.getFirst();
            for (int i = 0; i < lista_usuarios.getSize(); i++) {
                node = graph.addNode(pAux.getElement().getNombre());
                node.addAttribute("ui.label", pAux.getElement().getNombre());
                if (false){
                    node.addAttribute("ui.color", "#FF0000");
                    node.addAttribute("ui.style", "fill-color: #FF0000;");
                }
                pAux = pAux.getNext();
            }
            
            pAux = lista_usuarios.getFirst();
            for (int h = 0; h < lista_usuarios.getSize(); h++) {
                List rel = pAux.getElement().getRelaciones();
                if(rel!=null){
                    Nodo <Conexion> y = rel.getFirst();
                    Edge edge;
                    for (int j = 0; j < rel.getSize(); j++) {
                        String origen = pAux.getElement().getNombre();
                        String relacion = y.getElement().getNombre();
                        //Condicional color
                        edge = graph.addEdge(origen + "-" + relacion, origen, relacion, true);
                        if(y.getElement().getFuerte() == true){
                            edge.addAttribute("ui.color", "#00FF00");
                            edge.addAttribute("ui.style", "fill-color: #00FF00;");
                        }
                        y = y.getNext();
                    }
                }
                pAux = pAux.getNext();
            }
            
            Viewer viewer = new Viewer(graph, Viewer.ThreadingModel.GRAPH_IN_ANOTHER_THREAD);
            viewer.enableAutoLayout();
            viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);

            viewer.addDefaultView(true);
        }

    }
    
    public static List cargar_completo(List Usuarios){
        String file = Archivo.choose_archivo();
        String[] usuarios_relaciones = Archivo.cargar_archivo(file);
        
        Archivo.cargar_usuarios(usuarios_relaciones[0], Usuarios);
        Archivo.cargar_relaciones(usuarios_relaciones[1], Usuarios);
        
        JOptionPane.showMessageDialog(null, "Archivo cargado exitosamente. Guarde los cambios que realice a partir de ahora.");
        
        return Usuarios;
    }
    
    public static void guardar_completo(List Usuarios){
        String x = Archivo.escribir_usuarios(Usuarios);      
        String y = Archivo.escribir_relaciones(Usuarios);
        String z = "usuarios\n" + x + "relaciones\n" + y;
        Archivo.escribir_archivo(z);
    }
    
    public static Usuario añadir_completo(List Usuarios){
        String x = JOptionPane.showInputDialog(null,"Escribe el nombre del nuevo usuario: ");
        Usuario nuevo = Usuario.añadir_usuario(x, Usuarios);
        return nuevo;
    }
    
    public static void añadir_relacion1_completo(List Usuarios, String origen, Usuario destino){
        Nodo <Usuario> desde = Usuarios.buscar(origen);
        Usuario d = desde.getElement();
        Usuario.añadir_relaciones(d, destino.getNombre(), Usuarios);  
    }
    
    
}
