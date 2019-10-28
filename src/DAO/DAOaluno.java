package DAO;
import models.Aluno;
public class DAOaluno extends DAO<Aluno>{
    
    @Override
    public boolean update(Aluno object, Aluno newObject) {
        return object.copy(newObject);
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
    public Aluno search(int matricula) {
        for(Aluno i : lista) {
            if (i.getMatricula() == matricula) {
                return i;
            }
        }
        //if don't match...
        return null;
    }
}
