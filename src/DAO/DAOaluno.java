package DAO;
import models.Aluno;
public class DAOaluno extends DAO<Aluno>{
    
    public boolean update(Aluno object, Aluno newObject) {
        return object.copy(newObject);
    }
    
    //search student by Name
    @Override
    public Aluno search(String name) {
        for(int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equals(name)) {
                return lista.get(i);
            }
        }
        //if don't match...
        return null;
    }
    //search student by Matricula
    public Aluno search(int matricula) {
        for(int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getMatricula() == matricula) {
                return lista.get(i);
            }
        }
        //if don't match...
        return null;
    }
}
