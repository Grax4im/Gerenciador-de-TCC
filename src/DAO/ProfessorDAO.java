package DAO;
import java.util.ArrayList;
import models.Professor;
public class ProfessorDAO implements DAO<Professor>{ 
   
    public boolean update(Professor object, Professor newObject) {
        return object.copy(newObject);
    }
    
    //search teacher by Name
    @Override
    public Professor search(String name) {
        for(Professor i : Professor.listaProfessores) {
            if (i.getNome().equals(name)) {
                    return i;
            }
        }
        //if don't match...
        return null;
    }
    
    public ArrayList<Professor> getLista() {
        return Professor.listaProfessores;
    }

    @Override
    public boolean add(Professor object) {
        return Professor.listaProfessores.add(object);
    }

    @Override
    public boolean remove(Professor object) {
        return Professor.listaProfessores.remove(object);
    }
}
