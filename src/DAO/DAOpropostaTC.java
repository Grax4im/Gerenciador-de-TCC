package DAO;
import java.util.ArrayList;
import models.PropostaTC;
public class DAOpropostaTC extends DAO<PropostaTC>{
    
    @Override
    public boolean update(PropostaTC object, PropostaTC newObject) {
        return object.copy(newObject);
    }

    //search PropostaTC by title
    @Override
    public PropostaTC search(String title) {
        for(PropostaTC i : lista) {
            if (i.getTitulo().equals(title)) {
                return i;
            }
        }
        //if don't match...
        return null;
    }
    public ArrayList<PropostaTC> getLista() {
        return lista;
    }
}
