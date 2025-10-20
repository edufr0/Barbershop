package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Agenda;
import view.Login;
import view.MenuPrincipal;

public class MenuPrincipalController implements ActionListener {

    private final MenuPrincipal view;
    private final ClienteController clienteController;
    private final BarbeiroController barbeiroController;
    private final ServicoController servicoController;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
        this.clienteController = new ClienteController();
        this.barbeiroController = new BarbeiroController();
        this.servicoController = new ServicoController();

        // Adicionando o controller como ouvinte para os eventos da view
        view.getCadastroCliente().addActionListener(this);
        view.getCadastroBarbeiro().addActionListener(this);
        view.getCadastroServico().addActionListener(this);
        view.getAddAgendamento().addActionListener(this);
        view.getBotaoLogout().addActionListener(this);
        view.getBotaoSair().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Verificar qual componente gerou o evento
        if (e.getSource() == view.getCadastroCliente()) {
            abrirTelaCadastroCliente();
        } else if (e.getSource() == view.getCadastroBarbeiro()) {
            abrirTelaCadastroBarbeiro();
        } else if (e.getSource() == view.getCadastroServico()) {
            abrirTelaCadastroServico();
        } else if (e.getSource() == view.getAddAgendamento()) {
            abrirTelaCriarAgendamento();
        } else if (e.getSource() == view.getBotaoLogout()) {
            realizarLogout();
        } else if (e.getSource() == view.getBotaoSair()) {
            sairDoSistema();
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

    private void abrirTelaCriarAgendamento() {
        new Agenda().setVisible(true);
    }

    private void sairDoSistema() {
        System.exit(0);
    }

    private void realizarLogout() {
    view.dispose(); // fecha a tela atual (MenuPrincipal)
    new Login().setVisible(true); // exibe a tela de login
    }
    
}
