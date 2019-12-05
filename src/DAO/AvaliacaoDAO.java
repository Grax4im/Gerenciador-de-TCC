package DAO;
import models.Avaliacao;
public class AvaliacaoDAO implements DAO<Avaliacao>{
    
    @Override
    //busca avaliação por nome do Avaliador
    public Avaliacao search(String nomeAvaliador) {
        for(Avaliacao i : Avaliacao.listaAvaliacoes) {
            if(i.getAvaliador().getNome().equals(nomeAvaliador)) return i;
        }
        //se não encontrar
        return null;
    }

    @Override
    public boolean add(Avaliacao object) {
        return Avaliacao.listaAvaliacoes.add(object);
    }

    @Override
    public boolean remove(Avaliacao object) {
        return Avaliacao.listaAvaliacoes.remove(object);
    }
}