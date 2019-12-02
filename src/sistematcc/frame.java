package sistematcc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import DAO.*;
import javax.swing.JTable;
import models.*;

public class frame extends JFrame{
    
    /*Guarda no frame o objeto do aluno logado 
    e do professor que vai orienta-lo*/
    private Aluno alunoLogado;
    private Professor professorSelecionado;
    
    /*Classes DAO*/
    private DAOaluno listaAlunos;
    private DAOprofessor listaProfessores;
    private DAOpropostaTC listaPropostas;
    
    /*instancia das classes auxiliares*/
    private final escolherProfessor escolherProfessor = new escolherProfessor();
    private confirmarLoginAlunos confirmarLoginAlunos;
    private final loginAlunos loginAlunos = new loginAlunos();
    private final loginProfessores loginProfessores = new loginProfessores();
    private PanelSugestoes painelSugestoes;
    private final propostaEnviada propostaEnviada = new propostaEnviada();
    
    private PanelDefinicaoOrientadorTema panelProposta;
    private PanelWhoAmI primeiroPainel;
    

    /*Inicializadores do frame*/
    public frame(DAOaluno listaAlunos, DAOprofessor listaProfessores, DAOpropostaTC listaPropostas) {
        super("Gerenciador de TCC");
        this.listaAlunos = listaAlunos;
        this.listaProfessores = listaProfessores;
        this.listaPropostas = listaPropostas;
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
        painelSugestoes = new PanelSugestoes(listaProfessores);
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
}
