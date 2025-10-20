package model.DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import model.Servico;



public class ServicoDAO {
    private final EntityManager em;

    public ServicoDAO(EntityManager em) {
        this.em = em;
    }
    
    public Servico insert(Servico servico){
        em.persist(servico);
        return servico;
    }
    
    public Servico update(Servico servico) {
        em.merge(servico);
        em.persist(servico);
        return servico;
    }
    
    public Servico insertOrUpdate(Servico servico){
        if (servico.getServico_id() > 0){
            return this.update(servico);
        }
        return insert(servico);
    }
    
    public void delete(Servico servico){
        em.merge(servico);
        em.remove(servico);
    }
    
    public List<Servico> selectAll(){
        String jpql = "select u from Servico as u";
        Query query = em.createQuery(jpql);
        return retornarListaComBaseNaConsulta(query);
    }

    private List<Servico> retornarListaComBaseNaConsulta(Query query) {
        List<Servico> services;
        
        try{
            services = query.getResultList();
        }catch(NoResultException e){
            services = new ArrayList<>();
        }
        return services;
    }
    
    public Servico selectPorId(Servico servico){
        return em.find(Servico.class, servico);
    }
    
}
