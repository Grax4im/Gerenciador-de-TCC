package DAO;
import models.Avaliacao;
public class DAOavaliacao extends DAO<Avaliacao>{
    
    @Override
    //busca avaliação por nome do Avaliador
    public Avaliacao search(String nomeAvaliador) {
        for(Avaliacao i : lista) {
            if(i.getAvaliador().getNome().equals(nomeAvaliador)) return i;
        }
        //se não encontrar
        return null;
    }
}