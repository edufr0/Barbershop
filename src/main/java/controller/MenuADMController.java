package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Agenda;
import view.MenuADM;


public class MenuADMController implements ActionListener{
    
    private final MenuADM view;
    private final NewUserController registroUsuarioController;
    private final ClienteController clienteController;
    private final BarbeiroController barbeiroController;
    private final ServicoController servicoController;

    public MenuADMController(MenuADM view) {
        this.view = view;
        this.registroUsuarioController = new NewUserController();
        this.clienteController = new ClienteController();
        this.barbeiroController = new BarbeiroController();
        this.servicoController = new ServicoController();
        
        view.getMenuItemCliente().addActionListener(this);
        view.getMenuItemServico().addActionListener(this);
        view.getMenuItemUsuario().addActionListener(this);
        view.getMenuItemBarbeiro().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // Verificar qual componente gerou o evento
        if (e.getSource() == view.getMenuItemCliente()) {
            abrirTelaCadastroCliente();
        } else if (e.getSource() == view.getMenuItemServico()) {
            abrirTelaCadastroServico();
        } else if (e.getSource() == view.getMenuItemUsuario()) {
            abrirTelaCadastroUsuario();
        } else if (e.getSource() == view.getMenuItemBarbeiro()) {
            abrirTelaCadastroBarbeiro();
        } else if (e.getSource() == view.getMenuItemAgenda()) {
            abrirTelaCriarAgendamento();
        }
    }
     private void abrirTelaCadastroCliente() {
        clienteController.abrirTelaCadastroCliente();
    }

    private void abrirTelaCadastroBarbeiro() {
        barbeiroController.abrirTelaCadastroBarbeiro();
    }

    private void abrirTelaCadastroServico() {
        servicoController.abrirTelaCadastroServico();
    }
    
    private void abrirTelaCadastroUsuario() {
        registroUsuarioController.abrirTelaCadastroUsuario();
    }

    private void abrirTelaCriarAgendamento() {
        new Agenda().setVisible(true);
    }
}
