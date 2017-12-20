/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import medicontact.loginInfo;
/**
 *
 * @author grm-5
 */
public class Login extends javax.swing.JFrame {

    private String user;
    private String password;
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUser = new javax.swing.JLabel();
        JButtonExit = new javax.swing.JButton();
        LabelName = new javax.swing.JLabel();
        LabelUser = new javax.swing.JLabel();
        LabelPass = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jButtonRegister = new javax.swing.JButton();
        jButtonLogin = new javax.swing.JButton();
        jLabelBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 500, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N
        getContentPane().add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 210, 280));

        JButtonExit.setBackground(new java.awt.Color(153, 153, 255));
        JButtonExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JButtonExit.setText("Exit");
        JButtonExit.setToolTipText("");
        JButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 60, 30));

        LabelName.setFont(new java.awt.Font("Bauhaus 93", 0, 48)); // NOI18N
        LabelName.setForeground(new java.awt.Color(204, 204, 255));
        LabelName.setText("MediContact");
        getContentPane().add(LabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 330, 170));

        LabelUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelUser.setText("User:");
        LabelUser.setToolTipText("");
        getContentPane().add(LabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 100, 20));

        LabelPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelPass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelPass.setText("Password:");
        getContentPane().add(LabelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 100, 20));

        jPasswordField1.setText("Password");
        jPasswordField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 435, 260, 30));

        jTextField1.setText("Username");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 385, 260, 30));

        jButtonRegister.setBackground(new java.awt.Color(102, 102, 255));
        jButtonRegister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonRegister.setText("Register");
        jButtonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegisterMouseClicked(evt);
            }
        });
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 160, 40));

        jButtonLogin.setBackground(new java.awt.Color(102, 102, 255));
        jButtonLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonLogin.setText("Login");
        jButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLoginMouseClicked(evt);
            }
        });
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 160, 40));

        jLabelBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jLabelBack.setToolTipText("");
        jLabelBack.setPreferredSize(new java.awt.Dimension(500, 600));
        getContentPane().add(jLabelBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonExitActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonExitActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jButtonRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegisterMouseClicked
        this.setVisible(false);
        new Register().setVisible(true);
    }//GEN-LAST:event_jButtonRegisterMouseClicked

    private void jButtonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginMouseClicked
        loginInfo user = null;
        FileInputStream fileIn;
        
        String username = jTextField1.getText();
        char[] password = jPasswordField1.getPassword();
        String pass = new String(password);
        String u = user.getUser();
        String p = user.getPassword();
        
        try {
         fileIn = new FileInputStream("C://test/user.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         user = (loginInfo) in.readObject();
         in.close();
         fileIn.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(u == username){
            if (p == pass){
                JOptionPane.showMessageDialog(null, "Accediendo");
            }
            else{
               JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña incorrecta");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña incorrecta");
        }
    
    }//GEN-LAST:event_jButtonLoginMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonExit;
    private javax.swing.JLabel LabelName;
    private javax.swing.JLabel LabelPass;
    private javax.swing.JLabel LabelUser;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
