package DAO;
import models.BancaAvaliadora;
import models.Professor;
public class DAOBancaAvaliadora extends DAO<BancaAvaliadora>{
    
    @Override
    public boolean update(BancaAvaliadora object, BancaAvaliadora newObject) {
        return object.copy(newObject);
    }

    //search by professor name
    @Override
    public BancaAvaliadora search(String nameProfessor) {
        for(BancaAvaliadora i : lista) {
            for(Professor j: i.getAvaliador()) {
                if(j.getNome().equals(nameProfessor)) 
                return i;
            }
        }
        return null;
    }
}
