package DAO;
import java.util.ArrayList;
import models.Professor;
import models.Serializar;
public class ProfessorDAO implements DAO<Professor>{ 
    private ArrayList<Professor> lista = Serializar.load("listaProfessores.ser");
    
    public boolean update(Professor object, Professor newObject) {
        if(object.copy(newObject)){
            Serializar.serializar("listaProfessores.ser", lista);
            return true;
        }
        return false;
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

    @Override
    public boolean add(Professor object) {
        if(lista.add(object)){
            Serializar.serializar("listaProfessores.ser", lista);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Professor object) {
        if(lista.remove(object)){
            Serializar.serializar("listaProfessores.ser", lista);
            return true;
        }
        return false;
    }
    
}
