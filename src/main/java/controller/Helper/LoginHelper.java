package Controller.Helper;

import Model.Usuario;
import view.Login;

public class LoginHelper implements IHelper{

    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    @Override
    public Usuario obterModelo(){
        
        String nome = view.Usuario.getText();
        String senha = view.Senha.getText();
        
        Usuario modelo = new Usuario(nome, senha);
        
        return modelo;
    }
    
    public void setarModelo(Usuario modelo){
        String nome = modelo.getUsuario();
        String senha = modelo.getSenha();
        
        view.Usuario.setText(nome);
        view.Senha.setText(senha);
    }
    
    @Override
    public void limparTela(){
        view.Usuario.setText("");
        view.Senha.setText("");
    }

    
}
