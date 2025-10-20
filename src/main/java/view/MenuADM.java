
package view;

import controller.MenuADMController;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MenuADM extends javax.swing.JFrame {

    private final MenuADMController controller;
    
    public MenuADM() {
        initComponents();
        setTitle("Menu Administração");
        setLocationRelativeTo(null);
        this.controller = new MenuADMController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        MenuItemCliente = new javax.swing.JMenuItem();
        MenuItemServico = new javax.swing.JMenuItem();
        MenuItemUsuario = new javax.swing.JMenuItem();
        MenuItemBarbeiro = new javax.swing.JMenuItem();
        MenuOperacao = new javax.swing.JMenu();
        MenuItemAgenda = new javax.swing.JMenuItem();
        MenuRelatorio = new javax.swing.JMenu();
        MenuItemRelatorio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base.png"))); // NOI18N

        MenuCadastro.setText("  Cadastro  ");
        MenuCadastro.setToolTipText("");
        MenuCadastro.setActionCommand("Cadastro  ");
        MenuCadastro.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N

        MenuItemCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        MenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/cliente32-icon.png"))); // NOI18N
        MenuItemCliente.setText("  Cliente");
        MenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemClienteActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuItemCliente);

        MenuItemServico.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        MenuItemServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/tesoura32-icon.png"))); // NOI18N
        MenuItemServico.setText("  Serviço");
        MenuItemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemServicoActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuItemServico);

        MenuItemUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        MenuItemUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/usuario32-icon.png"))); // NOI18N
        MenuItemUsuario.setText("  Usuario");
        MenuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemUsuarioActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuItemUsuario);

        MenuItemBarbeiro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        MenuItemBarbeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/cliente32-icon.png"))); // NOI18N
        MenuItemBarbeiro.setText("Barbeiro");
        MenuItemBarbeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemBarbeiroActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuItemBarbeiro);

        jMenuBar1.add(MenuCadastro);

        MenuOperacao.setText("  Operação  ");
        MenuOperacao.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N

        MenuItemAgenda.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        MenuItemAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/agenda32-icon.png"))); // NOI18N
        MenuItemAgenda.setText("  Agendar");
        MenuItemAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAgendaActionPerformed(evt);
            }
        });
        MenuOperacao.add(MenuItemAgenda);

        jMenuBar1.add(MenuOperacao);

        MenuRelatorio.setText("  Relatório  ");
        MenuRelatorio.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N

        MenuItemRelatorio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        MenuItemRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/relatorioTrabalho32-icon.png"))); // NOI18N
        MenuItemRelatorio.setText("  Trabalho");
        MenuItemRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemRelatorioActionPerformed(evt);
            }
        });
        MenuRelatorio.add(MenuItemRelatorio);

        jMenuBar1.add(MenuRelatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemClienteActionPerformed
        this.controller.actionPerformed(evt);
    }//GEN-LAST:event_MenuItemClienteActionPerformed

    private void MenuItemAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAgendaActionPerformed
        this.controller.actionPerformed(evt);
    }//GEN-LAST:event_MenuItemAgendaActionPerformed

    private void MenuItemRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemRelatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemRelatorioActionPerformed

    private void MenuItemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemServicoActionPerformed
        this.controller.actionPerformed(evt);
    }//GEN-LAST:event_MenuItemServicoActionPerformed

    private void MenuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemUsuarioActionPerformed
        this.controller.actionPerformed(evt);
    }//GEN-LAST:event_MenuItemUsuarioActionPerformed

    private void MenuItemBarbeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemBarbeiroActionPerformed
        this.controller.actionPerformed(evt);
    }//GEN-LAST:event_MenuItemBarbeiroActionPerformed

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
            java.util.logging.Logger.getLogger(MenuADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuADM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenuItem MenuItemAgenda;
    private javax.swing.JMenuItem MenuItemBarbeiro;
    private javax.swing.JMenuItem MenuItemCliente;
    private javax.swing.JMenuItem MenuItemRelatorio;
    private javax.swing.JMenuItem MenuItemServico;
    private javax.swing.JMenuItem MenuItemUsuario;
    private javax.swing.JMenu MenuOperacao;
    private javax.swing.JMenu MenuRelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    public JMenu getMenuCadastro() {
        return MenuCadastro;
    }

    public void setMenuCadastro(JMenu MenuCadastro) {
        this.MenuCadastro = MenuCadastro;
    }

    public JMenuItem getMenuItemAgenda() {
        return MenuItemAgenda;
    }

    public void setMenuItemAgenda(JMenuItem MenuItemAgenda) {
        this.MenuItemAgenda = MenuItemAgenda;
    }

    public JMenuItem getMenuItemBarbeiro() {
        return MenuItemBarbeiro;
    }

    public void setMenuItemBarbeiro(JMenuItem MenuItemBarbeiro) {
        this.MenuItemBarbeiro = MenuItemBarbeiro;
    }

    public JMenuItem getMenuItemCliente() {
        return MenuItemCliente;
    }

    public void setMenuItemCliente(JMenuItem MenuItemCliente) {
        this.MenuItemCliente = MenuItemCliente;
    }

    public JMenuItem getMenuItemRelatorio() {
        return MenuItemRelatorio;
    }

    public void setMenuItemRelatorio(JMenuItem MenuItemRelatorio) {
        this.MenuItemRelatorio = MenuItemRelatorio;
    }

    public JMenuItem getMenuItemServico() {
        return MenuItemServico;
    }

    public void setMenuItemServico(JMenuItem MenuItemServico) {
        this.MenuItemServico = MenuItemServico;
    }

    public JMenuItem getMenuItemUsuario() {
        return MenuItemUsuario;
    }

    public void setMenuItemUsuario(JMenuItem MenuItemUsuario) {
        this.MenuItemUsuario = MenuItemUsuario;
    }

    public JMenu getMenuOperacao() {
        return MenuOperacao;
    }

    public void setMenuOperacao(JMenu MenuOperacao) {
        this.MenuOperacao = MenuOperacao;
    }

    public JMenu getMenuRelatorio() {
        return MenuRelatorio;
    }

    public void setMenuRelatorio(JMenu MenuRelatorio) {
        this.MenuRelatorio = MenuRelatorio;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public void setjMenuBar1(JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    
    
    
}