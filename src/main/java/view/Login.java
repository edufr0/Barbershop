package view;

import controller.LoginController;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame {

    private final LoginController controller;

    public Login() {
        initComponents();
        setTitle("Login");
        setLocationRelativeTo(null);
        controller = new LoginController(this);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconUser = new javax.swing.JLabel();
        esqueciMinhaSenha = new javax.swing.JLabel();
        user_txt = new javax.swing.JLabel();
        pw_txt = new javax.swing.JLabel();
        login_txt = new javax.swing.JLabel();
        Senha = new javax.swing.JPasswordField();
        Usuario = new javax.swing.JTextField();
        text_desenvolvido = new javax.swing.JLabel();
        entrar_bt = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Login.this.mouseEntered(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_user_100px.png"))); // NOI18N
        getContentPane().add(iconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 400, 90));

        esqueciMinhaSenha.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        esqueciMinhaSenha.setForeground(new java.awt.Color(51, 51, 51));
        esqueciMinhaSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        esqueciMinhaSenha.setText("Esqueci minha senha");
        esqueciMinhaSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                esqueciMinhaSenhaMouseClicked(evt);
            }
        });
        getContentPane().add(esqueciMinhaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 440, -1, 20));

        user_txt.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        user_txt.setForeground(new java.awt.Color(51, 51, 51));
        user_txt.setText("Usuário");
        getContentPane().add(user_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 320, 30));

        pw_txt.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        pw_txt.setForeground(new java.awt.Color(51, 51, 51));
        pw_txt.setText("Senha");
        getContentPane().add(pw_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 320, 30));

        login_txt.setFont(new java.awt.Font("Berlin Sans FB", 0, 35)); // NOI18N
        login_txt.setForeground(new java.awt.Color(51, 51, 51));
        login_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_txt.setText("Login");
        getContentPane().add(login_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 400, -1));

        Senha.setBackground(new java.awt.Color(153, 153, 153));
        Senha.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        Senha.setForeground(new java.awt.Color(255, 210, 61));
        Senha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        Senha.setCaretColor(new java.awt.Color(153, 153, 153));
        Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaActionPerformed(evt);
            }
        });
        getContentPane().add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 320, 50));

        Usuario.setBackground(new java.awt.Color(153, 153, 153));
        Usuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 210, 61));
        Usuario.setBorder(null);
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 320, 50));

        text_desenvolvido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        text_desenvolvido.setText("Desenvolvido para Disciplina PRINT1");
        getContentPane().add(text_desenvolvido, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 810, -1, -1));

        entrar_bt.setBackground(new java.awt.Color(255, 210, 61));
        entrar_bt.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        entrar_bt.setText("Entrar");
        entrar_bt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        entrar_bt.setPreferredSize(new java.awt.Dimension(135, 37));
        entrar_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Login.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Login.this.mouseExited(evt);
            }
        });
        entrar_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrar_btActionPerformed(evt);
            }
        });
        getContentPane().add(entrar_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 130, 30));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginV2.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        
    }//GEN-LAST:event_UsuarioActionPerformed

    private void entrar_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrar_btActionPerformed
        controller.entrarNoSistema(Usuario.getText(), Senha.getText());
    }//GEN-LAST:event_entrar_btActionPerformed

    private void esqueciMinhaSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esqueciMinhaSenhaMouseClicked

    }//GEN-LAST:event_esqueciMinhaSenhaMouseClicked

    private void mouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEntered

    }//GEN-LAST:event_mouseEntered

    private void mouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExited
 
    }//GEN-LAST:event_mouseExited

    private void SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaActionPerformed

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
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    public JPasswordField Senha() {
        return Senha;
    }

    public void setSenha(JPasswordField getTextSenha) {
        this.Senha = getTextSenha;
    }

    public JTextField getUsuario() {
        return Usuario;
    }

    public void setUsuario(JTextField getTextUsuario) {
        this.Usuario = getTextUsuario;
    }
    
    public void message(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPasswordField Senha;
    public javax.swing.JTextField Usuario;
    private javax.swing.JLabel bg;
    private javax.swing.JButton entrar_bt;
    private javax.swing.JLabel esqueciMinhaSenha;
    private javax.swing.JLabel iconUser;
    private javax.swing.JLabel login_txt;
    private javax.swing.JLabel pw_txt;
    private javax.swing.JLabel text_desenvolvido;
    private javax.swing.JLabel user_txt;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String usuario_ou_senha_incorretos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
