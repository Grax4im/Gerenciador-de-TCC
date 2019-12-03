package models;
public class PropostaTC {
    private String titulo;
    private Aluno autor;
    private Professor orientador;
    private String areaDoProjeto;

    public PropostaTC(String titulo, Aluno autor, Professor orientador, String area) {
        this.titulo = titulo;
        this.autor = autor;
        this.orientador = orientador;
        this.areaDoProjeto = area;
    }

    public String getAreaDoProjeto() {
        return areaDoProjeto;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno getAutor() {
        return autor;
    }

    public void setAutor(Aluno autor) {
        this.autor = autor;
    }

    public Professor getOrientador() {
        return orientador;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }

    @Override
    public String toString() {
        return "PropostaTC{" + "titulo=" + titulo + ", autor=" + autor + ", orientador=" + orientador + '}';
    }    
    
    public boolean copy(PropostaTC newPropostaTC) {
        this.titulo = newPropostaTC.getTitulo();
        this.autor = newPropostaTC.getAutor();
        this.orientador = newPropostaTC.getOrientador();
        return true;
    }
    
}
