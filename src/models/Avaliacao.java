package models;
import java.io.Serializable;
import java.util.Objects;
public class Avaliacao implements Serializable{
    private Aluno aluno;
    private Professor orientador;
    private Professor avaliador;
    private String titulo;
    private String parecer;
    private boolean avaliacao;
    private String conceito;

    public Avaliacao(PropostaTC proposta,Professor avaliador, boolean avaliacao) {
        this.aluno = proposta.getAutor();
        this.avaliador = avaliador;
        this.titulo = proposta.getTitulo();
        this.avaliacao = avaliacao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(Professor avaliador) {
        this.avaliador = avaliador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getParecer() {
        return parecer;
    }

    public void setParecer(String parecer) {
        this.parecer = parecer;
    }

    public boolean isAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(boolean avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getConceito() {
        return conceito;
    }

    public void setConceito(String conceito) {
        this.conceito = conceito;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.aluno);
        hash = 83 * hash + Objects.hashCode(this.avaliador);
        hash = 83 * hash + Objects.hashCode(this.titulo);
        hash = 83 * hash + Objects.hashCode(this.parecer);
        hash = 83 * hash + (this.avaliacao ? 1 : 0);
        hash = 83 * hash + Objects.hashCode(this.conceito);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Avaliacao other = (Avaliacao) obj;
        if (this.avaliacao != other.avaliacao) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.parecer, other.parecer)) {
            return false;
        }
        if (!Objects.equals(this.conceito, other.conceito)) {
            return false;
        }
        if (!Objects.equals(this.aluno, other.aluno)) {
            return false;
        }
        if (!Objects.equals(this.avaliador, other.avaliador)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Avaliacao{" + "aluno=" + aluno + ", avaliador=" + avaliador + 
                ", titulo=" + titulo +
                ", parecer=" + parecer + ", avaliacao=" + avaliacao +
                ", conceito=" + conceito + '}';
    }
}
