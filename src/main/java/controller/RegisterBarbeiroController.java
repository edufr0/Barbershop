package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.persistence.EntityManager;
import view.RegistrarBarbeiro;


public class RegisterBarbeiroController implements ActionListener{
    
    private final RegistrarBarbeiro view;
    private final EntityManager em = null;

    public RegisterBarbeiroController(RegistrarBarbeiro view) {
        this.view = view;
        
        view.getCancelButton().addActionListener(this);
        view.getRegisterButton().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //adicionar regra
        if (e.getSource() == view.getCancelButton()) {
            view.dispose();
        }
    }
    
    
}
