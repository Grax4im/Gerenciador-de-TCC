package models;

public class Aluno {
    private String nome, email, telefone;
    private int matricula;
    
    public Aluno (String nome, int matricula, String email, String telefone) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getMatricula() {
        return matricula;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno:" + this.nome + "\nMatricula:" + this.matricula + 
                "\nEmail:" + this.email + "\nTelefone:" + this.telefone; 
    }
    
    public boolean copy(Aluno novoAluno) {
        this.nome= novoAluno.nome;
        this.matricula = novoAluno.matricula;
        this.email = novoAluno.email;
        this.telefone = novoAluno.email;
        return true;
    }
    
}
