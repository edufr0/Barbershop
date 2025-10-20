
package view;

import controller.RegisterUserController;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class NewUser extends javax.swing.JDialog {

    private final RegisterUserController controller;

    public NewUser(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Cadastro de Usuario");
        controller = new RegisterUserController(this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario = new javax.swing.JLabel();
        cancelRegisterUserButton = new javax.swing.JButton();
        registerUserButton = new javax.swing.JButton();
        usuarioConfirm = new javax.swing.JLabel();
        userPasswordConfirm = new javax.swing.JPasswordField();
        userName1 = new javax.swing.JTextField();
        userPassword1 = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        senha = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        senhaConfirm = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 210, 61));
        usuario.setText("Nome de usuário:");
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 430, 30));

        cancelRegisterUserButton.setBackground(new java.awt.Color(255, 210, 61));
        cancelRegisterUserButton.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        cancelRegisterUserButton.setText("Cancelar");
        cancelRegisterUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelRegisterUserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelRegisterUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 140, 40));

        registerUserButton.setBackground(new java.awt.Color(255, 210, 61));
        registerUserButton.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        registerUserButton.setText("Cadastrar");
        registerUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerUserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(registerUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 140, 40));

        usuarioConfirm.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        usuarioConfirm.setForeground(new java.awt.Color(255, 210, 61));
        usuarioConfirm.setText("Nível de acesso:");
        getContentPane().add(usuarioConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 430, 30));

        userPasswordConfirm.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        userPasswordConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPasswordConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(userPasswordConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 440, 40));

        userName1.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        userName1.setMinimumSize(new java.awt.Dimension(6, 20));
        userName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userName1ActionPerformed(evt);
            }
        });
        getContentPane().add(userName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 440, 40));

        userPassword1.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        getContentPane().add(userPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 440, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Atendente", "Barbeiro" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 440, 40));

        senha.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        senha.setForeground(new java.awt.Color(255, 210, 61));
        senha.setText("Senha:");
        getContentPane().add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 430, 30));

        titulo.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Cadastro de Usuário");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 240, 30));

        senhaConfirm.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        senhaConfirm.setForeground(new java.awt.Color(255, 210, 61));
        senhaConfirm.setText("Confirme sua senha:");
        getContentPane().add(senhaConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 430, 30));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/corUnica.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 590));

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userName1ActionPerformed

    private void registerUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerUserButtonActionPerformed
        this.controller.actionPerformed(evt);
    }//GEN-LAST:event_registerUserButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void userPasswordConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPasswordConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPasswordConfirmActionPerformed

    private void cancelRegisterUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelRegisterUserButtonActionPerformed
        this.controller.actionPerformed(evt);
    }//GEN-LAST:event_cancelRegisterUserButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                NewUser dialog = new NewUser(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public JButton getCancelRegisterUserButton() {
        return cancelRegisterUserButton;
    }

    public void setCancelRegisterUserButton(JButton cancelRegisterUserButton) {
        this.cancelRegisterUserButton = cancelRegisterUserButton;
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    public JButton getRegisterUserButton() {
        return registerUserButton;
    }

    public void setRegisterUserButton(JButton registerUserButton) {
        this.registerUserButton = registerUserButton;
    }

    public JTextField getUserName1() {
        return userName1;
    }

    public void setUserName1(JTextField userName1) {
        this.userName1 = userName1;
    }

    public JPasswordField getUserPassword1() {
        return userPassword1;
    }

    public void setUserPassword1(JPasswordField userPassword1) {
        this.userPassword1 = userPassword1;
    }

    public JPasswordField getUserPasswordConfirm() {
        return userPasswordConfirm;
    }

    public void setUserPasswordConfirm(JPasswordField userPasswordConfirm) {
        this.userPasswordConfirm = userPasswordConfirm;
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton cancelRegisterUserButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JButton registerUserButton;
    private javax.swing.JLabel senha;
    private javax.swing.JLabel senhaConfirm;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField userName1;
    private javax.swing.JPasswordField userPassword1;
    private javax.swing.JPasswordField userPasswordConfirm;
    private javax.swing.JLabel usuario;
    private javax.swing.JLabel usuarioConfirm;
    // End of variables declaration//GEN-END:variables

    
 
}
