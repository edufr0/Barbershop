package controller;


import Controller.Helper.AgendaHelper;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.Agendamento;
import model.Cliente;
import model.DAO.AgendaDAO;
import model.DAO.ClienteDAO;
import model.DAO.JPAUtil;
import model.DAO.ServicoDAO;
import model.Servico;
import servico.Correio;
import view.Agenda;


public class AgendaController {
    
    private Agenda view;
    private final AgendaHelper helper;
    private EntityManager em;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela(){
        em = new JPAUtil().getEntityManager();
        //Buscar Lista com agendamentos do banco de dados
        AgendaDAO agendamentoDAO = new AgendaDAO(em);
        List<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        //Exibir essa lista na view
        helper.preencherTabela((ArrayList<Agendamento>) agendamentos);
    }
    
    public void atualizaClientes(){
        //Buscar Clientes do banco
        em = new JPAUtil().getEntityManager();
        ClienteDAO clienteDAO = new ClienteDAO(em);
        List<Cliente> clientes = clienteDAO.selectAll();
        
        //Exibir clientes no combobox cliente
        helper.preencherClientes((ArrayList<Cliente>) clientes);
    }
    
    public void atualizaServicos(){
    
        //Buscar Servicos do Banco
        em = new JPAUtil().getEntityManager();
        ServicoDAO servicoDAO = new ServicoDAO(em);
        List<Servico> servicos = servicoDAO.selectAll();
        
        //Exibir Servicos na combobox Servico
        helper.preencherServicos((ArrayList<Servico>) servicos);
    }

    public void atualizaValor() {
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }

    public void agendar() {
        
        em = new JPAUtil().getEntityManager();
        
        //Buscar Objeto Agendamento da Tela
        Agendamento agendamento = helper.obterModelo();
        
        //Salvar no banco de dados
        AgendaDAO agendamentoDAO = new AgendaDAO(em);
        agendamentoDAO.insert(agendamento);
        
        //atualizar Tabela
        atualizaTabela();
        
        helper.limparTela();
       
        //notifica cliente por email
        Correio correio = new Correio();
        correio.notificarPorEmail(agendamento);
    }

    public void abrirTelaCadastroAgendamento() {
        if (view == null) {
            view = new Agenda();
        }
        // Exibe a tela de cadastro de Agendamento
        view.setVisible(true);
    }
}