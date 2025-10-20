package view;

import controller.MenuPrincipalController;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 * Classe que representa a tela principal do sistema
 * 
 * 
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private final MenuPrincipalController controller;

    public MenuPrincipal() {
        initComponents();
        setTitle("Menu Principal");
        setExtendedState(MAXIMIZED_BOTH);
        this.controller = new MenuPrincipalController(this);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textBemVindo = new javax.swing.JLabel();
        center = new javax.swing.JPanel();
        main = new javax.swing.JPanel();
        agendamentoTxt = new javax.swing.JLabel();
        addAgendamento = new javax.swing.JButton();
        editarAgendamento = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAgendamentos = new javax.swing.JTable();
        botaoLogout = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cadastroCliente = new javax.swing.JButton();
        cadastroBarbeiro = new javax.swing.JButton();
        cadastroServico = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textBemVindo.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        textBemVindo.setForeground(new java.awt.Color(255, 255, 255));
        textBemVindo.setText("Bem-Vindo,  @nomeUsuario!");
        getContentPane().add(textBemVindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 250, 100));

        center.setBackground(new java.awt.Color(245, 245, 245));
        center.setPreferredSize(new java.awt.Dimension(1680, 960));
        center.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main.setBackground(new java.awt.Color(245, 245, 245));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agendamentoTxt.setBackground(new java.awt.Color(51, 51, 51));
        agendamentoTxt.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        agendamentoTxt.setText("Agendamentos do dia");
        main.add(agendamentoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 260, 50));

        addAgendamento.setBackground(new java.awt.Color(255, 210, 61));
        addAgendamento.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        addAgendamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-soma-24.png"))); // NOI18N
        addAgendamento.setText("Novo");
        addAgendamento.setBorder(null);
        addAgendamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addAgendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuPrincipal.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuPrincipal.this.mouseExited(evt);
            }
        });
        addAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAgendamentoActionPerformed(evt);
            }
        });
        main.add(addAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 200, 50));

        editarAgendamento.setBackground(new java.awt.Color(255, 210, 61));
        editarAgendamento.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        editarAgendamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-alterar-24.png"))); // NOI18N
        editarAgendamento.setText("Alterar");
        editarAgendamento.setBorder(null);
        editarAgendamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editarAgendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuPrincipal.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuPrincipal.this.mouseExited(evt);
            }
        });
        editarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarAgendamentoActionPerformed(evt);
            }
        });
        main.add(editarAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 200, 50));

        TableAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cliente", "Serviço", "Valor", "Data", "Hora", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableAgendamentos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TableAgendamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(TableAgendamentos);
        if (TableAgendamentos.getColumnModel().getColumnCount() > 0) {
            TableAgendamentos.getColumnModel().getColumn(0).setResizable(false);
            TableAgendamentos.getColumnModel().getColumn(1).setResizable(false);
            TableAgendamentos.getColumnModel().getColumn(2).setResizable(false);
            TableAgendamentos.getColumnModel().getColumn(3).setResizable(false);
            TableAgendamentos.getColumnModel().getColumn(4).setResizable(false);
            TableAgendamentos.getColumnModel().getColumn(5).setResizable(false);
            TableAgendamentos.getColumnModel().getColumn(6).setResizable(false);
        }

        main.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 930, 400));

        botaoLogout.setBackground(new java.awt.Color(255, 210, 61));
        botaoLogout.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        botaoLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-logout-arredondado-para-baixo-24.png"))); // NOI18N
        botaoLogout.setText("Logout");
        botaoLogout.setBorder(null);
        botaoLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuPrincipal.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuPrincipal.this.mouseExited(evt);
            }
        });
        botaoLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLogoutActionPerformed(evt);
            }
        });
        main.add(botaoLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 600, 150, 40));

        botaoSair.setBackground(new java.awt.Color(255, 210, 61));
        botaoSair.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        botaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/icons8-sair-24.png"))); // NOI18N
        botaoSair.setText("Sair");
        botaoSair.setBorder(null);
        botaoSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuPrincipal.this.mouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuPrincipal.this.mouseExited(evt);
            }
        });
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        main.add(botaoSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 600, 150, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/footer.png"))); // NOI18N
        main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 580, 1080, 80));

        center.add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 765));

        getContentPane().add(center, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1190, 770));

        cadastroCliente.setBackground(new java.awt.Color(255, 210, 61));
        cadastroCliente.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        cadastroCliente.setText("Cliente");
        cadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroClienteActionPerformed(evt);
            }
        });
        getContentPane().add(cadastroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 110, 40));

        cadastroBarbeiro.setBackground(new java.awt.Color(255, 210, 61));
        cadastroBarbeiro.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        cadastroBarbeiro.setText("Barbeiro");
        cadastroBarbeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroBarbeiroActionPerformed(evt);
            }
        });
        getContentPane().add(cadastroBarbeiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 110, 40));

        cadastroServico.setBackground(new java.awt.Color(255, 210, 61));
        cadastroServico.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        cadastroServico.setText("Serviço");
        cadastroServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroServicoActionPerformed(evt);
            }
        });
        getContentPane().add(cadastroServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 110, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gerenciamento");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lateral.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseEntered
    }//GEN-LAST:event_mouseEntered

    private void mouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExited
    }//GEN-LAST:event_mouseExited

    private void cadastroServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroServicoActionPerformed

    private void cadastroBarbeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroBarbeiroActionPerformed
        this.controller.actionPerformed(evt);
    }//GEN-LAST:event_cadastroBarbeiroActionPerformed

    private void cadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroClienteActionPerformed
        this.controller.actionPerformed(evt);
    }//GEN-LAST:event_cadastroClienteActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        this.controller.actionPerformed(evt);
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLogoutActionPerformed
        this.controller.actionPerformed(evt);
    }//GEN-LAST:event_botaoLogoutActionPerformed

    private void addAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAgendamentoActionPerformed
        this.controller.actionPerformed(evt);
    }//GEN-LAST:event_addAgendamentoActionPerformed

    private void editarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarAgendamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarAgendamentoActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableAgendamentos;
    private javax.swing.JButton addAgendamento;
    private javax.swing.JLabel agendamentoTxt;
    private javax.swing.JButton botaoLogout;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton cadastroBarbeiro;
    private javax.swing.JButton cadastroCliente;
    private javax.swing.JButton cadastroServico;
    private javax.swing.JPanel center;
    private javax.swing.JButton editarAgendamento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel main;
    private javax.swing.JLabel textBemVindo;
    // End of variables declaration//GEN-END:variables

    public JButton getAddAgendamento() {
        return addAgendamento;
    }

    public void setAddAgendamento(JButton addAgendamento) {
        this.addAgendamento = addAgendamento;
    }

    public JLabel getAgendamentoTxt() {
        return agendamentoTxt;
    }

    public void setAgendamentoTxt(JLabel agendamentoTxt) {
        this.agendamentoTxt = agendamentoTxt;
    }

    public JButton getBotaoLogout() {
        return botaoLogout;
    }

    public void setBotaoLogout(JButton botaoLogout) {
        this.botaoLogout = botaoLogout;
    }

    public JButton getBotaoSair() {
        return botaoSair;
    }

    public void setBotaoSair(JButton botaoSair) {
        this.botaoSair = botaoSair;
    }

    public JButton getCadastroBarbeiro() {
        return cadastroBarbeiro;
    }

    public void setCadastroBarbeiro(JButton cadastroBarbeiro) {
        this.cadastroBarbeiro = cadastroBarbeiro;
    }

    public JButton getCadastroCliente() {
        return cadastroCliente;
    }

    public void setCadastroCliente(JButton cadastroCliente) {
        this.cadastroCliente = cadastroCliente;
    }

    public JButton getCadastroServico() {
        return cadastroServico;
    }

    public void setCadastroServico(JButton cadastroServico) {
        this.cadastroServico = cadastroServico;
    }

    public JButton getEditarAgendamento() {
        return editarAgendamento;
    }

    public void setEditarAgendamento(JButton editarAgendamento) {
        this.editarAgendamento = editarAgendamento;
    }

    public JLabel getTextBemVindo() {
        return textBemVindo;
    }

    public void setTextBemVindo(JLabel textBemVindo) {
        this.textBemVindo = textBemVindo;
    }

    public JTable getTableAgendamentos() {
        return TableAgendamentos;
    }

    public void setTableAgendamentos(JTable TableAgendamentos) {
        this.TableAgendamentos = TableAgendamentos;
    }
    


}
