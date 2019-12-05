package models;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serializar {
     public static void serializar(String arquivo, ArrayList lista) {
        try {
            FileOutputStream fos = new FileOutputStream(arquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            fos.close();
            oos.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
     
    public static ArrayList load (String arquivo){
        ArrayList lista = new ArrayList();
        
        try {
            FileInputStream fis = new FileInputStream(arquivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object listaRetorno = ois.readObject();
            lista = (ArrayList)listaRetorno;
            return lista;
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return lista;
    }
}
