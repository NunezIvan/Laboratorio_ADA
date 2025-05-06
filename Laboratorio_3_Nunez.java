/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.src.laboratorio_3_nunez;

/**
 *
 * @author IVAN
 */
public class Laboratorio_3_Nunez extends javax.swing.JFrame {
    
    private String operador = "";
    private String comando = "";
    private int numero1 = 0;
    
    public Laboratorio_3_Nunez() {
        initComponents();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pantalla = new javax.swing.JTextField();
        One_Button = new javax.swing.JButton();
        Two_Button = new javax.swing.JButton();
        Three_Button = new javax.swing.JButton();
        Four_Button = new javax.swing.JButton();
        Five_Button = new javax.swing.JButton();
        Six_Button = new javax.swing.JButton();
        Seven_Button = new javax.swing.JButton();
        Eight_Button = new javax.swing.JButton();
        Nine_Button = new javax.swing.JButton();
        Zero_Button = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();
        Plus_Button = new javax.swing.JButton();
        Minus_Button = new javax.swing.JButton();
        Multiplication_Button = new javax.swing.JButton();
        Division_Button = new javax.swing.JButton();
        C_Button = new javax.swing.JButton();
        CE_Button = new javax.swing.JButton();
        Elevation_Button = new javax.swing.JButton();
        Factorial_Button = new javax.swing.JButton();
        Equal_Button = new javax.swing.JButton();

        jButton8.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(560, 378));
        setMinimumSize(new java.awt.Dimension(560, 378));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(560, 378));
        jPanel1.setMinimumSize(new java.awt.Dimension(560, 378));

        pantalla.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        pantalla.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        pantalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pantalla.setFocusable(false);
        pantalla.setMargin(new java.awt.Insets(3, 6, 3, 6));
        pantalla.setMaximumSize(new java.awt.Dimension(64, 27));

        One_Button.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        One_Button.setText("1");
        One_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                One_ButtonActionPerformed(evt);
            }
        });

        Two_Button.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        Two_Button.setText("2");
        Two_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Two_ButtonActionPerformed(evt);
            }
        });

        Three_Button.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        Three_Button.setText("3");
        Three_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Three_ButtonActionPerformed(evt);
            }
        });

        Four_Button.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        Four_Button.setText("4");
        Four_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Four_ButtonActionPerformed(evt);
            }
        });

        Five_Button.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        Five_Button.setText("5");
        Five_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Five_ButtonActionPerformed(evt);
            }
        });

        Six_Button.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        Six_Button.setText("6");
        Six_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Six_ButtonActionPerformed(evt);
            }
        });

        Seven_Button.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        Seven_Button.setText("7");
        Seven_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seven_ButtonActionPerformed(evt);
            }
        });

        Eight_Button.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        Eight_Button.setText("8");
        Eight_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eight_ButtonActionPerformed(evt);
            }
        });

        Nine_Button.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        Nine_Button.setText("9");
        Nine_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nine_ButtonActionPerformed(evt);
            }
        });

        Zero_Button.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        Zero_Button.setText("0");
        Zero_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Zero_ButtonActionPerformed(evt);
            }
        });

        Back_Button.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        Back_Button.setText("Back");
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        Plus_Button.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        Plus_Button.setText("+");
        Plus_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Plus_ButtonActionPerformed(evt);
            }
        });

        Minus_Button.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        Minus_Button.setText("-");
        Minus_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Minus_ButtonActionPerformed(evt);
            }
        });

        Multiplication_Button.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        Multiplication_Button.setText("*");
        Multiplication_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Multiplication_ButtonActionPerformed(evt);
            }
        });

        Division_Button.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        Division_Button.setText("/");
        Division_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Division_ButtonActionPerformed(evt);
            }
        });

        C_Button.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        C_Button.setText("C");
        C_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_ButtonActionPerformed(evt);
            }
        });

        CE_Button.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        CE_Button.setText("CE");
        CE_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CE_ButtonActionPerformed(evt);
            }
        });

        Elevation_Button.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        Elevation_Button.setText("^");
        Elevation_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Elevation_ButtonActionPerformed(evt);
            }
        });

        Factorial_Button.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        Factorial_Button.setText("!");
        Factorial_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Factorial_ButtonActionPerformed(evt);
            }
        });

        Equal_Button.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        Equal_Button.setText("=");
        Equal_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Equal_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pantalla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Four_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Five_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Six_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Zero_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Back_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Seven_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Eight_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Nine_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(One_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Two_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Three_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Elevation_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Factorial_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(C_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CE_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Equal_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Minus_Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Plus_Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Multiplication_Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Division_Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(One_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Two_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Three_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Plus_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CE_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Four_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Five_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Six_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Minus_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Elevation_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Factorial_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Seven_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eight_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nine_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Multiplication_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Equal_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Zero_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Division_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void One_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_One_ButtonActionPerformed
        comando = "1";
        buttons(comando);
    }//GEN-LAST:event_One_ButtonActionPerformed

    private void Two_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Two_ButtonActionPerformed
        comando = "2";
        buttons(comando);
    }//GEN-LAST:event_Two_ButtonActionPerformed

    private void Three_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Three_ButtonActionPerformed
        comando = "3";
        buttons(comando);
    }//GEN-LAST:event_Three_ButtonActionPerformed

    private void Four_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Four_ButtonActionPerformed
        comando = "4";
        buttons(comando);
    }//GEN-LAST:event_Four_ButtonActionPerformed

    private void Five_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Five_ButtonActionPerformed
        comando = "5";
        buttons(comando);
    }//GEN-LAST:event_Five_ButtonActionPerformed

    private void Six_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Six_ButtonActionPerformed
        comando = "6";
        buttons(comando);
    }//GEN-LAST:event_Six_ButtonActionPerformed

    private void Seven_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seven_ButtonActionPerformed
        comando = "7";
        buttons(comando);
    }//GEN-LAST:event_Seven_ButtonActionPerformed

    private void Eight_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eight_ButtonActionPerformed
        comando = "8";
        buttons(comando);
    }//GEN-LAST:event_Eight_ButtonActionPerformed

    private void Nine_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nine_ButtonActionPerformed
        comando = "9";
        buttons(comando);
    }//GEN-LAST:event_Nine_ButtonActionPerformed

    private void Zero_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Zero_ButtonActionPerformed
        comando = "0";
        buttons(comando);
    }//GEN-LAST:event_Zero_ButtonActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        comando = "Back";
        buttons(comando);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void C_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_ButtonActionPerformed
        comando = "C";
        buttons(comando);
    }//GEN-LAST:event_C_ButtonActionPerformed

    private void CE_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CE_ButtonActionPerformed
        comando = "CE";
        buttons(comando);
    }//GEN-LAST:event_CE_ButtonActionPerformed

    private void Elevation_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Elevation_ButtonActionPerformed
        comando = "^";
        buttons(comando);
    }//GEN-LAST:event_Elevation_ButtonActionPerformed

    private void Factorial_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Factorial_ButtonActionPerformed
        comando = "!";
        buttons(comando);
    }//GEN-LAST:event_Factorial_ButtonActionPerformed

    private void Equal_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Equal_ButtonActionPerformed
        comando = "=";
        buttons(comando);
    }//GEN-LAST:event_Equal_ButtonActionPerformed

    private void Plus_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Plus_ButtonActionPerformed
        comando = "+";
        buttons(comando);
    }//GEN-LAST:event_Plus_ButtonActionPerformed

    private void Minus_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Minus_ButtonActionPerformed
        comando = "-";
        buttons(comando);
    }//GEN-LAST:event_Minus_ButtonActionPerformed

    private void Multiplication_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Multiplication_ButtonActionPerformed
        comando = "*";
        buttons(comando);
    }//GEN-LAST:event_Multiplication_ButtonActionPerformed

    private void Division_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Division_ButtonActionPerformed
        comando = "/";
        buttons(comando);
    }//GEN-LAST:event_Division_ButtonActionPerformed

    // Métodos recursivos

    private int suma(int a, int b) { // Complejidad temporal: O(b)
        if (b == 0) return a;
        return suma(a + 1, b - 1);
    }

    private int resta(int a, int b) { // Complejidad temporal: O(b)
        if (b == 0) return a;
        return resta(a - 1, b - 1);
    }

    private int multiplicacion(int a, int b) { // Complejidad temporal: O(b)
        if (b == 0) return 0;
        return a + multiplicacion(a, b - 1);
    }

    private int division(int a, int b) { // Complejidad temporal: O(a/b)
        if (b == 0) throw new ArithmeticException("División por cero");
        if (a < b) return 0;
        return 1 + division(a - b, b);
    }

    private int potencia(int a, int b) { // Complejidad temporal: O(b)
        if (b == 0) return 1;
        return a * potencia(a, b - 1);
    }

    private int factorial(int n) { //Complejidad temporal: O(n)
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    
    private void buttons(String comando){
         if (comando.matches("[0-9]")) {
                pantalla.setText(pantalla.getText() + comando);
            } else if (comando.equals("C")) {
                pantalla.setText("");
                operador = "";
                numero1 = 0;
            } else if (comando.equals("Back")) {
                String texto = pantalla.getText();
                if (!texto.isEmpty())
                    pantalla.setText(texto.substring(0, texto.length() - 1));
            } else if (comando.equals("=")) {
                int numero2 = Integer.parseInt(pantalla.getText());
                int resultado = 0;
                switch (operador) {
                    case "+" -> resultado = suma(numero1, numero2);
                    case "-" -> resultado = resta(numero1, numero2);
                    case "*" -> resultado = multiplicacion(numero1, numero2);
                    case "/" -> resultado = division(numero1, numero2);
                    case "^" -> resultado = potencia(numero1, numero2);
                }
                pantalla.setText(String.valueOf(resultado));
                operador = "";
            } else if (comando.equals("!")) {
                int num = Integer.parseInt(pantalla.getText());
                pantalla.setText(String.valueOf(factorial(num)));
            } else if (comando.equals("CE")) {
                pantalla.setText("");
            } else {
                operador = comando;
                numero1 = Integer.parseInt(pantalla.getText());
                pantalla.setText("");
            }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laboratorio_3_Nunez().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JButton CE_Button;
    private javax.swing.JButton C_Button;
    private javax.swing.JButton Division_Button;
    private javax.swing.JButton Eight_Button;
    private javax.swing.JButton Elevation_Button;
    private javax.swing.JButton Equal_Button;
    private javax.swing.JButton Factorial_Button;
    private javax.swing.JButton Five_Button;
    private javax.swing.JButton Four_Button;
    private javax.swing.JButton Minus_Button;
    private javax.swing.JButton Multiplication_Button;
    private javax.swing.JButton Nine_Button;
    private javax.swing.JButton One_Button;
    private javax.swing.JButton Plus_Button;
    private javax.swing.JButton Seven_Button;
    private javax.swing.JButton Six_Button;
    private javax.swing.JButton Three_Button;
    private javax.swing.JButton Two_Button;
    private javax.swing.JButton Zero_Button;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pantalla;
    // End of variables declaration//GEN-END:variables
}
