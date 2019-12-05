package sistematcc;
import DAO.*;
import java.util.ArrayList;
import models.*;
public class Principal{
    public static void main(String[] args) {

        
        AlunoDAO listaAlunos = new AlunoDAO(); 
        ProfessorDAO listaProfessores = new ProfessorDAO();
        PropostaTCDAO listaPropostas = new PropostaTCDAO();
        BancaAvaliadoraDAO listaBancas = new BancaAvaliadoraDAO();
        AvaliacaoDAO listaAvaliacoes = new AvaliacaoDAO();
        
        /*cria o JFrame e passa a lista pra ele*/
        frame frame = new frame(listaAlunos, listaProfessores, listaPropostas, listaBancas, listaAvaliacoes);
    }
}
