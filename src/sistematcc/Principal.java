package sistematcc;

import javax.swing.JButton;
import DAO.*;
import java.util.ArrayList;
import models.*;
public class Principal{
    public static void main(String[] args) {
        /*cria uma lista de alunos e adiciona 3 alunos*/
        DAOaluno listaAlunos = new DAOaluno();
        Aluno robert = new Aluno("Robert", 1234, "robertsilveiracrust@gmail.com","1234");
        listaAlunos.add(robert);
        Aluno ariane = new Aluno("Ariane", 5678, "ariane.huber@gmail.com","1234");
        listaAlunos.add(ariane);
        Aluno nicolas = new Aluno("Nicolas", 91011, "nicolas.coutinho@gmail.com","1234");
        listaAlunos.add(nicolas);  
        /*cria uma lista de professores e adiciona 3 professores*/
        DAOprofessor listaProfessores = new DAOprofessor();
        
        Professor karen = new Professor("Karen","javakaren@gmail.com", true);
        ArrayList areaInteresse = new ArrayList();
        areaInteresse.add("Java");
        areaInteresse.add("Educação Maker");
        areaInteresse.add("Sustentabilidade Digital");
        karen.setAreaDeInteresse(areaInteresse);
        karen.setSugestao("Programação Desplugada");
        listaProfessores.add(karen);

        areaInteresse = new ArrayList();
        Professor joao = new Professor("João","joaodasilva@gmail.com" ,false);
        areaInteresse.add("Robótica");
        areaInteresse.add("Aprendizagem de Maquina");
        areaInteresse.add("Jogos Retro");
        joao.setAreaDeInteresse(areaInteresse);
        joao.setSugestao("Machine Learning nas escolas de Ensino Médio");
        listaProfessores.add(joao);
        
        areaInteresse = new ArrayList();
        Professor marcio = new Professor("Marcio","marciogamer@gmail.com", true);
        areaInteresse.add("Gamificação");
        areaInteresse.add("Java");
        areaInteresse.add("Games");
        marcio.setAreaDeInteresse(areaInteresse);
        marcio.setSugestao("Gamificação em Empresas de TI");
        listaProfessores.add(marcio);
        
        /*Cria a lista com todas as propostas de TC*/
        DAOpropostaTC listaPropostas = new DAOpropostaTC();
        listaPropostas.add(new PropostaTC("Gamificação",robert, marcio,"Games"));
        listaPropostas.add(new PropostaTC("Machine Learning",ariane, joao,"Java"));
        listaPropostas.add(new PropostaTC("Maker", nicolas, karen,"Java"));

        DAOBancaAvaliadora listaBancas = new DAOBancaAvaliadora();
        /*cria o JFrame e passa a lista pra ele*/
        frame frame = new frame(listaAlunos, listaProfessores, listaPropostas, listaBancas);
    }
}
