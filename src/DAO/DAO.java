package DAO;
import java.util.ArrayList;

public interface DAO<Object> {    
    public boolean add(Object object);
    
    public boolean remove(Object object);
    //Como implementar a busca?
    public Object search(String pesquisa);
}
