package view;

import controller.RegisterBarbeiroController;
import controller.RegisterUserController;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class RegistrarBarbeiro extends javax.swing.JDialog {
    
    private final RegisterUserController controller;

    public RegistrarBarbeiro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Cadastro de Barbeiro");
        setLocationRelativeTo(null);
        this.controller = new RegisterBarbeiroController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idTxt = new javax.swing.JLabel();
        id_tf = new javax.swing.JTextField();
        nameTxt = new javax.swing.JLabel();
        nameJtf = new javax.swing.JTextField();
        rgTxt = new javax.swing.JLabel();
        RGjtf = new javax.swing.JTextField();
        cpfTxt = new javax.swing.JLabel();
        CPFjtf = new javax.swing.JTextField();
        dtTxt = new javax.swing.JLabel();
        dataFtf = new javax.swing.JFormattedTextField();
        sexoTxt = new javax.swing.JLabel();
        maleRb = new javax.swing.JRadioButton();
        feminineRb = new javax.swing.JRadioButton();
        emailTxt = new javax.swing.JLabel();
        emailJtf = new javax.swing.JTextField();
        foneTxt = new javax.swing.JLabel();
        foneJtf = new javax.swing.JTextField();
        adressTxt = new javax.swing.JLabel();
        adressJtf = new javax.swing.JTextField();
        cepTxt = new javax.swing.JLabel();
        CEPjtf = new javax.swing.JTextField();
        estadoTxt = new javax.swing.JLabel();
        countryStateJtf = new javax.swing.JComboBox<>();
        registerButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        sp1 = new javax.swing.JSeparator();
        sp2 = new javax.swing.JSeparator();
        sp3 = new javax.swing.JSeparator();
        tituloTxt = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idTxt.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        idTxt.setForeground(new java.awt.Color(255, 210, 61));
        idTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        idTxt.setText("ID");
        getContentPane().add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 140, 40));

        id_tf.setEditable(false);
        id_tf.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        id_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_tfActionPerformed(evt);
            }
        });
        getContentPane().add(id_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 100, 40));

        nameTxt.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(255, 210, 61));
        nameTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameTxt.setText("Nome completo*");
        getContentPane().add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 170, 40));
        getContentPane().add(nameJtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 520, 40));

        rgTxt.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        rgTxt.setForeground(new java.awt.Color(255, 210, 61));
        rgTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rgTxt.setText("RG*");
        getContentPane().add(rgTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 60, 40));
        getContentPane().add(RGjtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 300, 40));

        cpfTxt.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        cpfTxt.setForeground(new java.awt.Color(255, 210, 61));
        cpfTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cpfTxt.setText("CPF*");
        getContentPane().add(cpfTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 60, 40));
        getContentPane().add(CPFjtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 300, 40));

        dtTxt.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        dtTxt.setForeground(new java.awt.Color(255, 210, 61));
        dtTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dtTxt.setText("Data nascimento*");
        getContentPane().add(dtTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 160, 40));

        try {
            dataFtf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataFtf.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        dataFtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataFtfActionPerformed(evt);
            }
        });
        getContentPane().add(dataFtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 140, 40));

        sexoTxt.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        sexoTxt.setForeground(new java.awt.Color(255, 210, 61));
        sexoTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sexoTxt.setText("Sexo*");
        getContentPane().add(sexoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 100, 40));

        maleRb.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        maleRb.setForeground(new java.awt.Color(255, 210, 61));
        maleRb.setText("Masculino");
        getContentPane().add(maleRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 130, 40));

        feminineRb.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        feminineRb.setForeground(new java.awt.Color(255, 210, 61));
        feminineRb.setText("Feminino");
        getContentPane().add(feminineRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 130, 40));

        emailTxt.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        emailTxt.setForeground(new java.awt.Color(255, 210, 61));
        emailTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailTxt.setText("E-mail*");
        getContentPane().add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 90, 40));
        getContentPane().add(emailJtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 570, 40));

        foneTxt.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        foneTxt.setForeground(new java.awt.Color(255, 210, 61));
        foneTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        foneTxt.setText("Telefone");
        getContentPane().add(foneTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 140, 40));
        getContentPane().add(foneJtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 300, 40));

        adressTxt.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        adressTxt.setForeground(new java.awt.Color(255, 210, 61));
        adressTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adressTxt.setText("Endereço*");
        getContentPane().add(adressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 160, 40));
        getContentPane().add(adressJtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 610, 570, 40));

        cepTxt.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        cepTxt.setForeground(new java.awt.Color(255, 210, 61));
        cepTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cepTxt.setText("CEP");
        getContentPane().add(cepTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 670, 140, 40));
        getContentPane().add(CEPjtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 670, 220, 40));

        estadoTxt.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        estadoTxt.setForeground(new java.awt.Color(255, 210, 61));
        estadoTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        estadoTxt.setText("Estado");
        getContentPane().add(estadoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 670, 70, 40));

        countryStateJtf.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        countryStateJtf.setForeground(new java.awt.Color(51, 51, 51));
        countryStateJtf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ceará", "Paraíba", "Maranhão", "Rio Grande do Norte", "Pernambuco" }));
        getContentPane().add(countryStateJtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 670, 270, 40));

        registerButton.setBackground(new java.awt.Color(255, 210, 61));
        registerButton.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        registerButton.setForeground(new java.awt.Color(51, 51, 51));
        registerButton.setText("Cadastrar");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 770, 280, 50));

        cancelButton.setBackground(new java.awt.Color(255, 210, 61));
        cancelButton.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(51, 51, 51));
        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 770, 280, 50));
        getContentPane().add(sp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 750, 30));
        getContentPane().add(sp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 750, -1));
        getContentPane().add(sp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 730, 750, 30));

        tituloTxt.setFont(new java.awt.Font("Berlin Sans FB", 1, 36)); // NOI18N
        tituloTxt.setForeground(new java.awt.Color(255, 255, 255));
        tituloTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloTxt.setText("Cadastro de Barbeiro");
        getContentPane().add(tituloTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 760, 50));

        bg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/corUnica.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataFtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataFtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataFtfActionPerformed

    private void id_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_tfActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        this.controller.actionPerformed(evt);
    }//GEN-LAST:event_registerButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.controller.actionPerformed(evt);
    }//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarBarbeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarBarbeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarBarbeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarBarbeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrarBarbeiro dialog = new RegistrarBarbeiro(new javax.swing.JFrame(), true);
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

    public JTextField getCEPjtf() {
        return CEPjtf;
    }

    public void setCEPjtf(JTextField CEPjtf) {
        this.CEPjtf = CEPjtf;
    }

    public JTextField getCPFjtf() {
        return CPFjtf;
    }

    public void setCPFjtf(JTextField CPFjtf) {
        this.CPFjtf = CPFjtf;
    }

    public JTextField getRGjtf() {
        return RGjtf;
    }

    public void setRGjtf(JTextField RGjtf) {
        this.RGjtf = RGjtf;
    }

    public JTextField getAdressJtf() {
        return adressJtf;
    }

    public void setAdressJtf(JTextField adressJtf) {
        this.adressJtf = adressJtf;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }

    public void setCancelButton(JButton cancelButton) {
        this.cancelButton = cancelButton;
    }

    public JComboBox<String> getCountryStateJtf() {
        return countryStateJtf;
    }

    public void setCountryStateJtf(JComboBox<String> countryStateJtf) {
        this.countryStateJtf = countryStateJtf;
    }

    public JFormattedTextField getDataFtf() {
        return dataFtf;
    }

    public void setDataFtf(JFormattedTextField dataFtf) {
        this.dataFtf = dataFtf;
    }

    public JTextField getEmailJtf() {
        return emailJtf;
    }

    public void setEmailJtf(JTextField emailJtf) {
        this.emailJtf = emailJtf;
    }

    public JRadioButton getFeminineRb() {
        return feminineRb;
    }

    public void setFeminineRb(JRadioButton feminineRb) {
        this.feminineRb = feminineRb;
    }

    public JTextField getFoneJtf() {
        return foneJtf;
    }

    public void setFoneJtf(JTextField foneJtf) {
        this.foneJtf = foneJtf;
    }

    public JTextField getId_tf() {
        return id_tf;
    }

    public void setId_tf(JTextField id_tf) {
        this.id_tf = id_tf;
    }

    public JRadioButton getMaleRb() {
        return maleRb;
    }

    public void setMaleRb(JRadioButton maleRb) {
        this.maleRb = maleRb;
    }

    public JTextField getNameJtf() {
        return nameJtf;
    }

    public void setNameJtf(JTextField nameJtf) {
        this.nameJtf = nameJtf;
    }

    public JButton getRegisterButton() {
        return registerButton;
    }

    public void setRegisterButton(JButton registerButton) {
        this.registerButton = registerButton;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CEPjtf;
    private javax.swing.JTextField CPFjtf;
    private javax.swing.JTextField RGjtf;
    private javax.swing.JTextField adressJtf;
    private javax.swing.JLabel adressTxt;
    private javax.swing.JLabel bg;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel cepTxt;
    private javax.swing.JComboBox<String> countryStateJtf;
    private javax.swing.JLabel cpfTxt;
    private javax.swing.JFormattedTextField dataFtf;
    private javax.swing.JLabel dtTxt;
    private javax.swing.JTextField emailJtf;
    private javax.swing.JLabel emailTxt;
    private javax.swing.JLabel estadoTxt;
    private javax.swing.JRadioButton feminineRb;
    private javax.swing.JTextField foneJtf;
    private javax.swing.JLabel foneTxt;
    private javax.swing.JLabel idTxt;
    private javax.swing.JTextField id_tf;
    private javax.swing.JRadioButton maleRb;
    private javax.swing.JTextField nameJtf;
    private javax.swing.JLabel nameTxt;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel rgTxt;
    private javax.swing.JLabel sexoTxt;
    private javax.swing.JSeparator sp1;
    private javax.swing.JSeparator sp2;
    private javax.swing.JSeparator sp3;
    private javax.swing.JLabel tituloTxt;
    // End of variables declaration//GEN-END:variables
}
