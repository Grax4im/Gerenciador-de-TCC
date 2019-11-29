package sistematcc;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
    
    /*instancia das classes auxiliares*/
    private final escolherProfessor escolherProfessor = new escolherProfessor();
    private confirmarLoginAlunos confirmarLoginAlunos;
    private final loginAlunos loginAlunos = new loginAlunos();
    private final loginProfessores loginProfessores = new loginProfessores();
    private final loginAdmin loginAdmin = new loginAdmin();
    private PanelSugestoes painelSugestoes;
   
    /*variaveis do primeiro JPanel*/
    private final JPanel escolherUsuario = new JPanel();
    private final JButton botaoAluno = new JButton("Sou Aluno");
    private final JButton botaoProfessor = new JButton("Sou Professor");
    private final JButton botaoAdmin = new JButton("Sou Administrador");
    

    /*Inicializadores do frame*/
    public frame(DAOaluno listaAlunos, DAOprofessor listaProfessores) {
        super("Gerenciador de TCC");
        this.listaAlunos = listaAlunos;
        this.listaProfessores = listaProfessores;
        initComponents();
        criarMenu();
    }
    
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,500);
    }
    
    /*Métodos para Criação de JPanel*/
    public void criarMenu() {
        escolherUsuario.add(botaoAluno);
        botaoAluno.addActionListener(loginAlunos);
        escolherUsuario.add(botaoProfessor);
        botaoProfessor.addActionListener(loginProfessores);
        escolherUsuario.add(botaoAdmin);
        botaoAdmin.addActionListener(loginAdmin);
        escolherUsuario.setLayout(new FlowLayout());
        this.add(escolherUsuario);
        this.setVisible(true);
    }
    public void criarLoginAluno() {
        PanelLoginAluno loginAluno = new PanelLoginAluno();
        JButton botaoConfirmar = loginAluno.getBotaoConfirmar();
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
        PanelDefinicaoOrientadorTema panelProposta = new PanelDefinicaoOrientadorTema(alunoLogado, professorSelecionado);
        this.add(panelProposta);
    }
    /*CLASSES AUXILIARES - ActionListeners */
    private class loginAlunos implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            escolherUsuario.setVisible(false);
            criarLoginAluno();
        }
    
    }
    private class loginProfessores implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            escolherUsuario.setVisible(false);
        }
    
    }
    private class loginAdmin implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            escolherUsuario.setVisible(false);
        }
    
    }
    /*classe responsavel por verificar se NOME E MATRICULA
    existe no DAOaluno
    */
    private class confirmarLoginAlunos implements ActionListener {
        PanelLoginAluno loginAluno;
        
        confirmarLoginAlunos(PanelLoginAluno loginAluno){
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
  
}
