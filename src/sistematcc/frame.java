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
    private AlunoDAO listaAlunos;
    private ProfessorDAO listaProfessores;
    private PropostaTCDAO listaPropostas;
    private BancaAvaliadoraDAO listaBancas;
    private AvaliacaoDAO listaAvaliacoes;
    
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
    
    private PanelDefinicaoOrientadorTema panelProposta;
    private PanelWhoAmI primeiroPainel;
    private PanelPropostasTC panelPropostasTC;
    private PanelLoginProfessor PanelLoginProfessor;
    private PanelRelatorio panelRelatorio;
    private PanelFormularioAvaliacao formularioAvaliacao;
    private PanelAvaliacao panelAvaliacao;
    private CrudProfessor panelCRUDProfessor;
    private CrudAluno panelCRUDAluno;
    

    /*Inicializadores do frame*/
    public frame(AlunoDAO listaAlunos, ProfessorDAO listaProfessores, PropostaTCDAO listaPropostas
    , BancaAvaliadoraDAO listaBancas, AvaliacaoDAO listaAvaliacoes) {
        super("Gerenciador de TCC");
        this.listaAlunos = listaAlunos;
        this.listaProfessores = listaProfessores;
        this.listaPropostas = listaPropostas;
        this.listaBancas = listaBancas;
        this.listaAvaliacoes = listaAvaliacoes;
        initComponents();
        criarMenu();
        this.setVisible(true);
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
        primeiroPainel.getCrudAlunos().addActionListener(new abrirCRUDAluno());
        primeiroPainel.getCrudProfessores().addActionListener(new abrirCRUDProfessor());
        this.add(primeiroPainel);
    }
    public void criarLoginAluno() {
        //começa resetando tudo
        alunoLogado = null;
        professorSelecionado = null;
        propostaEscolhida = null;
        
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
        this.setSize(702,450);
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
        botaoPrimeiro.addActionListener(new esconderFormularioAvaliacao(0));
        JButton botaoSegundo = formularioAvaliacao.getSegundoAvaliador();
        botaoSegundo.addActionListener(new esconderFormularioAvaliacao(1));
        JButton botaoTerceiro = formularioAvaliacao.getTerceiroAvaliador();
        botaoTerceiro.addActionListener(new esconderFormularioAvaliacao(2));
        if((!botaoPrimeiro.isVisible() && (!botaoSegundo.isVisible()) && (!botaoTerceiro.isVisible()))) {
            JOptionPane.showMessageDialog(null,"...Calculando conceito final...");
            calcularConceitoFinal();
            formularioAvaliacao.setVisible(false);
            criarMenu();
        }
        else 
        this.add(formularioAvaliacao);
    }
    public void calcularConceitoFinal() {
        double n1,n2,n3;
        n1 = converteConceitoEmNota(0);
        n2 = converteConceitoEmNota(1);
        n3 = converteConceitoEmNota(2);
        String conceitoFinal;
        double notaFinal = (n1 + n2 + n3) / 3;
        if(notaFinal < 7) {
            conceitoFinal = "D - Reprovado";
        }
        else if(notaFinal < 8.5) {
            conceitoFinal = "C - Aprovado";
        }
        else if(notaFinal < 10) {
            conceitoFinal = "B - Aprovado";
        }
        else {
            conceitoFinal = "A - Aprovado";
        }
        JOptionPane.showMessageDialog(null, "O conceito final é: " + conceitoFinal);
    }
    public void criarPanelCRUDAluno() {
        primeiroPainel.setVisible(false);
        panelCRUDAluno = new CrudAluno(listaAlunos);
        panelCRUDAluno.getConfirmar().addActionListener(new voltarMenu(1));
        this.add(panelCRUDAluno);
    }
    public void criarPanelCRUDProfessor() {
        primeiroPainel.setVisible(false);
        panelCRUDProfessor = new CrudProfessor(listaProfessores);
        panelCRUDProfessor.getConfirmar().addActionListener(new voltarMenu(0));
        this.add(panelCRUDProfessor);
    }
    public double converteConceitoEmNota(int i) {
         ArrayList<Avaliacao> avaliacoes = propostaEscolhida.getBancaAvaliadora().getAvaliacoes();
        if(avaliacoes.get(0).isAvaliacao()) {
            switch(avaliacoes.get(0).getConceito()) {
                case "A":
                    return 10;
                case "B":
                    return 8.5;
                case "C":
                    return 7;
            }
        }
        else return 5;
        return 0;
    }
    
    public void criarAvaliacao() {
        panelAvaliacao = new PanelAvaliacao(propostaEscolhida, formularioAvaliacao.getAvaliadorEscolhido());
        panelAvaliacao.getConfirmar().addActionListener(new salvarAvaliacao());
        this.add(panelAvaliacao);
        this.setSize(870,350);
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
            criarPanelListaPropostas();
        }
    
    }
    /*classe responsavel por verificar se NOME E MATRICULA
    existe no AlunoDAO
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
            String matricula = loginAluno.getCampoMatricula().getText();
            
            if(listaAlunos.search(nome) != null){
                if (listaAlunos.searchByMatricula(matricula) != null) {
                    loginAluno.setVisible(false);
                    criarPainelSugestoes(nome);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Matricula Incorreta");
                }
            }
            else {
                   JOptionPane.showMessageDialog(null, "Nome Incorreto");
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
            panelProposta.setVisible(false);
            criarMenu();
        }
    }
    
    private class confirmarLoginProfessor implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
                    criarPanelListaPropostas();
                    PanelLoginProfessor.setVisible(false);
        }
    }
    
    private class auxiliarGerarRelatorio implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
                propostaEscolhida = panelPropostasTC.getPropostaSelecionada();
                if(propostaEscolhida != null) {
                    ArrayList<Professor> relatorioProfessores = gerarRelatorio(propostaEscolhida);
                    panelPropostasTC.setVisible(false);
                    criarPanelRelatorio(relatorioProfessores);
                }
                else 
                    JOptionPane.showMessageDialog(null,"Escolha Alguma Proposta");
            }
        }
    private class adicionarProfessor implements ActionListener {

        ArrayList<Professor> professoresDaBanca = new ArrayList();
        
        @Override
        public void actionPerformed(ActionEvent ae) {
               
               Professor i = panelRelatorio.getProfessorSelecionado();
               if(i != null) {
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
               else JOptionPane.showMessageDialog(null, "Escolha um professor");
            }
    }
    private class esconderFormularioAvaliacao implements ActionListener {
        
        int escolha;
        
        esconderFormularioAvaliacao(int escolhaRecebida) {
            this.escolha = escolhaRecebida;
        }
        
        @Override
        public void actionPerformed(ActionEvent ae) {
           formularioAvaliacao.setVisible(false);
           formularioAvaliacao.setAvaliadorEscolhido(escolha);
           criarAvaliacao();
        }
    
    }
    
    private class salvarAvaliacao implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            Avaliacao avaliacao = panelAvaliacao.criarAvaliacao();
            if(listaAvaliacoes.add(avaliacao))
                //adiciona a avaliacao no objeto Banca Avaliadora 
                // da proposta que estamos avaliando 
                propostaEscolhida.getBancaAvaliadora().setAvaliacoes(avaliacao);
                JOptionPane.showMessageDialog(null, "Avaliação submetida ao sistema");
                panelAvaliacao.setVisible(false);
                criarFormularioAvaliacao(propostaEscolhida);
        }
    
    }
    
    private class abrirCRUDAluno implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            criarPanelCRUDAluno();
        }
    }
    private class abrirCRUDProfessor implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            criarPanelCRUDProfessor();
        }
    
    }
    private class voltarMenu implements ActionListener {
        int i;
        voltarMenu(int i) {
            this.i = i;
        }
        public void actionPerformed(ActionEvent ae) {
            if(i == 0) 
            panelCRUDProfessor.setVisible(false);
            else
            panelCRUDAluno.setVisible(false);
            criarMenu();
        }
        
    }
}
