package models;
import java.io.Serializable;
import java.util.Objects;
public class Avaliacao implements Serializable{
    private Aluno aluno;
    private Professor avaliador;
    private String titulo;
    //observacoes de cada topico
    private String usoDaLinguagemObs, 
            apresentacaoObs, estruturadoTextoObs,
            conteudoDoTextoObs,relevanciaAdequacaoObs;
    private String parecer;
    //aprovado ou reprovado
    private boolean avaliacao;
    //caso aprovado, conceito de A até C (implementar enum)
    private String conceito;

    public Avaliacao(Aluno aluno, Professor avaliador, String titulo, boolean avaliacao) {
        this.aluno = aluno;
        this.avaliador = avaliador;
        this.titulo = titulo;
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

    public String getUsoDaLinguagemObs() {
        return usoDaLinguagemObs;
    }

    public void setUsoDaLinguagemObs(String usoDaLinguagemObs) {
        this.usoDaLinguagemObs = usoDaLinguagemObs;
    }

    public String getApresentacaoObs() {
        return apresentacaoObs;
    }

    public void setApresentacaoObs(String apresentacaoObs) {
        this.apresentacaoObs = apresentacaoObs;
    }

    public String getEstruturadoTextoObs() {
        return estruturadoTextoObs;
    }

    public void setEstruturadoTextoObs(String estruturadoTextoObs) {
        this.estruturadoTextoObs = estruturadoTextoObs;
    }

    public String getConteudoDoTextoObs() {
        return conteudoDoTextoObs;
    }

    public void setConteudoDoTextoObs(String conteudoDoTextoObs) {
        this.conteudoDoTextoObs = conteudoDoTextoObs;
    }

    public String getRelevanciaAdequacaoObs() {
        return relevanciaAdequacaoObs;
    }

    public void setRelevanciaAdequacaoObs(String relevanciaAdequacaoObs) {
        this.relevanciaAdequacaoObs = relevanciaAdequacaoObs;
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
        hash = 83 * hash + Objects.hashCode(this.usoDaLinguagemObs);
        hash = 83 * hash + Objects.hashCode(this.apresentacaoObs);
        hash = 83 * hash + Objects.hashCode(this.estruturadoTextoObs);
        hash = 83 * hash + Objects.hashCode(this.conteudoDoTextoObs);
        hash = 83 * hash + Objects.hashCode(this.relevanciaAdequacaoObs);
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
        if (!Objects.equals(this.usoDaLinguagemObs, other.usoDaLinguagemObs)) {
            return false;
        }
        if (!Objects.equals(this.apresentacaoObs, other.apresentacaoObs)) {
            return false;
        }
        if (!Objects.equals(this.estruturadoTextoObs, other.estruturadoTextoObs)) {
            return false;
        }
        if (!Objects.equals(this.conteudoDoTextoObs, other.conteudoDoTextoObs)) {
            return false;
        }
        if (!Objects.equals(this.relevanciaAdequacaoObs, other.relevanciaAdequacaoObs)) {
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
                ", titulo=" + titulo + ", usoDaLinguagemObs=" + 
                usoDaLinguagemObs + ", apresentacaoObs=" + apresentacaoObs + 
                ", estruturadoTextoObs=" + estruturadoTextoObs + 
                ", conteudoDoTextoObs=" + conteudoDoTextoObs + 
                ", relevanciaAdequacaoObs=" + relevanciaAdequacaoObs + 
                ", parecer=" + parecer + ", avaliacao=" + avaliacao +
                ", conceito=" + conceito + '}';
    }
    
    public boolean copy(Avaliacao newObject){
        this.aluno = newObject.getAluno();
        this.avaliador = newObject.getAvaliador();
        this.conceito = newObject.getConceito();
        this.titulo = newObject.getTitulo();
        //falta implementar as observações e pareceres(que são opcionais)
        return true;
    }
   
}
