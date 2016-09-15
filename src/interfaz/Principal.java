/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import clases.Cuenta;
import javax.swing.JOptionPane;

/**
 *
 * @author hdomingu2
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
     Cuenta c;
    public Principal() {
        initComponents();
         cmdActualizarSaldo.setEnabled(false);
        cmdIngresar.setEnabled(false);
        cmdRetirar.setEnabled(false);
        cmdMostrar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmdCrearCuenta = new javax.swing.JButton();
        cmdIngresar = new javax.swing.JButton();
        cmdRetirar = new javax.swing.JButton();
        cmdActualizarSaldo = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        txtCuenta = new javax.swing.JTextField();
        txtSaldoInicial = new javax.swing.JTextField();
        txtInteresAnual = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrearCuenta.setText("Crear Cuenta");
        cmdCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearCuentaActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        cmdIngresar.setText("Ingresar");
        cmdIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 100, -1));

        cmdRetirar.setText("Retirar");
        cmdRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRetirarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 120, -1));

        cmdActualizarSaldo.setText("Actualizar Saldo");
        jPanel1.add(cmdActualizarSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 140, -1));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 110, 30));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 90, 30));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Ejercicio 5");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 160, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Cuenta :  ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Identificacion :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Saldo Inicial :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Interes Anual :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 120, -1));

        txtCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCuentaKeyTyped(evt);
            }
        });
        jPanel1.add(txtCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 120, -1));

        txtSaldoInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaldoInicialKeyTyped(evt);
            }
        });
        jPanel1.add(txtSaldoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 160, 120, -1));

        txtInteresAnual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInteresAnualKeyTyped(evt);
            }
        });
        jPanel1.add(txtInteresAnual, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 110, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setText("Resultado");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        txtArea.setEditable(false);
        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 290, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(540, 461));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        Cuenta cuen; 
         int cuenta,id;
        double saldo,interes,actualizado;
        cuenta = Integer.parseInt(txtCuenta.getText());
        id = Integer.parseInt(txtIdentificacion.getText());
        saldo = Double.parseDouble(txtSaldoInicial.getText()); 
        cuen = new Cuenta(cuenta, id, saldo);     
                txtArea.setText(cuen.mostrar());
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearCuentaActionPerformed
      if (txtCuenta.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite Su Número De Cuenta", "Error", JOptionPane.ERROR_MESSAGE);
            txtCuenta.requestFocusInWindow();
        } else if (txtIdentificacion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite El Numero De Identificacion Del Cliente",
                    "Error", JOptionPane.ERROR_MESSAGE);
            txtIdentificacion.requestFocusInWindow();
        } else if (Integer.parseInt(txtIdentificacion.getText().trim()) == 0) {
            JOptionPane.showMessageDialog(this, "La Identificacion No Puede Ser Cero", "Error", JOptionPane.ERROR_MESSAGE);
            txtIdentificacion.requestFocusInWindow();
            txtIdentificacion.selectAll();
        } else if (txtSaldoInicial.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite Saldo Actual de la cuenta",
                    "Error", JOptionPane.ERROR_MESSAGE);
            txtSaldoInicial.requestFocusInWindow();
        } else if (txtInteresAnual.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite Interes Anual Que Le Pondra A La Cuenta ", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            txtInteresAnual.requestFocusInWindow();
        }else{        
        cmdActualizarSaldo.setEnabled(true);
        cmdIngresar.setEnabled(true);
        cmdRetirar.setEnabled(true);
        cmdMostrar.setEnabled(true);
        txtSaldoInicial.setEditable(false);
        txtCuenta.setEditable(false);
        txtIdentificacion.setEditable(false);
        
        }
    }//GEN-LAST:event_cmdCrearCuentaActionPerformed

    private void cmdIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIngresarActionPerformed
        Cuenta cuen;
        int cuenta,identificacion;
        double ingresos,saldo,saldonuevo;
        
         cuenta = Integer.parseInt(txtCuenta.getText());
        identificacion = Integer.parseInt(txtIdentificacion.getText());
        saldo = Double.parseDouble(txtSaldoInicial.getText());
        cuen = new Cuenta(cuenta, identificacion, saldo);
        ingresos = Double.parseDouble(JOptionPane.showInputDialog(this, "Dinero a ingresar en la cuenta"));
        cuen.ingresar(ingresos);    
        txtArea.setText(cuen.mostrar());
    }//GEN-LAST:event_cmdIngresarActionPerformed

    private void cmdRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRetirarActionPerformed
          Cuenta cuen; 
        int cuenta,identificacion;
        double retirar,saldo;
         cuenta = Integer.parseInt(txtCuenta.getText());
        identificacion = Integer.parseInt(txtIdentificacion.getText());
        saldo = Double.parseDouble(txtSaldoInicial.getText());  
        cuen = new Cuenta(cuenta, identificacion, saldo);
         retirar = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite Cantidad De Dinero A Retirar"));
         if(retirar > saldo){
             JOptionPane.showMessageDialog(this,"Saldo insuficiente",
                     "Error",JOptionPane.ERROR_MESSAGE);
         }else{               
          cuen.retirar(retirar);
                txtArea.setText(cuen.mostrar ());
         } 
    }//GEN-LAST:event_cmdRetirarActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        cmdActualizarSaldo.setEnabled(false);
        cmdIngresar.setEnabled(false);
        cmdRetirar.setEnabled(false);
        txtSaldoInicial.setEditable(true);
        txtCuenta.setEditable(true);
        txtIdentificacion.setEditable(true);
        txtInteresAnual.setEditable(true);
        txtArea.setText("");
        txtCuenta.setText("");
        txtCuenta.requestFocusInWindow();
        txtIdentificacion.setText("");
        txtSaldoInicial.setText("");
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuentaKeyTyped
       char cuen=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar())) { 
              getToolkit().beep(); 
               
              evt.consume(); 
          }
    }//GEN-LAST:event_txtCuentaKeyTyped

    private void txtInteresAnualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInteresAnualKeyTyped
        char cuen = evt.getKeyChar();

        if ((!Character.isDigit(cuen)) && (evt.getKeyChar() != '.')) {
            getToolkit().beep();
            evt.consume();

        }
        if (evt.getKeyChar() == '.' && txtSaldoInicial.getText().contains(".")) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_txtInteresAnualKeyTyped

    private void txtSaldoInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaldoInicialKeyTyped
      char cuen=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar())) { 
              getToolkit().beep(); 
               
              evt.consume(); 
          }
    }//GEN-LAST:event_txtSaldoInicialKeyTyped

    private void txtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyTyped
       char cuen=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar())) { 
              getToolkit().beep(); 
               
              evt.consume(); 
          }
    }//GEN-LAST:event_txtIdentificacionKeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdActualizarSaldo;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCrearCuenta;
    private javax.swing.JButton cmdIngresar;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdRetirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtCuenta;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtInteresAnual;
    private javax.swing.JTextField txtSaldoInicial;
    // End of variables declaration//GEN-END:variables
}
