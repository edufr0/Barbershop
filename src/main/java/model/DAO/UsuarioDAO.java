package model.DAO;

import Model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Eduardo Ferreira
 */
public class UsuarioDAO {
    private final EntityManager em;

    public UsuarioDAO(EntityManager em) {
        this.em = em;
    }
    
    public Usuario insert(Usuario usuario){
        em.persist(usuario);
        return usuario;
    }
    
    public Usuario update(Usuario usuario) {
        em.merge(usuario);
        em.persist(usuario);
        return usuario;
    }
    
    public Usuario insertOrUpdate(Usuario usuario){
        if (usuario.getId() > 0){
            return this.update(usuario);
        }
        return insert(usuario);
    }
    
    public void delete(Usuario usuario){
        em.merge(usuario);
        em.remove(usuario);
    }
    
    public List<Usuario> selectAll(){
        String jpql = "select u from Usuario as u";
        Query query = em.createQuery(jpql);
        return retornarListaComBaseNaConsulta(query);
    }

    private List<Usuario> retornarListaComBaseNaConsulta(Query query) {
        List<Usuario> usuarios;
        
        try{
            usuarios = query.getResultList();
        }catch(NoResultException e){
            usuarios = new ArrayList<>();
        }
        return usuarios;
    }
    
    public Usuario autenticarUsuario(String usuario, String senha) {
        String jpql = "SELECT u FROM Usuario u WHERE u.usuario = :pUsuario AND u.senha = :pSenha";

        Query query = em.createQuery(jpql);
        query.setParameter("pUsuario", usuario);
        query.setParameter("pSenha", senha);

        List<Usuario> usuarios = query.getResultList();

        if (!usuarios.isEmpty()) {
            return usuarios.get(0);
        } else {
            return null; // Nenhum usuário encontrado
        }
    }
    
    public Usuario selectPorId(Usuario usuario){
        return em.find(Usuario.class, usuario);
    }
}
