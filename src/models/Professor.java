package models;

public class Professor {
    private String nome, email, areaDeInteresse, sugestao;
    private boolean orientador;

    public Professor(String nome, String email, String areaDeInteresse, String Sugestao, boolean orientador) {
        this.nome = nome;
        this.email = email;
        this.areaDeInteresse = areaDeInteresse;
        this.sugestao = Sugestao;
        this.orientador = orientador;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAreaDeInteresse() {
        return areaDeInteresse;
    }

    public void setAreaDeInteresse(String areaDeInteresse) {
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
}
