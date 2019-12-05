package DAO;
import java.util.ArrayList;
import models.BancaAvaliadora;
import models.Professor;
public class BancaAvaliadoraDAO implements DAO<BancaAvaliadora>{
    
    public boolean update(BancaAvaliadora object, BancaAvaliadora newObject) {
        return object.copy(newObject);
    }

    //search by professor name
    @Override
    public BancaAvaliadora search(String nameProfessor) {
        for(BancaAvaliadora i : BancaAvaliadora.listaBancas) {
            for(Professor j: i.getAvaliadores()) {
                if(j.getNome().equals(nameProfessor)) 
                return i;
            }
        }
        return null;
    }
    
    public ArrayList<BancaAvaliadora> getLista() {
        return BancaAvaliadora.listaBancas;
    }

    @Override
    public boolean add(BancaAvaliadora object) {
        return BancaAvaliadora.listaBancas.add(object);
    }

    @Override
    public boolean remove(BancaAvaliadora object) {
        return BancaAvaliadora.listaBancas.remove(object);
    }
}
