
package model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/* Classe referente aos clientes do negócio*/

@Entity
public class Cliente{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cliente_id;
    private String nome;
    private String sexo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
    private String telefone;
    private String email;
    private String cpf;
    private String endereco;
    private String cep;

    public Cliente(String nome, String sexo, Date dataNascimento, String telefone, String email, String cpf, String endereco, String cep) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cep = cep;
    }

    public int getCliente_Id() {
        return cliente_id;
    }

    public void setCliente_Id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

   
    
    
}
