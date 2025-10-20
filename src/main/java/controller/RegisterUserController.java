package controller;

import Model.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

import view.NewUser;

public class RegisterUserController implements ActionListener {

    private final NewUser view;
    private final EntityManager em;

    public RegisterUserController(NewUser view) {
        this.view = view;
        this.em = null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == view.getRegisterUserButton()) {
            if (new String(view.getUserPassword1().getPassword()).equals(new String(view.getUserPasswordConfirm().getPassword()))) {
         
                String name = view.getUserName1().getText();
                String nivel = view.getjComboBox1().getSelectedItem().toString();
                String password = view.getUserPassword1().getText();
                
                Usuario usuarioNovo = new Usuario(name, password, nivel);
                em.persist(usuarioNovo);
                
                Object[] options = {"Ok", "Cancelar"};
                JOptionPane.showOptionDialog(null, "Seu cadastro foi realizado com sucesso\n Clique em OK para continuar", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null, options, options[0]
                );
                this.view.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Opa, parece que seus dados não são iguais\n Verfique e corrija", "Corrija seus dados", 0);
            }

        }
        if (e.getSource() == view.getCancelRegisterUserButton()) {
            view.dispose();
        }
    }

}
