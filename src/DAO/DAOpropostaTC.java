package DAO;
import models.PropostaTC;
public class DAOpropostaTC extends DAO<PropostaTC>{

    @Override
    public boolean update(PropostaTC object, PropostaTC newObject) {
        return object.copy(newObject);
    }

    //search PropostaTC by title
    @Override
    public PropostaTC search(String title) {
        for(int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getTitulo().equals(title)) {
                return lista.get(i);
            }
        }
        //if don't match...
        return null;
    }
    
    
    
}
