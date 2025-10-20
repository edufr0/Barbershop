
package model.DAO;

import Model.Usuario;
import javax.persistence.EntityManager;

public class TesteHibernate {
    public static void main(String[] args) {
        
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
            
        Usuario usuarioTeste = new Usuario("pedro", "12345", "Barbeiro");
        UsuarioDAO teste = new UsuarioDAO(em);
        teste.insert(usuarioTeste);
        
        em.getTransaction().commit();
        em.close();
        
    }
}
