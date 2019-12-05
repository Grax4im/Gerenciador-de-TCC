package DAO;
import java.util.ArrayList;
import models.Aluno;
import models.Serializar;
public class AlunoDAO implements DAO<Aluno>{

    private ArrayList<Aluno> lista = Serializar.load("alunos.ser");
    
    @Override
    public boolean add(Aluno object) {
        if(lista.add(object)){
            Serializar.serializar("alunos.ser", lista);
            return true;
        }
        return false;
    }
    
    public boolean update(Aluno object, Aluno newObject) {
        if (object.copy(newObject)) {
            Serializar.serializar("alunos.ser", lista);
            return true;
        }
        return false;
    }
    
    //search student by Name
    @Override
    public Aluno search(String name) {
        for(Aluno i : lista) {
            if (i.getNome().equals(name)) {
                return i;
            }
        }
        //if don't match...
        return null;
    }
    //search student by Matricula
    public Aluno searchByMatricula(String matricula) {
        for(Aluno i : lista) {
            if (i.getMatricula().equals(matricula)) {
                return i;
            }
        }
        //if don't match...
        return null;
    }

    @Override
    public boolean remove(Aluno object) {
        if(lista.remove(object)) {
            Serializar.serializar("alunos.ser", lista);
            return true;
        }
        return false;
    }
}
