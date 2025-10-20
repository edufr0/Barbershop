package model.DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import model.Agendamento;


public class AgendaDAO {
   private final EntityManager em;

    public AgendaDAO(EntityManager em) {
        this.em = em;
    }
    
    public Agendamento insert(Agendamento agenda){
        em.persist(agenda);
        return agenda;
    }
    
    public Agendamento update(Agendamento agenda) {
        em.merge(agenda);
        em.persist(agenda);
        return agenda;
    }
    
    public Agendamento insertOrUpdate(Agendamento agenda){
        if (agenda.getId() > 0){
            return this.update(agenda);
        }
        return insert(agenda);
    }
    
    public void delete(Agendamento agenda){
        em.merge(agenda);
        em.remove(agenda);
    }
    
    public List<Agendamento> selectAll(){
        String jpql = "select u from Agendamento as u";
        Query query = em.createQuery(jpql);
        return retornarListaComBaseNaConsulta(query);
    }

    private List<Agendamento> retornarListaComBaseNaConsulta(Query query) {
        List<Agendamento> agendas;
        
        try{
            agendas = query.getResultList();
        }catch(NoResultException e){
            agendas = new ArrayList<>();
        }
        return agendas;
    }
    
    public Agendamento selectPorId(Agendamento agenda){
        return em.find(Agendamento.class, agenda);
    }
    
}
