package DAO;
import java.util.ArrayList;
import models.BancaAvaliadora;
import models.Professor;
import models.Serializar;
public class BancaAvaliadoraDAO implements DAO<BancaAvaliadora>{
    
    private ArrayList<BancaAvaliadora> lista = Serializar.load("listaBancas.ser");
    
    public boolean update(BancaAvaliadora object, BancaAvaliadora newObject) {
        if(object.copy(newObject)){
            Serializar.serializar("listaBancas.ser", lista);
            return true;
        }
        return false;
    }

    //search by professor name
    @Override
    public BancaAvaliadora search(String nameProfessor) {
        for(BancaAvaliadora i : lista) {
            for(Professor j: i.getAvaliadores()) {
                if(j.getNome().equals(nameProfessor)) 
                return i;
            }
        }
        return null;
    }
    
    public ArrayList<BancaAvaliadora> getLista() {
        return lista;
    }

    @Override
    public boolean add(BancaAvaliadora object) {
        if(lista.add(object)){
            Serializar.serializar("listaBancas.ser", lista);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(BancaAvaliadora object) {
        if(lista.remove(object)){
            Serializar.serializar("listaBancas.ser", lista);
            return true;
        }
        return false;
    }
}
