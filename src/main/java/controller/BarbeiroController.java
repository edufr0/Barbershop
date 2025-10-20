package controller;

import view.RegistrarBarbeiro;

public class BarbeiroController {

    private RegistrarBarbeiro cadastroBarbeiroView;

    public void abrirTelaCadastroBarbeiro() {
        if (cadastroBarbeiroView == null) {
            cadastroBarbeiroView = new RegistrarBarbeiro(null, true);
        }

        // Exibe a tela de cadastro de barbeiro
        cadastroBarbeiroView.setVisible(true);
    }
}