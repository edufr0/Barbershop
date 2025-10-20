package servico;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 * Classe para testar o envio de email
 */
public class EmailTeste {

    public static void main(String[] args) {
         
        
        Email email = new Email("Senha e Usuário Sistema Service Desk", "Segue usuário e senha para acesso ao sistema de auditoria\n"+"Usuario:Eduardo Ferreira\n"+"Senha: 123456", "eduardoy97.ef@gmail.com");
        
        email.enviar();
        

    }
    
}
