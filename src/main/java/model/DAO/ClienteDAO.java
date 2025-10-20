package model.DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import model.Cliente;

public class ClienteDAO {
    
    private final EntityManager em;

    public ClienteDAO(EntityManager em) {
        this.em = em;
    }
    
    public Cliente insert(Cliente cliente){
        em.persist(cliente);
        return cliente;
    }
    
    public Cliente update(Cliente cliente) {
        em.merge(cliente);
        em.persist(cliente);
        return cliente;
    }
    
    public Cliente insertOrUpdate(Cliente cliente){
        if (cliente.getCliente_Id() > 0){
            return this.update(cliente);
        }
        return insert(cliente);
    }
    
    public void delete(Cliente cliente){
        em.merge(cliente);
        em.remove(cliente);
    }
    
    public List<Cliente> selectAll(){
        String jpql = "select u from Cliente as u";
        Query query = em.createQuery(jpql);
        return retornarListaComBaseNaConsulta(query);
    }

    private List<Cliente> retornarListaComBaseNaConsulta(Query query) {
        List<Cliente> clientes;
        
        try{
            clientes = query.getResultList();
        }catch(NoResultException e){
            clientes = new ArrayList<>();
        }
        return clientes;
    }
    
    public Cliente selectPorId(Cliente cliente){
        return em.find(Cliente.class, cliente);
    }
}

  
    
    

