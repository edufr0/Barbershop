package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Servico{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int servico_id;
    private String descricao;
    private float valor;

    public Servico(String descricao, float valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getServico_id() {
        return servico_id;
    }

    public void setServico_id(int servico_id) {
        this.servico_id = servico_id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return getDescricao();
    }
    
    
    
    
}
