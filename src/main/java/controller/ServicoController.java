package controller;

import view.RegistrarServico;

public class ServicoController {

    private RegistrarServico cadastroServicoView;

    public void abrirTelaCadastroServico() {
        // Verifica se a tela já foi criada para evitar a criação múltipla
        if (cadastroServicoView == null) {
            cadastroServicoView = new RegistrarServico(null, true);
        }

        // Exibe a tela de cadastro de serviço
        cadastroServicoView.setVisible(true);
    }
}