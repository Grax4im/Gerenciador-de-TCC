package sistematcc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import DAO.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import models.*;

public class frame extends JFrame{
    
    /*Guarda no frame o objeto do aluno logado 
    e do professor que vai orienta-lo*/
    private Aluno alunoLogado;
    private Professor professorSelecionado;
    private PropostaTC propostaEscolhida;
    
    /*Classes DAO*/
    private DAOaluno listaAlunos;
    private DAOprofessor listaProfessores;
    private DAOpropostaTC listaPropostas;
    private DAOBancaAvaliadora listaBancas;
    
    /*instancia das classes auxiliares*/
    private final adicionarProfessor adicionarProfessor = new adicionarProfessor();
    private final escolherProfessor escolherProfessor = new escolherProfessor();
    private confirmarLoginAlunos confirmarLoginAlunos;
    private final loginAlunos loginAlunos = new loginAlunos();
    private final loginProfessores loginProfessores = new loginProfessores();
    private PanelProfessores painelSugestoes;
    private final propostaEnviada propostaEnviada = new propostaEnviada();
    private final confirmarLoginProfessor confirmarLoginProfessor = new confirmarLoginProfessor();
    private final auxiliarGerarRelatorio auxiliarGerarRelatorio = new auxiliarGerarRelatorio();
    private criarAvaliacao criarAvaliacao = new criarAvaliacao();
    
    private PanelDefinicaoOrientadorTema panelProposta;
    private PanelWhoAmI primeiroPainel;
    private PanelPropostasTC panelPropostasTC;
    private PanelLoginProfessor PanelLoginProfessor;
    private PanelRelatorio panelRelatorio;
    private PanelFormularioAvaliacao formularioAvaliacao;
    

