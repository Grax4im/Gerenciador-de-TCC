package DAO;

import models.Professor;

public class DAOprofessor extends DAO<Professor>{ 
    @Override
    public boolean update(Professor object, Professor newObject) {
        return object.copy(newObject);
    }
    
    //search teacher by Name
    @Override
    public Professor search(String name) {
        for(int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equals(name)) {
                    return lista.get(i);
            }
        }
        //if don't match...
        return null;
    }
}
