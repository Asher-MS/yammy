/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.yammy;

import java.awt.CardLayout;

/**
 *
 * @author Asher
 */
public class recipe_page extends javax.swing.JPanel {

    /**
     * Creates new form recipe_page
     */
    String recipe_title="Recipe Title";
    String recipe_body="Recipe Body";
    public recipe_page(String recipe_title,String recipe_body) {
        this.recipe_title=recipe_title;
        this.recipe_body=recipe_body;
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setMinimumSize(new java.awt.Dimension(1000, 1000));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 0, 48)); // NOI18N
        jLabel1.setText(this.recipe_title);
        add(jLabel1);
        jLabel1.setBounds(267, 6, 417, 175);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/yammy/home_icon.png"))); // NOI18N
        jButton1.setName(""); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(23, 28, 36, 37);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText(this.recipe_body);
        jScrollPane2.setViewportView(jTextArea2);

        add(jScrollPane2);
        jScrollPane2.setBounds(90, 190, 743, 732);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout layout=(CardLayout)main_frame.mf.getContentPane().getLayout();
        layout.show(main_frame.mf.getContentPane(), "browse_page");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
