package DAO;
import java.util.ArrayList;

public abstract class DAO<Object> {
    ArrayList<Object> lista = new ArrayList();
    
    public boolean add(Object object) {
        return lista.add(object);
    }
    
    public boolean remove(Object object) {
        return lista.remove(object);
    }
    //Como implementar a busca?
    public Object search(String pesquisa) {
        Object resultado = null;
        //implementar a pesquisa aqui
        return resultado;
    }
    // Como implementar a atualização? 
    // (Utilizar getters e setters de cada Objeto)
    public boolean update(Object object, Object newObject) {
       return false;
    }
}
