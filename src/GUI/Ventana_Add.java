/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Clases.*;
import java.awt.Color;
import EDD.*;
import proyecto_1_edd.*;
/**
 *
 * @author Gustavo
 */
public class Ventana_Add extends javax.swing.JFrame {
    
    List Usuarios;
    Ventana_Principal origen;
    Usuario nuevo;
    /**
     * Creates new form prueba
     * @param
     */
    public Ventana_Add() {
        initComponents();
        this.setLocationRelativeTo(null);

    }
    
    public Ventana_Add(List lista_grafo, Ventana_Principal origen, Usuario nuevo) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.Usuarios = lista_grafo;
        this.origen = origen;
        this.nuevo = nuevo;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        boton_add_user = new javax.swing.JButton();
        escribir_user_add = new javax.swing.JTextField();
        escribir_seguido = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        texto_arriba = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel1.setText("SEGUIDORES:");

        jButton1.setText("Volver al inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Añadir seguido");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel2.setText("SIGUE A:");

        boton_add_user.setText("Añadir seguidor");
        boton_add_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_add_userActionPerformed(evt);
            }
        });

        escribir_user_add.setEditable(false);
        escribir_user_add.setBackground(new java.awt.Color(255, 255, 255));
        escribir_user_add.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        escribir_user_add.setForeground(new java.awt.Color(204, 204, 204));
        escribir_user_add.setText("Ingrese un nombre de usuario existente...");
        escribir_user_add.setToolTipText("");
        escribir_user_add.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        escribir_user_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                escribir_user_addMousePressed(evt);
            }
        });
        escribir_user_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribir_user_addActionPerformed(evt);
            }
        });

        escribir_seguido.setEditable(false);
        escribir_seguido.setBackground(new java.awt.Color(255, 255, 255));
        escribir_seguido.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        escribir_seguido.setForeground(new java.awt.Color(204, 204, 204));
        escribir_seguido.setText("Ingrese el nombre del usuario a seguir...");
        escribir_seguido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        escribir_seguido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                escribir_seguidoMousePressed(evt);
            }
        });
        escribir_seguido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribir_seguidoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto_arriba.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        texto_arriba.setText("Indica la relación que");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_add_user)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(texto_arriba, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(172, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(escribir_user_add, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(escribir_seguido, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(240, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(boton_add_user))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(texto_arriba)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(escribir_user_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(91, 91, 91)
                    .addComponent(escribir_seguido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(108, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.origen.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (!String.valueOf(escribir_seguido.getText()).equals("Ingrese el nombre del usuario a seguir...")){
            Usuario.añadir_relaciones(nuevo, escribir_seguido.getText(), Usuarios);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void boton_add_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_add_userActionPerformed
        // TODO add your handling code here:
        if(!escribir_user_add.getText().equals("Ingrese un nombre de usuario existente...")){
            //
            String org = escribir_user_add.getText();
            Funciones.añadir_relacion1_completo(Usuarios, org, nuevo);
        }
    }//GEN-LAST:event_boton_add_userActionPerformed

    private void escribir_user_addMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escribir_user_addMousePressed
        // TODO add your handling code here:
        escribir_user_add.setEditable(true);
        if(escribir_user_add.getText().equals("Ingrese un nombre de usuario existente...")){
            escribir_user_add.setText("");
            escribir_user_add.setForeground(Color.black);
        }
        if (String.valueOf(escribir_seguido.getText()).isEmpty()){
            escribir_seguido.setText("Ingrese el nombre del usuario a seguir...");
            escribir_seguido.setForeground(Color.gray);
        }

    }//GEN-LAST:event_escribir_user_addMousePressed

    private void escribir_user_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribir_user_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escribir_user_addActionPerformed

    private void escribir_seguidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escribir_seguidoMousePressed
        // TODO add your handling code here:
        escribir_seguido.setEditable(true);
        if (String.valueOf(escribir_seguido.getText()).equals("Ingrese el nombre del usuario a seguir...")){
            escribir_seguido.setText("");
            escribir_seguido.setForeground(Color.black);
        }
        if (String.valueOf(escribir_user_add.getText()).isEmpty()){
            escribir_user_add.setText("Ingrese un nombre de usuario existente...");
            escribir_user_add.setForeground(Color.gray);
        }

    }//GEN-LAST:event_escribir_seguidoMousePressed

    private void escribir_seguidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribir_seguidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escribir_seguidoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_add_user;
    private javax.swing.JTextField escribir_seguido;
    private javax.swing.JTextField escribir_user_add;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel texto_arriba;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the texto_arriba
     */
    public javax.swing.JLabel getTexto_arriba() {
        return texto_arriba;
    }
}
