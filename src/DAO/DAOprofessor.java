package DAO;
import java.util.ArrayList;
import models.Professor;
public class DAOprofessor extends DAO<Professor>{ 
    
    @Override
    public boolean update(Professor object, Professor newObject) {
        return object.copy(newObject);
    }
    
    //search teacher by Name
    @Override
    public Professor search(String name) {
        for(Professor i : lista) {
            if (i.getNome().equals(name)) {
                    return i;
            }
        }
        //if don't match...
        return null;
    }
    
    public ArrayList<Professor> getLista() {
        return lista;
    }
}
