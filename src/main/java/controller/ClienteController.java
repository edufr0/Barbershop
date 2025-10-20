package controller;

import java.awt.Frame;
import view.RegistrarCliente;

public class ClienteController {

    private RegistrarCliente cadastroClienteView;

    public void abrirTelaCadastroCliente() {
        if (cadastroClienteView == null) {
            cadastroClienteView = new RegistrarCliente((Frame)null, true);
        }

        // Exibe a tela de cadastro de cliente
        cadastroClienteView.setVisible(true);
    }
}
