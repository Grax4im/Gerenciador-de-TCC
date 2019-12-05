package DAO;
import java.util.ArrayList;
import models.PropostaTC;
import models.Serializar;
public class PropostaTCDAO implements DAO<PropostaTC>{
    
    ArrayList<PropostaTC> lista = Serializar.load("listaPropostas.ser");
    

    public boolean update(PropostaTC object, PropostaTC newObject) {
         if(object.copy(newObject)){
            Serializar.serializar("listaPropostas.ser", lista);
            return true;
        }
        return false;
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
         if(lista.add(object)){
            Serializar.serializar("listaPropostas.ser", lista);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(PropostaTC object) {
        if(lista.remove(object)){
            Serializar.serializar("listaPropostas.ser", lista);
            return true;
        }
        return false;
    }
}
