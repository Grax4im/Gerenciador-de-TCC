package models;
import java.io.Serializable;
public class Aluno implements Serializable {
    private String nome, email, telefone,matricula;
    
    public Aluno (String nome, String matricula, String email, String telefone) {
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

    public String getMatricula() {
        return matricula;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setMatricula(String matricula) {
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
