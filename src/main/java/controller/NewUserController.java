package controller;

import view.NewUser;

public class NewUserController {

    private NewUser cadastrousuarioView;

    public void abrirTelaCadastroUsuario() {
        if (cadastrousuarioView == null) {
            cadastrousuarioView = new NewUser(null, true);
        }

        // Exibe a tela de cadastro de barbeiro
        cadastrousuarioView.setVisible(true);
    }
}