/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.*;
import GUI.*;
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
    
    public static void mostrar_grafo(){
        Graph graph = new SingleGraph("MiGrafo");
        Node node = graph.addNode("A");
        node.addAttribute("ui.label", "A");
        node.addAttribute("ui.color", "#FF0000");
        node.addAttribute("ui.size", 50);
        node.addAttribute("ui.style", "size: 50px; fill-color: #FF0000;");
        Node node2 = graph.addNode("B");
        node2.addAttribute("ui.label", "B");
        
        Edge edge = graph.addEdge("AB", "A", "B", true);
        edge.addAttribute("ui.color", "#00FF00");
        edge.addAttribute("ui.style", "fill-color: #00FF00;");
        
        // Create a viewer and add the graph to it
        Viewer viewer = new Viewer(graph, Viewer.ThreadingModel.GRAPH_IN_ANOTHER_THREAD);
        viewer.enableAutoLayout();
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);

        viewer.addDefaultView(true);
    }
    
    public static void cargar_completo(){
//        List Usuarios = new List();
//        String file = Archivo.choose_archivo();
//        String[] usuarios_relaciones = Archivo.cargar_archivo(file);
//        
//        Archivo.cargar_usuarios(usuarios_relaciones[0], Usuarios);
//        Archivo.cargar_relaciones(usuarios_relaciones[1], Usuarios);
    }
}
