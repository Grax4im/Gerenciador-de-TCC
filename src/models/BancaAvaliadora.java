package models;
import java.io.Serializable;
import java.util.ArrayList;
public class BancaAvaliadora implements Serializable {
    //array com 3 professores
    private ArrayList<Professor> avaliador = new ArrayList();

    public BancaAvaliadora() {}
    public BancaAvaliadora(Professor a) {
        this.avaliador.add(a);
    }
    public BancaAvaliadora(Professor a, Professor b) {
        this.avaliador.add(a);
        this.avaliador.add(b);
    }
    
    public BancaAvaliadora(Professor a, Professor b, Professor c) {
        this.avaliador.add(a);
        this.avaliador.add(b);
        this.avaliador.add(c);
    }

    public ArrayList<Professor> getAvaliadores() {
        return avaliador;
    }

    public void setAvaliador(Professor avaliador) {
        this.avaliador.add(avaliador);
    }
    
    public boolean copy(BancaAvaliadora anotherObject) {
        this.avaliador = anotherObject.getAvaliadores();
        return true;
    }
    
    
    
    
}
