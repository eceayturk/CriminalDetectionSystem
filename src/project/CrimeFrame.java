/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import javax.swing.JOptionPane;

/**
 *
 * @author ebrue
 */
public class CrimeFrame extends javax.swing.JFrame {
     DeathFrame df;
     KidnappingFrame kf;
     NarcoticCrimesFrame ncf;
    public CrimeFrame() {
        initComponents();
        this.setSize(500,354);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel70 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        murderbutton = new javax.swing.JRadioButton();
        kidnappingbutton = new javax.swing.JRadioButton();
        narcoticcrimes = new javax.swing.JRadioButton();
        closebutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Type of Crimes ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel70.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(204, 0, 0));
        jLabel70.setText("Criminal Detection System");
        getContentPane().add(jLabel70);
        jLabel70.setBounds(30, 30, 390, 20);

        jLabel6.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Type of crime");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 60, 140, 24);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("(Make Your Selection and Press Enter)");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 80, 300, 20);

        buttonGroup1.add(murderbutton);
        murderbutton.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        murderbutton.setForeground(new java.awt.Color(255, 255, 255));
        murderbutton.setText("MURDER");
        murderbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        murderbutton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                murderbuttonKeyPressed(evt);
            }
        });
        getContentPane().add(murderbutton);
        murderbutton.setBounds(30, 110, 140, 28);

        buttonGroup1.add(kidnappingbutton);
        kidnappingbutton.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        kidnappingbutton.setForeground(new java.awt.Color(255, 255, 255));
        kidnappingbutton.setText("KIDNAPPING");
        kidnappingbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kidnappingbutton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kidnappingbuttonKeyPressed(evt);
            }
        });
        getContentPane().add(kidnappingbutton);
        kidnappingbutton.setBounds(30, 140, 140, 28);

        buttonGroup1.add(narcoticcrimes);
        narcoticcrimes.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        narcoticcrimes.setForeground(new java.awt.Color(255, 255, 255));
        narcoticcrimes.setText("NARCOTIC CRIMES");
        narcoticcrimes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        narcoticcrimes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                narcoticcrimesKeyPressed(evt);
            }
        });
        getContentPane().add(narcoticcrimes);
        narcoticcrimes.setBounds(30, 170, 200, 28);

        closebutton.setBackground(new java.awt.Color(0, 0, 0));
        closebutton.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        closebutton.setForeground(new java.awt.Color(255, 255, 255));
        closebutton.setText("CLOSE FRAME");
        closebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(closebutton);
        closebutton.setBounds(340, 280, 130, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifes/crime.gif"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-3, 0, 540, 338);

        setSize(new java.awt.Dimension(552, 347));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void murderbuttonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_murderbuttonKeyPressed
        df = new DeathFrame();
        df.setVisible(true);
    }//GEN-LAST:event_murderbuttonKeyPressed

    private void kidnappingbuttonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kidnappingbuttonKeyPressed
       kf = new KidnappingFrame();
       kf.setVisible(true);
    }//GEN-LAST:event_kidnappingbuttonKeyPressed

    private void narcoticcrimesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_narcoticcrimesKeyPressed
        ncf = new NarcoticCrimesFrame();
        ncf.setVisible(true);
    }//GEN-LAST:event_narcoticcrimesKeyPressed

    private void closebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebuttonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closebuttonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int result = JOptionPane.showConfirmDialog(null,
            "Are you sure you want to exit the program ?\nIf you exit the program, your progress will be lost.", "Exit Confirmation: ",
            JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION)
          setDefaultCloseOperation(DrowningFrame.EXIT_ON_CLOSE);
        else if (result == JOptionPane.NO_OPTION)
          setDefaultCloseOperation(DrowningFrame.DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton closebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JRadioButton kidnappingbutton;
    private javax.swing.JRadioButton murderbutton;
    private javax.swing.JRadioButton narcoticcrimes;
    // End of variables declaration//GEN-END:variables
}