package sistematcc;

import javax.swing.JButton;
import DAO.*;
import models.*;
public class Principal{
    public static void main(String[] args) {
        /*cria uma lista de alunos e adiciona 3 alunos*/
        DAOaluno listaAlunos = new DAOaluno();
        listaAlunos.add(new Aluno("Robert", 1234, "robertsilveiracrust@gmail.com","1234"));
        listaAlunos.add(new Aluno("Ariane", 5678, "ariane.huber@gmail.com","1234"));
        listaAlunos.add(new Aluno("Nicolas", 91011, "nicolas.coutinho@gmail.com","1234"));  
        /*cria uma lista de professores e adiciona 3 professores*/
        DAOprofessor listaProfessores = new DAOprofessor();
        listaProfessores.add(new Professor("Karen","javakaren@gmail.com", 
                "Educação Maker", "Java", true));
       listaProfessores.add(new Professor("João","joaodasilva@gmail.com", 
                "Fintechs", "RUby", false));
       listaProfessores.add(new Professor("Marcio","marciogamer@gmail.com", 
                "Gamificação do Ensino", "C", true));
       
       DAOpropostaTC listaPropostas = new DAOpropostaTC();
        
        /*cria o JFrame e passa a lista pra ele*/
        frame frame = new frame(listaAlunos, listaProfessores, listaPropostas);
    }
}
