package DAO;
import java.util.ArrayList;
import models.PropostaTC;
public class PropostaTCDAO implements DAO<PropostaTC>{
    
    ArrayList<PropostaTC> lista = PropostaTC.listaPropostas;
    

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
        return null;
    }
    public ArrayList<PropostaTC> getLista() {
        return lista;
    }

    @Override
    public boolean add(PropostaTC object) {
        return lista.add(object);
    }

    @Override
    public boolean remove(PropostaTC object) {
        return lista.remove(object);
    }
}
