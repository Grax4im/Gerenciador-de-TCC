package DAO;
import models.Aluno;
public class AlunoDAO implements DAO<Aluno>{

    @Override
    public boolean add(Aluno object) {
        return Aluno.listaAlunos.add(object);
    }
    
    public boolean update(Aluno object, Aluno newObject) {
        return object.copy(newObject);
    }
    
    //search student by Name
    @Override
    public Aluno search(String name) {
        for(Aluno i : Aluno.listaAlunos) {
            if (i.getNome().equals(name)) {
                return i;
            }
        }
        //if don't match...
        return null;
    }
    //search student by Matricula
    public Aluno searchByMatricula(String matricula) {
        for(Aluno i : Aluno.listaAlunos) {
            if (i.getMatricula().equals(matricula)) {
                return i;
            }
        }
        //if don't match...
        return null;
    }

    @Override
    public boolean remove(Aluno object) {
        return Aluno.listaAlunos.remove(object);
    }
}
