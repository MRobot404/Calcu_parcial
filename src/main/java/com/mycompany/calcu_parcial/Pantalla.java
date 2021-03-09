package com.mycompany.calcu_parcial;
/* @author fsociety*/
public class Pantalla extends javax.swing.JFrame {

    public Pantalla() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ingreso = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(300, 500));
        setMinimumSize(new java.awt.Dimension(300, 500));
        getContentPane().setLayout(null);

        Ingreso.setEditable(false);
        Ingreso.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(Ingreso);
        Ingreso.setBounds(30, 40, 220, 50);

        jButton1.setText("^2");
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 140, 50, 25);

        jButton2.setText("^1/2");
        getContentPane().add(jButton2);
        jButton2.setBounds(90, 140, 60, 25);

        jButton3.setText("CE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(150, 140, 50, 25);

        jButton4.setText("C");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(200, 140, 50, 25);

        jButton5.setText("2");
        getContentPane().add(jButton5);
        jButton5.setBounds(70, 210, 50, 25);

        jButton6.setText("1");
        getContentPane().add(jButton6);
        jButton6.setBounds(20, 210, 50, 25);

        jButton7.setText("3");
        getContentPane().add(jButton7);
        jButton7.setBounds(120, 210, 50, 25);

        jButton8.setText("+");
        getContentPane().add(jButton8);
        jButton8.setBounds(170, 210, 50, 25);

        jButton9.setText("-");
        getContentPane().add(jButton9);
        jButton9.setBounds(220, 210, 50, 25);

        jButton10.setText("5");
        getContentPane().add(jButton10);
        jButton10.setBounds(70, 250, 50, 25);

        jButton11.setText("4");
        getContentPane().add(jButton11);
        jButton11.setBounds(20, 250, 50, 25);

        jButton12.setText("6");
        getContentPane().add(jButton12);
        jButton12.setBounds(120, 250, 50, 25);

        jButton13.setText("*");
        getContentPane().add(jButton13);
        jButton13.setBounds(170, 250, 50, 25);

        jButton14.setText("/");
        getContentPane().add(jButton14);
        jButton14.setBounds(220, 250, 50, 25);

        jButton15.setText("8");
        getContentPane().add(jButton15);
        jButton15.setBounds(70, 290, 50, 25);

        jButton16.setText("7");
        getContentPane().add(jButton16);
        jButton16.setBounds(20, 290, 50, 25);

        jButton17.setText("9");
        getContentPane().add(jButton17);
        jButton17.setBounds(120, 290, 50, 25);

        jButton18.setText("0");
        getContentPane().add(jButton18);
        jButton18.setBounds(170, 290, 50, 25);

        jButton19.setText(".");
        getContentPane().add(jButton19);
        jButton19.setBounds(220, 290, 50, 25);

        jButton20.setText("+/-");
        getContentPane().add(jButton20);
        jButton20.setBounds(70, 360, 60, 25);

        jButton21.setText("=");
        getContentPane().add(jButton21);
        jButton21.setBounds(130, 360, 79, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Limpiar Pantalla
        Ingreso.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ingreso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}
