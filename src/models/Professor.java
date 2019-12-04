package models;

import java.io.Serializable;
import java.util.ArrayList;

public class Professor implements Comparable, Serializable {
    private String nome, email, sugestao;
    private ArrayList<String> areaDeInteresse;
    private boolean orientador;
    private int cargaTrabalho;
    
    public Professor(String nome, String email, boolean orientador) {
        this.nome = nome;
        this.email = email;
        this.orientador = orientador;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getAreaDeInteresse() {
        return areaDeInteresse;
    }
    
    public String getAreaDeInteresseString() {
        String areaString = "";
        for(String i: areaDeInteresse) {
            if(areaString.isEmpty()) 
                areaString = i;
            else
                areaString += "," + i;
        }
        return areaString;
    }

    public void setAreaDeInteresse(ArrayList areaDeInteresse) {
        this.areaDeInteresse = areaDeInteresse;
    }

    public String getSugestao() {
        return sugestao;
    }

    public void setSugestao(String Sugestao) {
        this.sugestao = Sugestao;
    }

    public boolean isOrientador() {
        return orientador;
    }

    public void setOrientador(boolean orientador) {
        this.orientador = orientador;
    }

    public String getNome() {
        return nome;
    }
    
    public void setCargaTrabalho() {
        this.cargaTrabalho += 1;
    }
    public int getCargaTrabalho() {
        return this.cargaTrabalho;
    }
    
    public String simOuNao() {
        return isOrientador() ? "Sim" : "Não";
    }
    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", email=" + email +
                ", areaDeInteresse=" + areaDeInteresse + ", Sugestao=" +
                sugestao + ", orientador=" + simOuNao() + '}';
    }
    
    public boolean copy(Professor newProfessor) {
        this.nome = newProfessor.getNome();
        this.email = newProfessor.getEmail();
        this.areaDeInteresse = newProfessor.getAreaDeInteresse();
        this.sugestao = newProfessor.getSugestao();
        this.orientador = newProfessor.isOrientador();
        return true;
    }

    @Override
    public int compareTo(Object outroProfessor) {
        Professor outroProf = (Professor)outroProfessor; 
        if(this.cargaTrabalho < outroProf.getCargaTrabalho()) {
            return -1;
        }
        if(this.cargaTrabalho > outroProf.getCargaTrabalho()) {
            return 1;
        }
        
        return 0;
    }
}
