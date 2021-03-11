package com.mycompany.calcu_parcial;
// @author fsociety

public class Pantalla extends javax.swing.JFrame {

    private double numero1;
    private double numero2;
    private char operacion;
    private int shift = 0;

    public Pantalla() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void agregarTexto(String texto) {
        Ingreso.setText(Ingreso.getText() + texto);
    }

    private void seleccionarOperacion(char operacion) {
        numero1 = Double.parseDouble(Ingreso.getText());
        Ingreso.setText("");
        this.operacion = operacion;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton23 = new javax.swing.JButton();
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
        jButton22 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton28 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton29 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(400, 600));
        setMinimumSize(new java.awt.Dimension(400, 600));
        getContentPane().setLayout(null);

        jButton23.setText("Shift");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton23);
        jButton23.setBounds(20, 90, 80, 23);

        Ingreso.setEditable(false);
        Ingreso.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(Ingreso);
        Ingreso.setBounds(80, 20, 220, 50);

        jButton1.setText("^2");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 130, 60, 23);

        jButton2.setText("^1/2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(130, 130, 70, 23);

        jButton3.setText("CE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(200, 130, 60, 23);

        jButton4.setText("C");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(260, 130, 60, 23);

        jButton5.setText("2");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(110, 320, 50, 23);

        jButton6.setText("1");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(60, 320, 50, 23);

        jButton7.setText("3");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(160, 320, 50, 23);

        jButton8.setText("+");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(210, 320, 50, 23);

        jButton9.setText("-");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(260, 320, 50, 23);

        jButton10.setText("5");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(110, 370, 50, 23);

        jButton11.setText("4");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(60, 370, 50, 23);

        jButton12.setText("6");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(160, 370, 50, 23);

        jButton13.setText("*");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(210, 370, 50, 23);

        jButton14.setText("/");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(260, 370, 50, 23);

        jButton15.setText("8");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15);
        jButton15.setBounds(110, 410, 50, 23);

        jButton16.setText("7");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16);
        jButton16.setBounds(60, 410, 50, 23);

        jButton17.setText("9");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17);
        jButton17.setBounds(160, 410, 50, 23);

        jButton18.setText("0");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18);
        jButton18.setBounds(210, 410, 50, 23);

        jButton19.setText(".");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19);
        jButton19.setBounds(260, 410, 50, 23);

        jButton20.setText("+/-");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20);
        jButton20.setBounds(170, 500, 60, 23);

        jButton21.setText("=");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21);
        jButton21.setBounds(230, 500, 79, 23);

        jButton22.setText("x⁻¹");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22);
        jButton22.setBounds(20, 200, 64, 23);

        jLabel1.setText("tan⁻¹");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 180, 40, 15);

        jButton24.setText("x10×");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton24);
        jButton24.setBounds(84, 500, 90, 23);

        jLabel2.setText("^1/3");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 105, 30, 30);

        jLabel3.setText("π");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 480, 20, 15);

        jButton25.setText("log");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton25);
        jButton25.setBounds(80, 200, 60, 23);

        jLabel4.setText("e");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 180, 20, 15);

        jLabel5.setText("^");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 120, 34, 15);

        jButton26.setText("sin");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton26);
        jButton26.setBounds(140, 200, 60, 23);

        jLabel6.setText("x!");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 180, 20, 15);

        jButton27.setText("cos");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton27);
        jButton27.setBounds(200, 200, 60, 23);

        jLabel7.setText("sin⁻¹");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 180, 50, 15);

        jButton28.setText("tan");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton28);
        jButton28.setBounds(260, 200, 60, 23);

        jLabel8.setText("cos⁻¹");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(220, 180, 40, 15);

        jButton29.setText("\tΣ");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton29);
        jButton29.setBounds(10, 250, 70, 23);

        jLabel9.setText("Π");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 230, 10, 15);

        jButton30.setText("Pitagoras");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton30);
        jButton30.setBounds(80, 250, 120, 23);

        jLabel10.setText("nCr");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(270, 350, 40, 15);

        jLabel11.setText("nPr");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(220, 350, 40, 15);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Limpiar Pantalla
        Ingreso.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Limpiar todo 
        numero1 = 0;
        numero2 = 0;
        operacion = ' ';
        Ingreso.setText(" ");
        shift = 0;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //Boton #1
        agregarTexto("1");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Boton #2
        agregarTexto("2");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //Boton #3
        agregarTexto("3");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        //Botón 4
        agregarTexto("4");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //Boton 5
        agregarTexto("5");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        //Boton 6
        agregarTexto("6");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        //Boton 7
        agregarTexto("7");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        //Boton 8
        agregarTexto("8");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        //Boton 9
        agregarTexto("9");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        //Boton 0
        agregarTexto("0");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        //Boton +
        seleccionarOperacion('+');
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        //Boton -
        seleccionarOperacion('-');
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        //Boton * y nPr
        if (shift==1) {
         seleccionarOperacion('P');  
        }else{
        seleccionarOperacion('*');
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        
         //Boton / y nCr
        if (shift==1) {
         seleccionarOperacion('C');  
        }else{
        seleccionarOperacion('/');
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        //Boton .
        agregarTexto(".");
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // Boton -
        Ingreso.setText("-" + Ingreso.getText());
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        //Boton Igual
        numero2 = Double.parseDouble(Ingreso.getText());
        switch (operacion) {
            case '+':
                numero2 = numero1 + numero2;
                break;
            case '-':
                numero2 = numero1 - numero2;
                break;
            case '*':
                numero2 = numero1 * numero2;
                break;
            case '/':
                numero2 = numero1 / numero2;
                break;
            case '^':
                numero2 = Math.pow(numero1, numero2);
                break;
            case 'p':
                int total = 1;
                int n2 = (int) numero2;
                for (int i = (int) numero1; i <= n2; i++) {
                    total = total * i;
                }
               
                numero2 = total;
                break;

            case 'e':
                int acumulador = 0;
                int n = (int) numero2;
                for (int i = (int) numero1; i <= n; i++) {
                    acumulador += i;
                }
                
                numero2 = acumulador;
                break;
            case 'T':
               int igual;
               numero1*=numero1;
               numero2*=numero2;
               numero2=numero1+numero2;
               numero2=Math.sqrt(numero2);
                break;

            case 'P':
            numero2=numero1-numero2;
            
            Recursividad recursividad = new Recursividad();
            int factorial = recursividad.Factorial((int) numero1);
                System.out.println(factorial);
            
         
            Recursividad recursividad2 = new Recursividad();
            int factorial2 = recursividad2.Factorial((int) numero2);
                System.out.println(factorial2);
            
            
            numero2=factorial/factorial2;
                      
                break;
            
            case 'C':
            double numero3=numero2;
            numero2=numero1-numero2;
            
            Recursividad recursividad3 = new Recursividad();
            int factorial3 = recursividad3.Factorial((int) numero1);
                System.out.println(factorial3);
            
         
            Recursividad recursividad4 = new Recursividad();
            int factorial4 = recursividad4.Factorial((int) numero2);
                System.out.println(factorial4);
            
            Recursividad recursividad5= new Recursividad();
            int factorial5 = recursividad5.Factorial((int) numero3);
                System.out.println(factorial5);
            
            numero2=factorial3/(factorial4*factorial5);    
                break;
                
        }
        Ingreso.setText(String.valueOf(numero2));
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Elevación Cuadrado y elevación Normal
        if (shift == 1) {
            seleccionarOperacion('^');

        } else {
            numero1 = Double.parseDouble(Ingreso.getText());
            numero1 *= numero1;
            Ingreso.setText(String.valueOf(numero1));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Raíz Cuadrada y Cúbica
        if (shift == 1) {
            numero1 = Double.parseDouble(Ingreso.getText());
            numero1 = Math.cbrt(numero1);
            Ingreso.setText(String.valueOf(numero1));

            shift = 0;
        } else {
            numero1 = Double.parseDouble(Ingreso.getText());
            numero1 = Math.sqrt(numero1);
            Ingreso.setText(String.valueOf(numero1));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        //Inverso Multiplicativo y Factorial 
        if (shift == 1) {
            numero1 = Double.parseDouble(Ingreso.getText());
            Recursividad recursividad = new Recursividad();
            int factorial = recursividad.Factorial((int) numero1);
            Ingreso.setText(String.valueOf(factorial));
            shift = 0;
        } else {
            numero1 = Double.parseDouble(Ingreso.getText());
            numero1 = 1 / numero1;
            Ingreso.setText(String.valueOf(numero1));
        }

    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        //Potencia de 10 y Pi
        int base10 = 1;
        if (shift == 1) {
            Ingreso.setText("3.1416" + Ingreso.getText());
        } else {
            numero1 = Double.parseDouble(Ingreso.getText());
            for (int i = 0; i < numero1; i++) {
                base10 = base10 * 10;
            }
            Ingreso.setText(String.valueOf(base10));
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        //Shift
        shift = 1;
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        //Log y e
        if (shift == 1) {
            numero1 = Double.parseDouble(Ingreso.getText());
            numero1 = Math.pow(2.71828, numero1);
            Ingreso.setText(String.valueOf(numero1));
        } else {

            numero1 = Double.parseDouble(Ingreso.getText());
            numero1 = Math.log10(numero1);
            Ingreso.setText(String.valueOf(numero1));
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // Seno y Seno inverso
        if (shift == 1) {
            numero1 = Double.parseDouble(Ingreso.getText());
            numero1 = Math.asin(numero1);
            numero1 = Math.toDegrees(numero1);
            Ingreso.setText(String.valueOf(numero1));
        } else {
            numero1 = Double.parseDouble(Ingreso.getText());
            numero1 = Math.toRadians(numero1);
            numero1 = Math.sin(numero1);
            Ingreso.setText(String.valueOf(numero1));
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        //Coseno y Coseno inverso
        if (shift == 1) {
            numero1 = Double.parseDouble(Ingreso.getText());
            numero1 = Math.acos(numero1);
            numero1 = Math.toDegrees(numero1);
            Ingreso.setText(String.valueOf(numero1));
        } else {
            numero1 = Double.parseDouble(Ingreso.getText());
            numero1 = Math.toRadians(numero1);
            numero1 = Math.cos(numero1);
            Ingreso.setText(String.valueOf(numero1));
        }

    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // Tangente y tangente inversa
        if (shift == 1) {
            numero1 = Double.parseDouble(Ingreso.getText());
            numero1 = Math.atan(numero1);
            numero1 = Math.toDegrees(numero1);
            Ingreso.setText(String.valueOf(numero1));
        } else {
            numero1 = Double.parseDouble(Ingreso.getText());
            numero1 = Math.toRadians(numero1);
            numero1 = Math.tan(numero1);
            numero1 = Math.round(numero1);
            Ingreso.setText(String.valueOf(numero1));
        }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // Sumatoria y Productoria
        if (shift == 1) {
            seleccionarOperacion('p');
        } else {
            seleccionarOperacion('e');
        }

    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // Pitagoras y Factorial
       seleccionarOperacion('T');
           
    }//GEN-LAST:event_jButton30ActionPerformed


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
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