    /*Inicializadores do frame*/
    public frame(DAOaluno listaAlunos, DAOprofessor listaProfessores, DAOpropostaTC listaPropostas
    , DAOBancaAvaliadora listaBancas) {
        super("Gerenciador de TCC");
        this.listaAlunos = listaAlunos;
        this.listaProfessores = listaProfessores;
        this.listaPropostas = listaPropostas;
        this.listaBancas = listaBancas;
        initComponents();
        criarMenu();
    }
    
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,500);
    }
    
    /*Métodos para Criação de JPanel*/
    public void criarMenu(){
        primeiroPainel = new PanelWhoAmI();
        JButton souAluno = primeiroPainel.getSouAluno();
        JButton souProfessor = primeiroPainel.getSouProfessor();
        souAluno.addActionListener(loginAlunos);
        souProfessor.addActionListener(loginProfessores);
        this.add(primeiroPainel);
        this.setVisible(true);
    }
    public void criarLoginAluno() {
        PainelLoginAluno loginAluno = new PainelLoginAluno();
        JButton botaoConfirmar = loginAluno.getConfirmar();
        confirmarLoginAlunos = new confirmarLoginAlunos(loginAluno);
        botaoConfirmar.addActionListener(confirmarLoginAlunos);
        this.add(loginAluno);
    }
    public void criarPainelSugestoes(String nome) {
        alunoLogado = listaAlunos.search(nome);
        painelSugestoes = new PanelProfessores(listaProfessores);
        JButton botaoEscolherProfessor = painelSugestoes.getEscolherProfessor();
        botaoEscolherProfessor.addActionListener(escolherProfessor);
        this.add(painelSugestoes);
    }
    public void criarPanelPropostaTC() {
        professorSelecionado = escolherProfessor.getProfessorSelecionado();
        panelProposta =
            new PanelDefinicaoOrientadorTema(alunoLogado, professorSelecionado, listaPropostas);
        this.add(panelProposta);
            JButton botaoConfirmar = panelProposta.getConfirmar();
            botaoConfirmar.addActionListener(propostaEnviada);
            
    }
    public void criarPanelLoginProfessor() {
        PanelLoginProfessor = new PanelLoginProfessor();
        JButton botaoConfirmar = PanelLoginProfessor.getConfirmar();
        botaoConfirmar.addActionListener(confirmarLoginProfessor);
        this.add(PanelLoginProfessor);
    }
    
    public void criarPanelListaPropostas() {
        panelPropostasTC = new PanelPropostasTC(listaPropostas);
        JButton botaoConfirmar = panelPropostasTC.getEscolherPropsota();
        botaoConfirmar.addActionListener(auxiliarGerarRelatorio);
        this.add(panelPropostasTC);
    }
    public void criarPanelRelatorio(ArrayList<Professor> relatorio) {
        panelRelatorio = new PanelRelatorio(relatorio);
        JButton confirmar = panelRelatorio.getEscolherProfessor();
        confirmar.addActionListener(adicionarProfessor);
        this.add(panelRelatorio);
    }
    public void criarBancaAvaliadora(ArrayList<Professor> banca) {
        Professor primeiro = banca.get(0);
        Professor segundo = banca.get(1);     
        Professor terceiro = banca.get(2);

        BancaAvaliadora bancaAvaliadora = new BancaAvaliadora(primeiro,segundo,terceiro);
        if(listaBancas.add(bancaAvaliadora)) {
            JOptionPane.showMessageDialog(null,"Banca Avaliadora Criada com Sucesso!");
            JOptionPane.showMessageDialog(null,"E-mail enviado para todos os avaliadores");            
            propostaEscolhida.setBancaAvaliadora(bancaAvaliadora);
            criarFormularioAvaliacao(propostaEscolhida);
        }
    }
    public void criarFormularioAvaliacao(PropostaTC proposta) {
        formularioAvaliacao = new PanelFormularioAvaliacao(proposta);
        JButton botaoPrimeiro = formularioAvaliacao.getPrimeiroAvaliador();
        botaoPrimeiro.addActionListener(criarAvaliacao);
        JButton botaoSegundo = formularioAvaliacao.getSegundoAvaliador();
        botaoSegundo.addActionListener(criarAvaliacao);
        JButton botaoTerceiro = formularioAvaliacao.getTerceiroAvaliador();
        botaoTerceiro.addActionListener(criarAvaliacao);
        this.add(formularioAvaliacao);
    }
    
    /*Gerar o relatório dos professores indicados para a proposta*/
    public ArrayList<Professor> gerarRelatorio(PropostaTC proposta){
        String areaProjeto = proposta.getAreaDoProjeto();
        ArrayList<Professor> professoresArea = new ArrayList();
        
        for(Professor i: listaProfessores.getLista()) {
            for(String j: i.getAreaDeInteresse()) {
                if(j.equals(areaProjeto)) {
                    professoresArea.add(i);
                }
            }
        }
        
        if (professoresArea.size() < 4) {
            for(Professor i : listaProfessores.getLista()) {
                if(!professoresArea.contains(i) && professoresArea.size() < 4) {
                    professoresArea.add(i);
                }
            }
        }
        return professoresArea;
    }
    /*CLASSES AUXILIARES - ActionListeners */
    private class loginAlunos implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            primeiroPainel.setVisible(false);
            criarLoginAluno();
        }
    
    }
    private class loginProfessores implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            primeiroPainel.setVisible(false);
            criarPanelLoginProfessor();
        }
    
    }
    /*classe responsavel por verificar se NOME E MATRICULA
    existe no DAOaluno
    */
    private class confirmarLoginAlunos implements ActionListener {
        PainelLoginAluno loginAluno;
        
        confirmarLoginAlunos(PainelLoginAluno loginAluno){
            this.loginAluno = loginAluno;
        }
        @Override
        public void actionPerformed(ActionEvent ae) {
            String nome = loginAluno.getCampoNome().getText();
            //tem um bug aqui... se digitar uma string dá pau
            int matricula = Integer.parseInt(loginAluno.getCampoMatricula().getText());
            
            if(listaAlunos.search(nome) != null){
                if (listaAlunos.search(matricula) != null) {
                    loginAluno.setVisible(false);
                    criarPainelSugestoes(nome);
                }
                else {
                    //matricula errada...
                }
            }
            else {
                //login errado...
            }
        }
    }
  
    private class escolherProfessor implements ActionListener {     
       private Professor professorSelecionado;
       @Override
        public void actionPerformed(ActionEvent ae) {
            JTable tabela = painelSugestoes.getTabelaProfessores();
            tableModel modelo = painelSugestoes.getTableModel();
            if(tabela.getSelectedRow() != -1) {
                Object nome = modelo.getValueAt(tabela.getSelectedRow(), 0);
                professorSelecionado = listaProfessores.search((String)nome);
                professorSelecionado.setOrientador(false);
                professorSelecionado.setCargaTrabalho();
                painelSugestoes.setVisible(false);
                criarPanelPropostaTC();
            }
        }    
        public Professor getProfessorSelecionado() {
                return professorSelecionado;
        }
    }
    
    private class propostaEnviada implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            alunoLogado = null;
            professorSelecionado = null;
            panelProposta.setVisible(false);
            primeiroPainel.setVisible(true);
        }
    }
    
    private class confirmarLoginProfessor implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String nome = PanelLoginProfessor.getCampoNome().getText();
            String email = PanelLoginProfessor.getCampoEmail().getText();
            if(listaProfessores.search(nome) != null) {
                    criarPanelListaPropostas();
                    PanelLoginProfessor.setVisible(false);
            }
        }
    }
    
    private class auxiliarGerarRelatorio implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
                propostaEscolhida = panelPropostasTC.getPropostaSelecionada();
                ArrayList<Professor> relatorioProfessores = gerarRelatorio(propostaEscolhida);
                panelPropostasTC.setVisible(false);
                criarPanelRelatorio(relatorioProfessores);
            }
        }
    private class adicionarProfessor implements ActionListener {

        ArrayList<Professor> professoresDaBanca = new ArrayList();
        
        @Override
        public void actionPerformed(ActionEvent ae) {
               
               Professor i = panelRelatorio.getProfessorSelecionado();
               
               if(!professoresDaBanca.contains(i)) {
                professoresDaBanca.add(i);
                JOptionPane.showMessageDialog(null, "Professor " + i.getNome() + " Adicionado a Banca");
                if(professoresDaBanca.size() == 3) {
                    criarBancaAvaliadora(professoresDaBanca);
                    panelRelatorio.setVisible(false);
                }
               }
               else {
                   JOptionPane.showMessageDialog(null, "Professor " + i.getNome() + " Já faz parte da Banca");
               }
            }
    }
    private class criarAvaliacao implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("ok...");
        }
    
    }
    
}
