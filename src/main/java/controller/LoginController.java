
package controller;

import Controller.Helper.LoginHelper;
import Model.Usuario;
import javax.persistence.EntityManager;
import model.DAO.JPAUtil;
import model.DAO.UsuarioDAO;
import view.Login;
import view.MenuADM;
import view.MenuBarbeiro;
import view.MenuPrincipal;

public class LoginController {

    private final Login view;
    private final LoginHelper helper;
    private EntityManager em;
    private Usuario usuarioAutenticado;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }

    public void entrarNoSistema(String usuario, String senha) {
        em = new JPAUtil().getEntityManager();
        UsuarioDAO usuarioDAO = new UsuarioDAO(em);

        usuarioAutenticado = usuarioDAO.autenticarUsuario(usuario, senha);

        if (usuarioAutenticado != null) {
            // Usuário autenticado com sucesso
            verificarNivelAcesso(usuarioAutenticado);
        } else {
            // Falha na autenticação
            exibirMensagemErro("Usuário ou senha incorretos");
        }
    }

    private void verificarNivelAcesso(Usuario usuario) {
        switch (usuario.getNivelAcesso()) {
            case "Administrador":
                exibirMenuAdm();
                break;
            case "Atendente":
                exibirMenuPrincipal();
                break;
            case "Barbeiro":
                exibirMenuBarbeiro();
                break;
            default:
                exibirMensagemErro("Nível de acesso não reconhecido");
        }
    }

    private void exibirMenuAdm() {
        // Tela do MenuAdm
        MenuADM menuAdm = new MenuADM();
        menuAdm.setVisible(true);
        this.view.dispose(); // fecha a view atual
    }

    private void exibirMenuPrincipal() {
        // Tela do MenuPrincipal
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
        this.view.dispose(); // fecha a view atual
    }

    private void exibirMenuBarbeiro() {
        // Tela do MenuBarbeiro
        MenuBarbeiro menuBarbeiro = new MenuBarbeiro();
        menuBarbeiro.setVisible(true);
        this.view.dispose(); // fecha a view atual
    }

    private void exibirMensagemErro(String mensagem) {
        this.view.exibeMensagem(mensagem);
    }
    
    
}