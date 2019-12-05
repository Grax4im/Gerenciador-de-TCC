package DAO;
import java.util.ArrayList;
import models.Avaliacao;
import models.Serializar;
public class AvaliacaoDAO implements DAO<Avaliacao>{
    
    private ArrayList<Avaliacao> lista = new ArrayList();
    
    @Override
    //busca avaliação por nome do Avaliador
    public Avaliacao search(String nomeAvaliador) {
        for(Avaliacao i : lista) {
            if(i.getAvaliador().getNome().equals(nomeAvaliador)) return i;
        }
        //se não encontrar
        return null;
    }

    @Override
    public boolean add(Avaliacao object) {
    
    if(lista.add(object)){
            Serializar.serializar("listaAvaliacoes.ser", lista);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Avaliacao object) {
        if(lista.remove(object)){
            Serializar.serializar("listaAvaliacoes.ser", lista);
            return true;
        }
        return false;
    }
}